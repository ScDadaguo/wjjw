package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.TBorrow;
import java.util.List;

public interface TBorrowMapper {
    int deleteByPrimaryKey(Integer borrowOrder);

    int insert(TBorrow record);

    TBorrow selectByPrimaryKey(Integer borrowOrder);

    List<TBorrow> selectAll();

    int updateByPrimaryKey(TBorrow record);
}