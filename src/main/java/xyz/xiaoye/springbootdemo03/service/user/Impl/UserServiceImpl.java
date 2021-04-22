package xyz.xiaoye.springbootdemo03.service.user.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xiaoye.springbootdemo03.dao.user.UserDaotest;
import xyz.xiaoye.springbootdemo03.entity.UserEntity;
import xyz.xiaoye.springbootdemo03.service.user.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaotest userDao;

    @Override
    public boolean login(String username,String password){
        UserEntity userEntity = new UserEntity ();
        userEntity.setUserName(username);

        UserEntity user = userDao.selectUser ( userEntity );
        if (user != null){
            return true;
        }

        return false;
    }
}
