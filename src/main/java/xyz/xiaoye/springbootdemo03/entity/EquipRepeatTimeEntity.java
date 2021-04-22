package xyz.xiaoye.springbootdemo03.entity;

import java.util.Date;

public class EquipRepeatTimeEntity {
    //主键
    private Integer id;
    //房间标识
    private String timeUnique;
    // 房主
    private String equipmentUnique;
    //修改状态
    private int operateState;
    //时间
    private Date time;
    //重复日期
    private int date1;
    private int date2;
    private int date3;
    private int date4;
    private int date5;
    private int date6;
    private int date7;

    public EquipRepeatTimeEntity() {
    }

    public EquipRepeatTimeEntity(Integer id, String timeUnique, String equipmentUnique, int operateState, Date time, int date1, int date2, int date3, int date4, int date5, int date6, int date7) {
        this.id = id;
        this.timeUnique = timeUnique;
        this.equipmentUnique = equipmentUnique;
        this.operateState = operateState;
        this.time = time;
        this.date1 = date1;
        this.date2 = date2;
        this.date3 = date3;
        this.date4 = date4;
        this.date5 = date5;
        this.date6 = date6;
        this.date7 = date7;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimeUnique() {
        return timeUnique;
    }

    public void setTimeUnique(String timeUnique) {
        this.timeUnique = timeUnique;
    }

    public String getEquipmentUnique() {
        return equipmentUnique;
    }

    public void setEquipmentUnique(String equipmentUnique) {
        this.equipmentUnique = equipmentUnique;
    }

    public int getOperateState() {
        return operateState;
    }

    public void setOperateState(int operateState) {
        this.operateState = operateState;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getDate1() {
        return date1;
    }

    public void setDate1(int date1) {
        this.date1 = date1;
    }

    public int getDate2() {
        return date2;
    }

    public void setDate2(int date2) {
        this.date2 = date2;
    }

    public int getDate3() {
        return date3;
    }

    public void setDate3(int date3) {
        this.date3 = date3;
    }

    public int getDate4() {
        return date4;
    }

    public void setDate4(int date4) {
        this.date4 = date4;
    }

    public int getDate5() {
        return date5;
    }

    public void setDate5(int date5) {
        this.date5 = date5;
    }

    public int getDate6() {
        return date6;
    }

    public void setDate6(int date6) {
        this.date6 = date6;
    }

    public int getDate7() {
        return date7;
    }

    public void setDate7(int date7) {
        this.date7 = date7;
    }
}

