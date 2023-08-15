import com.csz.spring.bean.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: LifeCycleTest
 * @Author: QC_Wink
 * @Description: Bean的生命周期的测试类
 * @CreateTime: 2023-08-15 15:39
 * @Version: 1.0
 */

public class LifeCycleTest {
    /**
     * @title: testLifeCycle
     * @author: QC_Wink
     * @description: 测试Bean生命周期的方法
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/15 15:44
     **/
    @Test
    public void testLifeCycle() throws Exception {
        // ConfigurableApplicationContext 是 ApplicationContext子接口 扩展了刷新和关闭IOC容器的方法
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationLifeCycle.xml");
        User user = configurableApplicationContext.getBean(User.class);
        System.out.println(user);
        configurableApplicationContext.close();
    }
}
