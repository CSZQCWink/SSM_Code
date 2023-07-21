package com.csz.mybatis.mapper;

import com.csz.mybatis.pojo.User1;

import java.util.List;

/**
 * @BelongsPackage: com.csz.ssm.mapper
 * @ClassName: UserMapper
 * @Author: QC_Wink
 * @Description: UserMapper接口
 * @CreateTime: 2023-07-20  23:50
 * @Version: 1.0
 */
public interface UserMapper {
    // 添加用户的方法
    int insertUser();

    // 修改用户的方法
    int updateUser();

    // 删除用户的方法
    int deleteUser(Integer id);

    // 查询一个用户
    User1 getUser();

    // 查询所有用户的方法
    List<User1> getAllUserList();
}
