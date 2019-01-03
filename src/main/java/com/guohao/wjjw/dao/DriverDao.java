package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Driver;
import java.util.List;

public interface DriverDao {
    int deleteByPrimaryKey(Integer driverId);

    int insert(Driver record);

    Driver selectByPrimaryKey(Integer driverId);

    List<Driver> selectAll();

    int updateByPrimaryKey(Driver record);
}