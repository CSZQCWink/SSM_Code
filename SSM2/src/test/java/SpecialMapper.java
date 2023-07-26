import com.csz.mybatisParameter.pojo.User2;
import com.csz.mybatisParameter.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: SpecialMapper
 * @Author: QC_Wink
 * @Description: 特殊的SQL执行
 * @CreateTime: 2023-07-22  16:18
 * @Version: 1.0
 */
public class SpecialMapper {

    /**
     * @title: deleteUserMoreTest
     * @author: QC_Wink
     * @description: 批量删除操作
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 22:07
     **/
    @Test
    public void deleteUserMoreTest(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        com.csz.mybatisParameter.mapper.SpecialMapper mapper = sqlSession.getMapper(com.csz.mybatisParameter.mapper.SpecialMapper.class);
        int result = mapper.deleteMore("21,22,23,24,25");
        if (result == 1){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    /**
     * @title: getAllUserList
     * @author: QC_Wink
     * @description: 动态设置表名查询所有的数据
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 22:13
     **/
    @Test
    public void getAllUserList(){
        List<User2> allUserList = SqlSessionUtils.sqlSessionCreate().
                                  getMapper(com.csz.mybatisParameter.mapper.SpecialMapper.class).getAllUserList("t_user");
        allUserList.forEach(System.out::println);

    }

    /**
     * @title: addUser
     * @author: QC_Wink
     * @description: 添加功能获取自增的主键
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 22:28
     **/
    @Test
    public void addUser(){
        User2 user = new User2(null,"xiaoming","123456",12,"女","xiaoming@163.com");
        SqlSessionUtils.sqlSessionCreate().getMapper(com.csz.mybatisParameter.mapper.SpecialMapper.class).adUser(user);
        System.out.println(user);
    }
}
