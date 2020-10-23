package com.itheima.health.service;

import com.itheima.health.pojo.CheckItem;

import java.util.List;

public interface CheckItemService {


    List<CheckItem> findAll();

    /**
     * 添加检查项
     * @param checkItem
     */
    void add(CheckItem checkItem);
    
    


}
