package Father;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Son extends Father {

    public void four(){
        System.out.println("four..");
    }
    public static void main(String args[]) throws IllegalAccessException, InstantiationException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Father.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                if(method.getName().equals("add"))
                {
                    methodProxy.invokeSuper(proxy,args);
                }
                if(method.getName().equals("get"))
                {
                    methodProxy.invokeSuper(proxy,args);
                }
                return null;
            }
        });
        AbstractF abstractF = (AbstractF) enhancer.create();
        abstractF.get();

        //new Son();
    }
}
