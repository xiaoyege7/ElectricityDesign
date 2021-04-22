package xyz.xiaoye.springbootdemo03.entity;

public class RoomEquipmentEntity {
    //主键
    private Integer id;
    //房间标识
    private String roomUnique;
    // 设备标识
    private String equipmentUnique;

    public RoomEquipmentEntity() {
    }

    public RoomEquipmentEntity(Integer id, String roomUnique, String equipmentUnique) {
        this.id = id;
        this.roomUnique = roomUnique;
        this.equipmentUnique = equipmentUnique;
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

    public String getEquipmentUnique() {
        return equipmentUnique;
    }

    public void setEquipmentUnique(String equipmentUnique) {
        this.equipmentUnique = equipmentUnique;
    }
}
