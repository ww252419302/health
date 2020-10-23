package com.itheima.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 体检检查项管理
 */
@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;


 //查询所有

    @GetMapping("/findAll")
    public Result findAll(){
        // 调用服务查询所有的检查项
        List<CheckItem> list = checkItemService.findAll();
        // 封装返回的结果
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS,list);
    }

    /**
     * 新增
     * @param checkItem 接收前端提交过来的formData
     * @return
     */

    /**
     * 体检检查项管理
     */
  @PostMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){

      //调用服务添加
      checkItemService.add(checkItem);
      return new Result(true,MessageConstant.ADD_CHECKGROUP_SUCCESS);

  }

}
