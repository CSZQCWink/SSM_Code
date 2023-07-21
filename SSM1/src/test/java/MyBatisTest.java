import com.csz.mybatis.mapper.UserMapper;
import com.csz.mybatis.pojo.User1;
import com.csz.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MyBatisTest {
    /**
     * @title: testInsert
     * @author: QC_Wink
     * @description: 添加用户的测试
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 16:27
     **/
    @org.junit.Test
    public void testInsert() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.insertUser();
        if(result == 1){
            System.out.println("添加用户成功："+result);
        }else {
            System.out.println("添加用户失败："+result);
        }
        // 关闭会话
        sqlSession.close();
    }


    /**
     * @title: updateUser
     * @author: QC_Wink
     * @description: 修改用户信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 17:08
     **/
    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.updateUser();
        if(result == 1){
            System.out.println("修改成功："+result);
        }else{
            System.out.println("修改失败："+result);
        }
        sqlSession.close();
    }


    /**
     * @title: deleteUser
     * @author: QC_Wink
     * @description: 根据id删除用户的测试
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 17:00
     **/
    @Test
    public void deleteUserById(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.deleteUser(17);
        if(result == 1){
            System.out.println("删除成功："+result);
        }else{
            System.out.println("删除失败："+result);
        }
        sqlSession.close();
    }

    /**
     * @title: getUser
     * @author: QC_Wink
     * @description: 根据id查询一个用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 19:20
     **/
    @Test
    public void getUserById(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User1 user = mapper.getUser();
        System.out.println(user);
        sqlSession.close();
    }
    /**
     * @title: getAllUserList
     * @author: QC_Wink
     * @description: 查询所有的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 19:21
     **/
    @Test
    public void getAllUserList(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User1> allUserList = mapper.getAllUserList();
        allUserList.forEach(System.out :: println);
        sqlSession.close();
    }
}