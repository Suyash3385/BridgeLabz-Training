package com.reflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class LoggingProxy {
	    interface Greeting {
	        void sayHello(String name);
	    }
	    static class GreetingImpl implements Greeting {
	        public void sayHello(String name) {
	            System.out.println("Hello, " + name);
	      }
	    }
	    static class LoggingHandler implements InvocationHandler {
	        private final Object target;
	        LoggingHandler(Object target) {
	            this.target=target;
	        }
	        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	            System.out.println("Calling method: " + method.getName());
	            return method.invoke(target, args);
	        }
	    }
	    public static void main(String[] args) {
	        Greeting realObject=new GreetingImpl();
	        Greeting proxy=(Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),new Class[]{Greeting.class}, new LoggingHandler(realObject));
	        proxy.sayHello("Suyash");
	    }
	}

