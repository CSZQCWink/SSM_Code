package com.csz.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @BelongsPackage: com.csz.spring.beanprocessor
 * @ClassName: MyBeanPostProcessor
 * @Author: QC_Wink
 * @Description: 我的后置处理器
 * @CreateTime: 2023-08-15 16:17
 * @Version: 1.0
 */

public class MyBeanPostProcessor implements BeanPostProcessor {
	// Bean初始化之前执行
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("☆☆☆" + beanName + " = " + bean);
		return bean;
	}
	// Bean初始化之后的后执行
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("★★★" + beanName + " = " + bean);
		return bean;
	}

}
