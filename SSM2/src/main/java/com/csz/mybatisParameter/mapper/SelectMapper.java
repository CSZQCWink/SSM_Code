package com.csz.mybatisParameter.mapper;

import com.csz.mybatisParameter.pojo.User2;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @BelongsPackage: com.csz.mybatisParameter.mapper
 * @ClassName: SelectMapper
 * @Author: QC_Wink
 * @Description: 各种查询
 * @CreateTime: 2023-07-22  14:41
 * @Version: 1.0
 */
public interface SelectMapper {

    // 1. 根据id查询指定的用户
    User2 getUserById(@Param("id") Integer id);

    // 2. 查询所有的用户
    List<User2> getAllUserList();

    // 3. 查询总记录数
    Integer getAllUserCount();

    // 4. 根据id查询用户为Map集合
    @MapKey(value = "id")
    Map<String,User2> getUserByIdToMap(@Param("id") Integer id);

    // 5. 查询所有的数据为map集合 方式一
    @MapKey(value = "id")
    List<Map<String,User2>> getAllUserToMap();

    // 5. 查询所有的数据为map集合 方式二
    @MapKey(value = "id")
    Map<String,Object> getAllUserToMap2();

    // 6. 使用模糊查询 查询所匹配的用户
    List<User2> getUserLikeName(@Param("username") String username);
}
