package com.csz.springAop.proxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @BelongsPackage: com.csz.springAop.proxy
 * @ClassName: ProxyFactory
 * @Author: QC_Wink
 * @Description: 动态代理对象工厂
 * @CreateTime: 2023-08-17 13:55
 * @Version: 1.0
 */
@AllArgsConstructor
public class ProxyFactory {
    private Object target;

    public Object getProxy(){
        /*
          newProxyInstance()：创建一个代理实例
              其中有三个参数：
              1、classLoader：指定加载动态生成的代理类的类加载器
              2、interfaces：获取目标对象实现的所有接口的class对象所组成的数组
              3、invocationHandler：设置代理类中的抽象方法如何重写
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler(){
            @Override
            // 此invoke是代理对象该如何执行的方法 需要执行的是method中invoke（目标对象执行功能的过程）
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /*
                 * proxy：代理对象
                 * method：代理对象需要实现的方法，即其中需要重写的方法
                 * args：method所对应方法的参数
                 */
                Object result = null;
                try {
                    System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[动态代理][日志] "+method.getName()+"，异常："+e.getMessage());
                } finally {
                    System.out.println("[动态代理][日志] "+method.getName()+"，方法执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
