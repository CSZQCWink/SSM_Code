import com.csz.ssm.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
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
}
