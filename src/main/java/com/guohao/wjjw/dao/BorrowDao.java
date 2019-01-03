package com.guohao.wjjw.dao;

import com.guohao.wjjw.entity.Borrow;
import java.util.List;

public interface BorrowDao {
    int deleteByPrimaryKey(Integer borrowOrder);

    int insert(Borrow record);

    Borrow selectByPrimaryKey(Integer borrowOrder);

    List<Borrow> selectAll();

    int updateByPrimaryKey(Borrow record);
}