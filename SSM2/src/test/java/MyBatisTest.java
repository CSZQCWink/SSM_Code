import com.csz.mybatisParameter.mapper.UserMapper;
import com.csz.mybatisParameter.pojo.User2;
import com.csz.mybatisParameter.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: MyBatisTest
 * @Author: QC_Wink
 * @Description: MyBatis测试方法
 * @CreateTime: 2023-07-21  21:05
 * @Version: 1.0
 */
public class MyBatisTest {

    /**
     * @title: addUser
     * @author: QC_Wink
     * @description: 添加用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 22:16
     **/
    @Test
    public void addUser() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.addUser(new User2(null,"李四","lisi",27,"男","lisi@163.com"));
        if (result == 1){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    /**
     * @title: getUserById
     * @author: QC_Wink
     * @description: 根据用户的姓名查找指定的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 23:11
     **/
    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User2 user = mapper.getUserByUserName("李四");
        System.out.println(user);
    }

    /**
     * @title: getUserByUserNameAndPassword
     * @author: QC_Wink
     * @description: 根据名字和密码查找指定的用户需要注意的是UseMapper.xml中有多个字面量类型的参数 要和单个的进行区分
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 23:50
     **/
    @Test
    public void getUserByUserNameAndPassword() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User2 user = mapper.getUserByUserNameAndPassword("李四","lisi");
        System.out.println(user);
    }

    /**
     * @title: getUserByMap
     * @author: QC_Wink
     * @description: 自定义map集合查找指定的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 11:56
     **/
    @Test
    public void getUserByMap() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","李四");
        map.put("password","lisi");
        User2 user = mapper.getUserByMap(map);
        System.out.println(user);
    }

    /**
     * @title: getUserByParam
     * @author: QC_Wink
     * @description: 使用@Param注解查找指定的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 11:57
     **/
    @Test
    public void getUserByParam() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User2 user = mapper.getUserByParam("李四","lisi");
        System.out.println(user);
    }

    /**
     * @title: updateUserById
     * @author: QC_Wink
     * @description: 修改用户信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 12:44
     **/
    @Test
    public void updateUserById() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User2 user = new User2();
        user.setId(2);
        user.setUsername("new - name");
        int result = mapper.updateUser(user);
        if (result == 1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    /**
     * @title: deleteUserById
     * @author: QC_Wink
     * @description: 根据id删除指定的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 23:35
     **/
    @Test
    public void deleteUserById() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.deleteUserById(19);
        if (result == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
