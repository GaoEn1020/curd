package com.piesat.systemcod.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicQueryMapper {

    //查询数据列表
    public List<Object> queryMetaList(@Param("tableName")String tableName);

    //根据条件查询
    public List<Object> queryMetaListByItem(@Param("tableName")String tableName,@Param("id") int id);

    //添加操作
    public int insertMataData(@Param("tableName") String tableName,@Param("item") Object item);


}
