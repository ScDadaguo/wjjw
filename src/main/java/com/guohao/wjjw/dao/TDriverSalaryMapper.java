package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TDriverSalary;
import java.util.List;

public interface TDriverSalaryMapper {
    int deleteByPrimaryKey(Integer payOrderId);

    int insert(TDriverSalary record);

    TDriverSalary selectByPrimaryKey(Integer payOrderId);

    List<TDriverSalary> selectAll();

    int updateByPrimaryKey(TDriverSalary record);
}