package com.csz.springAop.proxy;

import com.csz.springAop.dao.CalculatorDao;
import com.csz.springAop.pojo.Calculator;

/**
 * @BelongsPackage: com.csz.springAop.proxy
 * @ClassName: CalculatorStaticProxy
 * @Author: QC_Wink
 * @Description: 计算器的静态代理
 * @CreateTime: 2023-08-17 11:56
 * @Version: 1.0
 */

public class CalculatorStaticProxy implements CalculatorDao {

    private  CalculatorDao calculatorDao;

    public CalculatorStaticProxy(CalculatorDao constructorDao) {
        this.calculatorDao = constructorDao;
    }

    @Override
    public int add(int i, int j) {
        // 附加功能由代理类中的代理方法来实现
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务逻辑
        int addResult = calculatorDao.add(i, j);

        // 附加功能由代理类中的代理方法实现
        System.out.println("[日志] add 方法结束了，结果是：" + addResult);

        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
