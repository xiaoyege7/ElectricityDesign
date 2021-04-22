package xyz.xiaoye.springbootdemo03.entity;

public class RoomEntity {
    //主键
    private Integer id;
    //房间标识
    private String roomUnique;
    // 房主
    private String roomMaster;
    //房间名称
    private String roomNickname;

    public RoomEntity() {
    }

    public RoomEntity(Integer id, String roomUnique, String roomMaster, String roomNickname) {
        this.id = id;
        this.roomUnique = roomUnique;
        this.roomMaster = roomMaster;
        this.roomNickname = roomNickname;
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

    public String getRoomMaster() {
        return roomMaster;
    }

    public void setRoomMaster(String roomMaster) {
        this.roomMaster = roomMaster;
    }

    public String getRoomNickname() {
        return roomNickname;
    }

    public void setRoomNickname(String roomNickname) {
        this.roomNickname = roomNickname;
    }
}
