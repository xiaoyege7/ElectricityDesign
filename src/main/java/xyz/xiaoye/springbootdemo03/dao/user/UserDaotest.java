package xyz.xiaoye.springbootdemo03.dao.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xyz.xiaoye.springbootdemo03.entity.UserEntity;

@Mapper
@Component("UserDaotest")
public interface UserDaotest {
    UserEntity selectUser(UserEntity userEntity);
}
