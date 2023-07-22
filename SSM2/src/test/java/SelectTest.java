import com.csz.mybatisParameter.mapper.SelectMapper;
import com.csz.mybatisParameter.pojo.User2;
import com.csz.mybatisParameter.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @BelongsPackage: PACKAGE_NAME
 * @ClassName: SelectTest
 * @Author: QC_Wink
 * @Description: 关于各种查询的测试
 * @CreateTime: 2023-07-22  14:43
 * @Version: 1.0
 */
public class SelectTest {
    /**
     * @title: getUserById
     * @author: QC_Wink
     * @description: 根据id查询指定的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 14:47
     **/
    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User2 user = mapper.getUserById(1);
        System.out.println(user);
    }

    /**
     * @title: getAllUserList
     * @author: QC_Wink
     * @description: 查询所有的用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 14:51
     **/
    @Test
    public void getAllUserList() {
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User2> allUserList = mapper.getAllUserList();
        allUserList.forEach(System.out::println);
    }

    /**
     * @title: getAllUserCount
     * @author: QC_Wink
     * @description: 查询总记录数
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 15:06
     **/
    @Test
    public void getAllUserCount(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int count = mapper.getAllUserCount();
        System.out.println("总记录数为："+count);
    }

    /**
     * @title: getUserMapById
     * @author: QC_Wink
     * @description: 根据id查询一条数据为Map集合
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 15:12
     **/
    @Test
    public void getUserMapById(){
        SqlSession sqlSession = SqlSessionUtils.sqlSessionCreate();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String,User2> userMap = mapper.getUserByIdToMap(1);
        System.out.println(userMap);
    }

    /**
     * @title: getAllUserToMap1
     * @author: QC_Wink
     * @description: 使用List集合 展示多条同呼吸虚拟
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 15:32
     **/
    @Test
    public void getAllUserToMap1(){
        List<Map<String, User2>> allUserToMap = SqlSessionUtils.sqlSessionCreate().
                                                getMapper(SelectMapper.class).getAllUserToMap();
        allUserToMap.forEach(System.out::println);
    }

    /**
     * @title: getAllUserToMap2
     * @author: QC_Wink
     * @description: 使用Map集合 展示多条用户信息
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 15:32
     **/
    @Test
    public void getAllUserToMap2(){
        Map<String, Object> allUserToMap2 = SqlSessionUtils.sqlSessionCreate().
                                            getMapper(SelectMapper.class).getAllUserToMap2();
        System.out.println(allUserToMap2);
    }

    /**
     * @title: getUserLikeName
     * @author: QC_Wink
     * @description: 模糊查询用户
     * @param: []
     * @return: void
     * @throws:
     * @date: 2023/7/22 16:12
     **/
    @Test
    public void getUserLikeName(){
        List<User2> userList = SqlSessionUtils.sqlSessionCreate().
                               getMapper(SelectMapper.class).getUserLikeName("张");
        userList.forEach(System.out::println);
    }
}
