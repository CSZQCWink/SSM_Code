import com.csz.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: AutowireXmlTest
 * @Author: QC_Wink
 * @Description: 基于XML的自动装配测试
 * @CreateTime: 2023-08-16 11:25
 * @Version: 1.0
 */

public class AutowireXmlTest {

	@Test
	public void saveUserTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAutowireXml.xml");
		UserController userController = applicationContext.getBean(UserController.class);
		userController.saveUser_Controller();
	}
}
