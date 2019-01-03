package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TWork;
import java.util.List;

public interface TWorkMapper {
    int deleteByPrimaryKey(Integer workId);

    int insert(TWork record);

    TWork selectByPrimaryKey(Integer workId);

    List<TWork> selectAll();

    int updateByPrimaryKey(TWork record);
}