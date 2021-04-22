package xyz.xiaoye.springbootdemo03.service.user.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xiaoye.springbootdemo03.dao.user.UserRegisDao;
import xyz.xiaoye.springbootdemo03.entity.user.UserRegis;
import xyz.xiaoye.springbootdemo03.service.user.UserRegisService;

@Service
public class UserRegisServiceImpl implements UserRegisService {
    @Autowired
    private UserRegisDao userRegisDao;

    @Override
    public boolean regis(String username,String password) {
        UserRegis userRegis = new UserRegis();
        userRegis.setUserName(username);
        userRegis.setUserPwd(password);

        UserRegis user = userRegisDao.regisUser ( userRegis );
        if (user != null){
            return true;
        }

        return false;
    }

}
