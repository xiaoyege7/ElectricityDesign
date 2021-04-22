package xyz.xiaoye.springbootdemo03.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xyz.xiaoye.springbootdemo03.entity.UserEntity;

@Mapper
@Component("UserDao")
public interface UserDao {
    //获取到openid后，查询数据库中是否有该openid
    UserEntity queryUser(UserEntity userEntity);
    //获得用户允许后，在数据库中创建用户
    int createUser(UserEntity userEntity);
    //根据openid删除用户
    UserEntity deleteUser(UserEntity userEntity);
    //根据openid更改用户信息
    UserEntity updateUser(UserEntity userEntity);

}
