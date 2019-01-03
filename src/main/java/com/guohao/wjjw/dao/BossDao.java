package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Boss;
import java.util.List;

public interface BossDao {
    int deleteByPrimaryKey(Integer bossId);

    int insert(Boss record);

    Boss selectByPrimaryKey(Integer bossId);

    List<Boss> selectAll();

    int updateByPrimaryKey(Boss record);
}