package xyz.xiaoye.springbootdemo03.entity;

import java.util.Date;

public class UserEntity {
    //主键
    private Integer id;
    //唯一标识，openid
    private String userUnique;
    // 用户名
    private String userName;
    // 创建时间
    private Date createTime;

    public UserEntity() {
    }

    public UserEntity(Integer id, String userUnique, String userName, Date createTime) {
        this.id = id;
        this.userUnique = userUnique;
        this.userName = userName;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserUnique() {
        return userUnique;
    }

    public void setUserUnique(String userUnique) {
        this.userUnique = userUnique;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
