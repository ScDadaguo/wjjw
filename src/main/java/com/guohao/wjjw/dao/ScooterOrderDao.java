package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.ScooterOrder;
import java.util.List;

public interface ScooterOrderDao {
    int deleteByPrimaryKey(Integer scooterOrderId);

    int insert(ScooterOrder record);

    ScooterOrder selectByPrimaryKey(Integer scooterOrderId);

    List<ScooterOrder> selectAll();

    int updateByPrimaryKey(ScooterOrder record);
}