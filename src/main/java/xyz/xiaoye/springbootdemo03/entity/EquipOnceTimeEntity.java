package xyz.xiaoye.springbootdemo03.entity;

import java.util.Date;

public class EquipOnceTimeEntity {
    private Integer id;
    //时间标识
    private String timeUnique;
    // 房主
    private String equipmentUnique;
    //修改状态
    private int operateState;
    //时间
    private Date time;
}
