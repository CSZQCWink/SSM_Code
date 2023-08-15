import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: DataSourceTest
 * @Author: QC_Wink
 * @Description: 数据源的测试
 * @CreateTime: 2023-08-15 14:30
 * @Version: 1.0
 */

public class DataSourceTest {
    /**
     * @title: test
     * @author: QC_Wink
     * @description: Spring管理数据源和引入外部文件的测试
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/15 14:41
     **/
    @Test
    public void test() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationDataSource.xml");
        DataSource dataSource = applicationContext.getBean(DruidDataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
