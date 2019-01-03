package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Selina;
import java.util.List;

public interface SelinaDao {
    int deleteByPrimaryKey(Integer selinaOrder);

    int insert(Selina record);

    Selina selectByPrimaryKey(Integer selinaOrder);

    List<Selina> selectAll();

    int updateByPrimaryKey(Selina record);
}