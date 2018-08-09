package com.piesat.systemcod.service;

import com.alibaba.fastjson.JSONObject;
import com.piesat.systemcod.mapper.DynamicQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DynamicDataService {

    @Autowired
    private DynamicQueryMapper dynamicQueryMapper;

    public Object insertDynamicData(String tableName,Object jsonObj){
//      {
//              "tableName":"sys_user",
//                "data":[
//        {
//            "password":"{bcrypt}$2a$10$D8E4cuanLviCCe/ASqBC7OZ84JYOH8IT4/y4JLAV/Pm/AdhzPcy2.",
//                "login_name":"admin",
//                "name":"管理员",
//                "id":1,
//                "email":"123456@qq.com"
//        },
//        {
//            "password":"{bcrypt}$2a$10$nr9nTKK2cm1fiGsC.UpGuudc.MtFgthcmRd652ubmrd0TMztB9tym",
//                "login_name":"test1",
//                "name":"小明",
//                "id":2,
//                "email":"123456@qq.com"
//        }
//    ]
//}
        JSONObject json = null;
        json.put("tableName","sys_user");
        Map<String,Object> sqlmap=new HashMap<String, Object>();
        sqlmap.put("tablename", tableName);
//        sqlmap.put("column_name", columnName);
//        sqlmap.put("columnvalue", columnValue);
        return null;
    }
}
