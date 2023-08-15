import com.csz.spring.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: ScopeTest
 * @Author: QC_Wink
 * @Description: Bean的作用域测试
 * @CreateTime: 2023-08-15 15:12
 * @Version: 1.0
 */

public class ScopeTest {
    /**
     * @title: test1
     * @author: QC_Wink
     * @description: Bean的作用域测试
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/15 15:20
     **/
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationScope.xml");
        // 当Bean的作用域为Singleton时 只会创建一个实例
        // 当Bean的作用域为Prototype时 会创建多个实例
        Student student1 = applicationContext.getBean(Student.class);
        Student student2 = applicationContext.getBean(Student.class);
        System.out.println(student1.equals(student2));
    }
}
