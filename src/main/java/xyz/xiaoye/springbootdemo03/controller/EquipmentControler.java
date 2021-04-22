package xyz.xiaoye.springbootdemo03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.xiaoye.springbootdemo03.mosquitto.publish.Publish;

@RestController
@RequestMapping("/equipment")//指定根路由
public class EquipmentControler {

    @RequestMapping(value = "/control",method = RequestMethod.POST)
    private int equipController(@RequestParam("equipmentUnique") String equipmentUnique,
                                @RequestParam("status") boolean status
                                    ){
        String topic = "topic "+equipmentUnique;
        String content = null;
        content=status?"open":"close";
        Publish publishSample=new Publish(topic,content,1);
        publishSample.pub();
        return 1;
    }
}
