//package xyz.xiaoye.springbootdemo03.service;
//
//import com.alibaba.fastjson.JSON;
//import com.github.kevinsawicki.http.HttpRequest;
//import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
//import org.json.JSONObject;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.Map;
//@Service
//public class openIdService {
//    private final static String APPID="";
//    private final static String SECRET_KEY="";
//
//    public void getOpenid(RequestMessage requestMessage) {
//        Map<String, String> data = new HashMap<String, String>();
//        data.put("appid", APPID);
//        data.put("secret", SECRET_KEY);
//        data.put("js_code", requestMessage.getBody().getCode());
//        data.put("grant_type", "authorization_code");
//        String response = HttpRequest.get("https://api.weixin.qq.com/sns/jscode2session").form(data).body();
//        System.out.println("Response was: " + response);
//
//    }
//}
