import com.csz.transaction.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: TxByAnnotationTest
 * @Author: QC_Wink
 * @Description: 声明式事务测试
 * @CreateTime: 2023-08-18 10:52
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class TxByAnnotationTest {
	@Autowired
	private BookController bookController;
	@Test
	public void testBuyBook(){
		bookController.buyBook(1, 1);
	}
}
