package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TSelina;
import java.util.List;

public interface TSelinaMapper {
    int deleteByPrimaryKey(Integer selinaOrder);

    int insert(TSelina record);

    TSelina selectByPrimaryKey(Integer selinaOrder);

    List<TSelina> selectAll();

    int updateByPrimaryKey(TSelina record);
}