package com.csz.ssm.mapper;

import com.csz.ssm.pojo.User;

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
    int updateUserById(Integer id);

    // 删除用户的方法
    int deleteUserById(Integer id);

    // 查询一个用户
    User getUserById();

    // 查询所有用户的方法
    List<User> getAllUserList();
}
