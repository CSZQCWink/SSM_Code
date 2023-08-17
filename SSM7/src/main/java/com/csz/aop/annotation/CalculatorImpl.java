package com.csz.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @BelongsPackage: com.csz.aop.annotation
 * @ClassName: CalculatorImpl
 * @Author: QC_Wink
 * @Description: 计算器接口的实现类
 * @CreateTime: 2023-08-17 14:52
 * @Version: 1.0
 */
@Component
public class CalculatorImpl implements Calculator {
	@Override
	public int add(int i, int j) {
		int result = i + j;
		System.out.println("方法内部 result = " + result);
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result = i - j;
		System.out.println("方法内部 result = " + result);
		return result;
	}

	@Override
	public int mul(int i, int j) {
		int result = i * j;
		System.out.println("方法内部 result = " + result);
		return result;
	}

	@Override
	public int div(int i, int j) {
		int result = i / j;
		System.out.println("方法内部 result = " + result);
		return result;
	}
}
