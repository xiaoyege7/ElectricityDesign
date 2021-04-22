package xyz.xiaoye.springbootdemo03.entity;

import java.util.Date;

public class RoomUserEntity {
    //主键
    private Integer id;
    //唯一标识，openid
    private String roomUnique;
    // 用户名
    private String roomUser;
    // 创建时间
    private Date createTime;

    public RoomUserEntity() {
    }

    public RoomUserEntity(Integer id, String roomUnique, String roomUser, Date createTime) {
        this.id = id;
        this.roomUnique = roomUnique;
        this.roomUser = roomUser;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomUnique() {
        return roomUnique;
    }

    public void setRoomUnique(String roomUnique) {
        this.roomUnique = roomUnique;
    }

    public String getRoomUser() {
        return roomUser;
    }

    public void setRoomUser(String roomUser) {
        this.roomUser = roomUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
