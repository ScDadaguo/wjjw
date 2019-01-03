package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TScooterOrder;
import java.util.List;

public interface TScooterOrderMapper {
    int deleteByPrimaryKey(Integer scooterOrderId);

    int insert(TScooterOrder record);

    TScooterOrder selectByPrimaryKey(Integer scooterOrderId);

    List<TScooterOrder> selectAll();

    int updateByPrimaryKey(TScooterOrder record);
}