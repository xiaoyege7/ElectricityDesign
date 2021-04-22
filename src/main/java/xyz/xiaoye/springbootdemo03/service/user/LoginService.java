package xyz.xiaoye.springbootdemo03.service.user;

import xyz.xiaoye.springbootdemo03.entity.RoomEntity;
import xyz.xiaoye.springbootdemo03.entity.RoomUserEntity;
import xyz.xiaoye.springbootdemo03.entity.UserEntity;

public interface LoginService {
    //获取用户是否存在
    boolean getUser(String openId);
    //添加用户
    boolean addUser(UserEntity userEntity);
    //创建房间
    boolean addRoom(RoomEntity roomEntity);
    //为房间增加用户
    boolean addUserRoom(RoomUserEntity roomUserEntity);
}
