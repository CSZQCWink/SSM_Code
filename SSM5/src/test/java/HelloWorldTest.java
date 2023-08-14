import com.csz.spring.bean.HelloWorld;
import com.csz.spring.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: HelloWorldTest
 * @Author: QC_Wink
 * @Description: 基于XML管理Bean的测试
 * @CreateTime: 2023-08-14 16:07
 * @Version: 1.0
 */

public class HelloWorldTest {
    /**
     * @title: test1
     * @author: QC_Wink
     * @description: 根据id获取Bean
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/14 16:48
     **/
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorldBeanById = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorldBeanById.sayHello();
    }
    /**
     * @title: test2
     * @author: QC_Wink
     * @description: 根据类型获取Bean
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/14 16:50
     **/
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorldByClass = applicationContext.getBean(HelloWorld.class);
        helloWorldByClass.sayHello();
    }

    /**
     * @title: test3
     * @author: QC_Wink
     * @description: 根据id和类型获取Bean
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/14 16:54
     **/
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorldByIdAndByClass = applicationContext.getBean("helloWorld",HelloWorld.class);
        helloWorldByIdAndByClass.sayHello();
    }

    /**
     * @title: test4
     * @author: QC_Wink
     * @description: 根据id获取Bean 此方法用来测试使用Setter注入
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/14 17:22
     **/
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("studentOne");
        System.out.println(student);
    }

    /**
     * @title: test4
     * @author: QC_Wink
     * @description: 根据id获取Bean 此方法用来测试使用构造器注入
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/8/14 17:22
     **/
    @Test
    public void test5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("studentTwo");
        System.out.println(student);
    }
}
