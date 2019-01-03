package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TMachine;
import java.util.List;

public interface TMachineMapper {
    int deleteByPrimaryKey(Integer machineId);

    int insert(TMachine record);

    TMachine selectByPrimaryKey(Integer machineId);

    List<TMachine> selectAll();

    int updateByPrimaryKey(TMachine record);
}