package xyz.xiaoye.springbootdemo03.service.user.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xiaoye.springbootdemo03.dao.RoomDao;
import xyz.xiaoye.springbootdemo03.dao.RoomUserDao;
import xyz.xiaoye.springbootdemo03.dao.UserDao;
import xyz.xiaoye.springbootdemo03.entity.RoomEntity;
import xyz.xiaoye.springbootdemo03.entity.RoomUserEntity;
import xyz.xiaoye.springbootdemo03.entity.UserEntity;
import xyz.xiaoye.springbootdemo03.service.user.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserDao loginDao;
    @Autowired
    private RoomDao roomDao;
    @Autowired
    private RoomUserDao roomUserDao;

    @Override
    public boolean getUser(String openId){
        //接收到openid后实例化一个User的实体来存放
        UserEntity userEntity = new UserEntity();
        userEntity.setUserUnique(openId);
        //判断从服务器请求的数据是否
        UserEntity user = loginDao.queryUser(userEntity);
        if(openId.equals(user.getUserUnique())){
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(UserEntity userEntity){
        //利用持久层写入新的用户
        loginDao.createUser(userEntity);
        //查询用户是否创建成功
        UserEntity user = loginDao.queryUser(userEntity);

        //判断用户是否创建成功
        if(userEntity.getUserUnique().equals(user.getUserUnique())){
            return true;
        }
        return false;
    }

    @Override
    public boolean addRoom(RoomEntity roomEntity){
        //利用持久层新建新的房间
        roomDao.createRoom(roomEntity);

        RoomEntity room = roomDao.queryRoom(roomEntity);

        if(roomEntity.getRoomUnique().equals(room.getRoomUnique())){
            return true;
        }
        return false;
    }

    @Override
    public boolean addUserRoom(RoomUserEntity roomUserEntity){
        System.out.println("dafd");

        roomUserDao.addRoomUser(roomUserEntity);
        System.out.println("dafd");

        RoomUserEntity roomUser = roomUserDao.queryRoomUser(roomUserEntity);
        System.out.println(roomUserEntity.getRoomUnique());
        System.out.println(roomUser.getRoomUnique());

        if(roomUserEntity.getRoomUnique().equals(roomUser.getRoomUnique())){
            return true;
        }
        System.out.println("dafd");

        return false;
    }
}
