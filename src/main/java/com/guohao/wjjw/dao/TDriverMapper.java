package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TDriver;
import java.util.List;

public interface TDriverMapper {
    int deleteByPrimaryKey(Integer driverId);

    int insert(TDriver record);

    TDriver selectByPrimaryKey(Integer driverId);

    List<TDriver> selectAll();

    int updateByPrimaryKey(TDriver record);
}