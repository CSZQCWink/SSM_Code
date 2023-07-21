package com.csz.ssm.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsPackage: com.csz.ssm.utils
 * @ClassName: SqlSessionUtils
 * @Author: QC_Wink
 * @Description: SqlSession会话工具类
 * @CreateTime: 2023-07-21 16:34
 * @Version: 1.0
 */

public class SqlSessionUtils {

    public static SqlSession sqlSessionCreate()  {

        InputStream resourceAsStream = null;
        SqlSession sqlSession = null;
        try {
            // 获取核心配置文件的输入流
            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            // 获取SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            // 获取SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);

            // 获取SqlSession对象 是MyBatis提供的操作数据库的对象 添加true参数就会自动提交
            sqlSession = sqlSessionFactory.openSession(true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sqlSession;
    }
}
