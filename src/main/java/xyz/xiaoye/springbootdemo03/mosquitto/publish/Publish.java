package xyz.xiaoye.springbootdemo03.mosquitto.publish;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

@Slf4j
public class Publish{
    //主题名
    String topic;
    //消息内容
    String content;
    //QoS服务质量等级
    int qos;

    public Publish() {
        //主题名
        String topic = "开关控制";
        //消息内容
        String content = "hello 哈哈";
        //QoS服务质量等级
        int qos = 1;
    }

    public Publish(String topic, String content, int qos) {
        this.topic = topic;
        this.content = content;
        this.qos = qos;
    }

    //定义一个发布方法
    public  void pub() {

        //主题名
        String topic = "开关控制";
        //消息内容
        String content = "hello 哈哈";
        //QoS服务质量等级
        int qos = 1;
        //访问服务器地址
        String broker = "tcp://47.106.222.97:1883";
        //账号
        String userName = "root";
        //密码
        String password = "123456";
        String clientId = "pubClient";
        // 内存存储
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            // 创建客户端
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            // 创建链接参数
            MqttConnectOptions connOpts = new MqttConnectOptions();
            // 在重新启动和重新连接时记住状态
            connOpts.setCleanSession(false);
            // 设置连接的用户名
            connOpts.setUserName(userName);
            connOpts.setPassword(password.toCharArray());
            // 建立连接
            sampleClient.connect(connOpts);
            // 创建消息
            MqttMessage message = new MqttMessage(content.getBytes());
            // 设置消息的服务质量
            message.setQos(qos);
            // 发布消息
            sampleClient.publish(topic, message);
            // 断开连接
            sampleClient.disconnect();
            // 关闭客户端
            sampleClient.close();

        }
        //异常抛出
        catch (MqttException m) {
            System.out.println("reason " + m.getReasonCode());
            System.out.println("msg " + m.getMessage());
            System.out.println("loc " + m.getLocalizedMessage());
            System.out.println("cause " + m.getCause());
            System.out.println("excep " + m);
            m.printStackTrace();
        }
    }
}
