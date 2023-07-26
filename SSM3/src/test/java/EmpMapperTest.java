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
    @Test
    public void getAllEmpListTest(){
        EmpMapper mapper = SqlSessionUtils.sqlSessionCreate().getMapper(EmpMapper.class);
        List<Emp> allEmpList = mapper.getAllEmpList();
        allEmpList.forEach(System.out:: println);
    }
}
