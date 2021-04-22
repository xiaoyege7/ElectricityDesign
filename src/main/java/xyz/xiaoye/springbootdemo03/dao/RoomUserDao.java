package xyz.xiaoye.springbootdemo03.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xyz.xiaoye.springbootdemo03.entity.RoomUserEntity;

@Mapper
@Component("RoomUserDao")
public interface RoomUserDao {
    //根据用户查找房间
    RoomUserEntity queryRoomUser(RoomUserEntity roomUserEntity);
    //获取信息，为家庭组增添用户
    int addRoomUser(RoomUserEntity roomUserEntity);

}
