import com.csz.transaction.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: JdbcTest
 * @Author: QC_Wink
 * @Description: jdbc测试
 * @CreateTime: 2023-08-18 09:14
 * @Version: 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")

/*

 @RunWith(SpringJUnit4ClassRunner.class) 这是JUnit框架提供的测试运行器，用于运行Spring应用程序的单元测试。
 @ContextConfiguration("classpath:spring-jdbc.xml")
	这是指定Spring应用程序上下文配置文件的路径，用于加载Spring的配置信息。在这里，"classpath:spring-jdbc.xml"表示在类路径下查找名为spring-jdbc.xml的配置文件，并加载它。
	这两个注解的组合用于在单元测试中加载Spring应用程序的上下文配置，以便能够使用Spring的依赖注入和其他特性进行测试。
 */
public class JdbcTest {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * @title: testUpdate
	 * @author: QC_Wink
	 * @description: 测试增删改功能
	 * @param: []
	 * @return: void
	 * @throws:
	 * @date: 2023/8/18 9:32
	 **/
	@Test
	public void testUpdate() {
		String sql = "insert into t_user values(null,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, "张三", "root", 23, "男", "zhangsan@163.com");
		System.out.println(result);
	}

	/**
	 * @title: testSelectEmpById
	 * @author: QC_Wink
	 * @description: 查询一条数据为一个实体类对象
	 * 使用jdbcTemplate.queryForObject方法执行SQL查询并将员工记录作为Emp类的对象检索出来。
	 * BeanPropertyRowMapper用于将查询结果的列映射到Emp类的属性。
	 * @param: []
	 * @return: void
	 * @throws:
	 * @date: 2023/8/18 9:30
	 **/
	@Test
	public void testSelectEmpById() {
		String sql = "select * from t_emp where emp_id = ?";
		Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
		System.out.println(emp);
	}

	/**
	 * @title: testSelectList
	 * @author: QC_Wink
	 * @description: 查询多条数据为一个list集合
	 * @param: []
	 * @return: void
	 * @throws:
	 * @date: 2023/8/18 9:32
	 **/
	@Test
	public void testSelectList() {
		String sql = "select * from t_emp";
		List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
		list.forEach(emp -> System.out.println(emp));
	}

	/**
	 * @title: selectCount
	 * @author: QC_Wink
	 * @description: 查询单行单列的值
	 * @param: []
	 * @return: void
	 * @throws:
	 * @date: 2023/8/18 9:33
	 **/
	@Test
	public void selectCount(){
		String sql = "select count(emp_id) from t_emp";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}

}
