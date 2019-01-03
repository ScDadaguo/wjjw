package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.DriverSalary;
import java.util.List;

public interface DriverSalaryDao {
    int deleteByPrimaryKey(Integer payOrderId);

    int insert(DriverSalary record);

    DriverSalary selectByPrimaryKey(Integer payOrderId);

    List<DriverSalary> selectAll();

    int updateByPrimaryKey(DriverSalary record);
}