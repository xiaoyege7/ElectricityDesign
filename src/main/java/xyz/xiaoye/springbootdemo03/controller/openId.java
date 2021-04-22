//package xyz.xiaoye.springbootdemo03.controller;
//
//import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class openId {
//    @Autowired
//    private openIdService weChatService;
//
//    @PostMapping("/getOpenid")
//    public ResponseMessage getOpenid(@RequestBody RequestMessage requestMessage){
//        String code = requestMessage.getBody().getCode();
//        return weChatService.getOpenid(requestMessage);
//    }
//}
