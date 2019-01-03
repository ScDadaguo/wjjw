package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TBoss;
import java.util.List;

public interface TBossMapper {
    int deleteByPrimaryKey(Integer bossId);

    int insert(TBoss record);

    TBoss selectByPrimaryKey(Integer bossId);

    List<TBoss> selectAll();

    int updateByPrimaryKey(TBoss record);
}