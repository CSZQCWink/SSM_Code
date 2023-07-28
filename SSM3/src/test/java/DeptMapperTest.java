import com.csz.mybatisResultMap.mapper.DeptMapper;
import com.csz.mybatisResultMap.pojo.Dept;
import com.csz.mybatisResultMap.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.List;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: DeptMapperTest
 * @Author: QC_Wink
 * @Description: 测试部门的Mapper
 * @CreateTime: 2023-07-26 16:31
 * @Version: 1.0
 */

public class DeptMapperTest {
    /**
     * @title: getAllDeptListTest
     * @author: QC_Wink
     * @description: 获取所有的部门信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/28 15:43
     **/
    @Test
    public void getAllDeptListTest(){
        DeptMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(DeptMapper.class);
        List<Dept> allDeptList = mapper.getAllDeptList();
        allDeptList.forEach(System.out::println);
    }


    /**
     * @title: getDeptAndEmpByDeptId
     * @author: QC_Wink
     * @description: 根据部门id获取部门信息和员工信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/28 15:44
     **/
    @Test
    public void getDeptAndEmpByDeptId(){
        DeptMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(dept);
    }

    /**
     * @title: StepGetDeptAndEmpByDeptId
     * @author: QC_Wink
     * @description: 分步查询部门信息和员工信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/28 15:47
     **/
    @Test
    public void StepGetDeptAndEmpByDeptId(){
        DeptMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(DeptMapper.class);
        Dept dept = mapper.StepOneGetDeptInfoByDeptId(2);
        System.out.println(dept);
    }
}


