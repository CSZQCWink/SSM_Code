package com.csz.springAop.dao.impl;

import com.csz.springAop.dao.CalculatorDao;
import org.springframework.stereotype.Repository;

/**
 * @BelongsPackage: com.csz.springAop.dao.impl
 * @ClassName: CalculatorDaoImpl
 * @Author: QC_Wink
 * @Description: 计算器服务访问层的实现类
 * @CreateTime: 2023-08-17 10:40
 * @Version: 1.0
 */

@Repository
public class CalculatorDaoImpl implements CalculatorDao {
	@Override
	public int add(int i, int j) {
		System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
		int result = i + j;
		System.out.println("方法内部 result = " + result);
		System.out.println("[日志] add 方法结束了，结果是：" + result);
		return result;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
		int result = i - j;
		System.out.println("方法内部 result = " + result);
		System.out.println("[日志] sub 方法结束了，结果是：" + result);
		return result;
	}

	@Override
	public int mul(int i, int j) {
		System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
		int result = i * j;
		System.out.println("方法内部 result = " + result);
		System.out.println("[日志] mul 方法结束了，结果是：" + result);
		return result;
	}

	@Override
	public int div(int i, int j) {
		System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
		int result = i / j;
		System.out.println("方法内部 result = " + result);
		System.out.println("[日志] div 方法结束了，结果是：" + result);
		return result;
	}
}
