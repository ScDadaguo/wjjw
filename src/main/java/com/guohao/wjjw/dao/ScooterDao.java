package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Scooter;
import java.util.List;

public interface ScooterDao {
    int deleteByPrimaryKey(Integer scooterId);

    int insert(Scooter record);

    Scooter selectByPrimaryKey(Integer scooterId);

    List<Scooter> selectAll();

    int updateByPrimaryKey(Scooter record);
}