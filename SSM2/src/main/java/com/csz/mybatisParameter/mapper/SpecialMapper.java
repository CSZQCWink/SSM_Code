package com.csz.mybatisParameter.mapper;

import com.csz.mybatisParameter.pojo.User2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsPackage: com.csz.mybatisParameter.mapper
 * @ClassName: SpecialMapper
 * @Author: QC_Wink
 * @Description: 特殊的SQL执行
 * @CreateTime: 2023-07-22  16:17
 * @Version: 1.0
 */
public interface SpecialMapper {
    // 1.批量删除
    int deleteMore(@Param("ids") String ids);

    // 2.动态设置表名
    List<User2> getAllUserList(@Param("tableName") String tableName);

    // 3.添加功能获取自增的主键
    void adUser(User2 user);

}
