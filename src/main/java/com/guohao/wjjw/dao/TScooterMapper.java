package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TScooter;
import java.util.List;

public interface TScooterMapper {
    int deleteByPrimaryKey(Integer scooterId);

    int insert(TScooter record);

    TScooter selectByPrimaryKey(Integer scooterId);

    List<TScooter> selectAll();

    int updateByPrimaryKey(TScooter record);
}