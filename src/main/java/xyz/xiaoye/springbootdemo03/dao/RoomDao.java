package xyz.xiaoye.springbootdemo03.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xyz.xiaoye.springbootdemo03.entity.RoomEntity;

@Mapper
@Component("RoomDao")
public interface RoomDao {
    //根据房间号查找房间
    RoomEntity queryRoom(RoomEntity roomEntity);
    //获取信息，新建一个房间
    int createRoom(RoomEntity roomEntity);
}
