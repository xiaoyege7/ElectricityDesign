package xyz.xiaoye.springbootdemo03.entity;

public class EquipmentEntity {
    //主键
    private Integer id;
    //设备标识
    private String equipmentUnique;
    // 设备状态
    private String equipmentState;
    //连接状态
    private int equipmentConnectionState;
    //设备名字
    private String nickname;
    //设备描述
    private String describe;

    public EquipmentEntity(Integer id, String equipmentUnique, String equipmentState, int equipmentConnectionState, String nickname, String describe) {
        this.id = id;
        this.equipmentUnique = equipmentUnique;
        this.equipmentState = equipmentState;
        this.equipmentConnectionState = equipmentConnectionState;
        this.nickname = nickname;
        this.describe = describe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentUnique() {
        return equipmentUnique;
    }

    public void setEquipmentUnique(String equipmentUnique) {
        this.equipmentUnique = equipmentUnique;
    }

    public String getEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(String equipmentState) {
        this.equipmentState = equipmentState;
    }

    public int getEquipmentConnectionState() {
        return equipmentConnectionState;
    }

    public void setEquipmentConnectionState(int equipmentConnectionState) {
        this.equipmentConnectionState = equipmentConnectionState;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
