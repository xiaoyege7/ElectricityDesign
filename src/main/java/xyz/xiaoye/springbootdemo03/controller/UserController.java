package xyz.xiaoye.springbootdemo03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.xiaoye.springbootdemo03.entity.RoomEntity;
import xyz.xiaoye.springbootdemo03.entity.RoomUserEntity;
import xyz.xiaoye.springbootdemo03.entity.UserEntity;
import xyz.xiaoye.springbootdemo03.service.user.LoginService;
import xyz.xiaoye.springbootdemo03.utils.GetOpenid;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")  //指定根路由
public class UserController {
    @Autowired
    private LoginService loginService;

    /**
     * 自动登录
     * @param code
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map<String, Object> userLogin(@RequestParam("code") String code) throws IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();

        //使用获取openid类获取openid并返回
        GetOpenid getOpenid = new GetOpenid();//实例化一个getopenid类
        String openId = getOpenid.getopenid(code);//获取code值

        //根据code查询是否有改用户，返回1表示已近成功登录
        if (loginService.getUser(openId)){
            modelMap.put("status",1);
            modelMap.put("openId",openId);
        }else{//若没成功登录，则返回2表示未注册用户
            modelMap.put("status",2);
            modelMap.put("openId",null);
        }

        return modelMap;
    }

    @RequestMapping(value = "/regis", method = RequestMethod.POST)
    public Map<String, Object> userRegis(@RequestParam("code") String code,
                         @RequestParam("isNewRoom") int isNewRoom,
                         @RequestParam("roomUnique") String roomUnique,
                         @RequestParam("userName")String userName,
                         @RequestParam("roomNickname")String roomNickname
                                                            )throws IOException{
        Map<String, Object> modelMap = new HashMap<String, Object>();

        UserEntity userEntity = new UserEntity();
        RoomEntity roomEntity = new RoomEntity();
        RoomUserEntity roomUserEntity = new RoomUserEntity();
        //使用获取openid类获取openid并返回
        GetOpenid getOpenid = new GetOpenid();//实例化一个getopenid类
        String openId = getOpenid.getopenid(code);//获取code值
        //将各个实体注入
        userEntity.setUserUnique(openId);
        userEntity.setUserName(userName);
        userEntity.setCreateTime(new Date());

        roomEntity.setRoomMaster(openId);
        roomEntity.setRoomNickname(roomNickname);
        roomEntity.setRoomUnique(roomUnique);

        roomUserEntity.setRoomUnique(roomUnique);
        roomUserEntity.setRoomUser(openId);
        roomUserEntity.setCreateTime(new Date());

        boolean isRegis = loginService.addUser(userEntity);
        //返回异常
        if(!isRegis){
            modelMap.put("status",4);
            modelMap.put("openId",null);
            return modelMap;
        }

        //创建一个新的家庭组
        boolean isAddRoom = false;
        //加入已有家庭组
        boolean isAddRoomUser = false;
        switch (isNewRoom){
            case 1:
                isAddRoom = loginService.addRoom(roomEntity);
                if(!isAddRoom){
                    modelMap.put("status",2);
                    modelMap.put("openId",null);
                    return modelMap;
                }
                break;
            case 0:
                System.out.println("dfadfs");
                isAddRoomUser = loginService.addUserRoom(roomUserEntity);
                System.out.println("dfadfs");

                if(!isAddRoomUser){
                    modelMap.put("status",3);
                    modelMap.put("openId",null);
                    System.out.println("dfadfs");

                    return modelMap;
                }
                break;
        }

        //成功注册
        if((isAddRoom||isAddRoomUser)&&isRegis){
            modelMap.put("status",1);
            modelMap.put("openId",openId);
        }else{
            modelMap.put("status",5);
            modelMap.put("openId",null);
        }
        return modelMap;
    }

}
