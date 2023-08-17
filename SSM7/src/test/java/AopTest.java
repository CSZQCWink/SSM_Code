import com.csz.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: AopTest
 * @Author: QC_Wink
 * @Description: AOP测试
 * @CreateTime: 2023-08-17 15:17
 * @Version: 1.0
 */

public class AopTest {
    @Test
    public void aopTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAopAnnotation.xml");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        int add = calculator.sub(1, 2);
    }
}
