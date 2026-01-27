package com.annotations.cachingsystem;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
public class CacheExecutor {
	


	    private static Map<String, Object> cache=new HashMap<String, Object>();

	    public static Object execute(Object target,
                String methodName,
                Class[] paramTypes,
                Object[] params) throws Exception {
	        Class cls=target.getClass();
	        Method method=cls.getMethod(methodName, paramTypes);

	        String cacheKey=methodName+ params[0];

	        if (method.isAnnotationPresent(CacheResult.class)) {
	            if (cache.containsKey(cacheKey)) {
	                System.out.println("cached result: " + params[0]);
	                return cache.get(cacheKey);
	            }
	            Object result=method.invoke(target, params);
	            cache.put(cacheKey, result);
	            return result;
	        }

	        return method.invoke(target, params);
	    }

	
	}



