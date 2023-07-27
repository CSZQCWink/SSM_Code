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
    @Test
    public void getAllDeptListTest(){
        DeptMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(DeptMapper.class);
        List<Dept> allDeptList = mapper.getAllDeptList();
        allDeptList.forEach(System.out::println);
    }

    @Test
    public void SubStepTwoGetEmpAndDeptById(){
        DeptMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(DeptMapper.class);
        Dept dept = mapper.SubStepTwoGetEmpAndDeptById(1);
        System.out.println(dept);
    }
}
