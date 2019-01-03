package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Machine;
import java.util.List;

public interface MachineDao {
    int deleteByPrimaryKey(Integer machineId);

    int insert(Machine record);

    Machine selectByPrimaryKey(Integer machineId);

    List<Machine> selectAll();

    int updateByPrimaryKey(Machine record);
}