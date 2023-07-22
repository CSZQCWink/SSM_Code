package com.csz.mybatisParameter.mapper;
import com.csz.mybatisParameter.pojo.User2;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @BelongsPackage: com.csz.ssm.mapper
 * @ClassName: UserMapper
 * @Author: QC_Wink
 * @Description: 回头再说
 * @CreateTime: 2023-07-21  21:07
 * @Version: 1.0
 */
public interface UserMapper {
    // 添加用户
    int addUser(User2 user);

    // 根据名字查找指定的用户
    User2 getUserByUserName(String userName);

    // 根据名字和密码查找指定的用户
    User2 getUserByUserNameAndPassword(String userName, String password);

    // 自定义map集合查找指定的用户
    User2 getUserByMap(Map<String, Object> map);

    // 使用@Param注解查找指定的用户
    User2 getUserByParam(@Param("username") String username, @Param("password") String password);

    // 修改数据库中的数据
    int  updateUser(User2 user);

    // 根据id删除指定的对象
    int deleteUserById(Integer id);
}
