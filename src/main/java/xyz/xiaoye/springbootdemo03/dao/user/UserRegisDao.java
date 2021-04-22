package xyz.xiaoye.springbootdemo03.dao.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xyz.xiaoye.springbootdemo03.entity.user.UserRegis;

@Mapper
@Component("UserRegisDao")
public interface UserRegisDao {
    UserRegis regisUser(UserRegis userRegis);
}
