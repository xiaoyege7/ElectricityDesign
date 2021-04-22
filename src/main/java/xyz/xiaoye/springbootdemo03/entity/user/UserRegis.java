package xyz.xiaoye.springbootdemo03.entity.user;

public class UserRegis {
    //主键
    private Integer id;
    // 用户名
    private String userName;
    // 用户密码
    private String userPwd;

    public UserRegis() {
    }

    public UserRegis(Integer id, String userName, String userPwd) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
