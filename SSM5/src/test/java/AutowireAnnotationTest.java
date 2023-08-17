import com.csz.spring.controller.EmpController;
import com.csz.spring.dao.EmpDao;
import com.csz.spring.service.EmpService;
import com.csz.spring.service.Impl.EmpServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: AutowireAnnotationTest
 * @Author: QC_Wink
 * @Description: 基于注解的自动装配的测试
 * @CreateTime: 2023-08-16 14:27
 * @Version: 1.0
 */

public class AutowireAnnotationTest {
    @Test
    public  void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAnnotation.xml");
        EmpController empController = applicationContext.getBean(EmpController.class);
        EmpService empService = applicationContext.getBean(EmpService.class);
        EmpDao empDao = applicationContext.getBean(EmpDao.class);
        System.out.println(empController);
        System.out.println(empService);
        System.out.println(empDao);
    }
}
