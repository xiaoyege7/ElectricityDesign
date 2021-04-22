package xyz.xiaoye.springbootdemo03.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import xyz.xiaoye.springbootdemo03.entity.Area;

import java.util.List;

@Mapper
@Component("AreaDao")
public interface AreaDao {
    /**
     * 列出区域列表
     */
    List<Area> queryArea();

    /**
     * 根据Id列出具体区域
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     */
    int updateArea(Area area);

    /**
     * 删除区域信息
     */
    int deleteArea(int areaId);
}
