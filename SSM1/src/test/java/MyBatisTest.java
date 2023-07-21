import com.csz.ssm.mapper.UserMapper;
import com.csz.ssm.pojo.User;
import com.csz.ssm.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
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
        // 获取核心配置文件的输入流
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);

        // 获取SqlSession对象 是MyBatis提供的操作数据库的对象 添加true参数就会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取UserMapper接口的代理实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 调用mapper接口中的方法实现添加用户信息的功能
        int result = mapper.insertUser();

        // 判断是否添加成功
        if(result == 1){
            System.out.println("添加用户成功："+result);
        }else {
            System.out.println("添加用户失败："+result);
        }

        // 提交事务
        // sqlSession.commit();

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
        int result = mapper.updateUserById(2);
        if(result == 1){
            System.out.println("修改成功："+result);
        }else{
            System.out.println("修改失败："+result);
        }
        sqlSession.close();
    }


    /**
     * @title: deleteUserById
     * @author: QC_Wink
     * @description: 删除用户的测试
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/21 17:00
     **/
    @Test
    public void deleteUserById(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.deleteUserById(3);
        if(result == 1){
            System.out.println("删除成功："+result);
        }else{
            System.out.println("删除失败："+result);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void getAllUserList(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUserList = mapper.getAllUserList();
        allUserList.forEach(System.out :: println);
        sqlSession.close();
    }
}