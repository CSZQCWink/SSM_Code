import com.csz.mybatisResultMap.mapper.EmpMapper;
import com.csz.mybatisResultMap.pojo.Emp;
import com.csz.mybatisResultMap.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.List;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: EmpMapperTest
 * @Author: QC_Wink
 * @Description: 测试员工Mapper
 * @CreateTime: 2023-07-26 16:21
 * @Version: 1.0
 */

public class EmpMapperTest {
    /**
     * @title: getAllEmpListTest
     * @author: QC_Wink
     * @description: 获取所有的员工信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/26 22:10
     **/
    @Test
    public void getAllEmpListTest(){
        EmpMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(EmpMapper.class);
        List<Emp> allEmpList = mapper.getAllEmpList();
        allEmpList.forEach(System.out:: println);
    }
    /**
     * @title: getEmpById
     * @author: QC_Wink
     * @description: 根据id获取指定的员工信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/26 22:11
     **/
    @Test
    public void getEmpById(){
        EmpMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp);
    }

    /**
     * @title: getEmpAndDeptByIdTest
     * @author: QC_Wink
     * @description: 根据id获取指定的员工信息以及所对应的部门信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/26 22:11
     **/
    @Test
    public void getEmpAndDeptByIdTest(){
        EmpMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptById(1);
        System.out.println(emp);
    }
}
