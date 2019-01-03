package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Work;
import java.util.List;

public interface WorkDao {
    int deleteByPrimaryKey(Integer workId);

    int insert(Work record);

    Work selectByPrimaryKey(Integer workId);

    List<Work> selectAll();

    int updateByPrimaryKey(Work record);
}