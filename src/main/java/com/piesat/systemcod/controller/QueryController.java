package com.piesat.systemcod.controller;

import com.piesat.systemcod.mapper.DynamicQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {
    @Autowired
    private DynamicQueryMapper dao;

    //查询所有
    @GetMapping("/get")
    public Object getQuery(String tableName){
        return dao.queryMetaList(tableName);
    }

    //根据条件查询
    @GetMapping("/getById")
    public Object getQuery(String tableName,int item){
        return dao.queryMetaListByItem(tableName,item);
    }

}
