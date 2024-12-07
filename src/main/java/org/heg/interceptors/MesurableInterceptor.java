package org.heg.interceptors;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class MesurableInterceptor {

    @Around("execution(* org.heg.manager.ClientManager.*(..))")
    public Object auditMethod(ProceedingJoinPoint jp) throws Throwable {
        String methodName = jp.getSignature().getName();
        long start = System.currentTimeMillis();
        Object obj = jp.proceed();
        log.info("Method {} called successfully in {} ms", methodName, (System.currentTimeMillis() - start));
        return obj;
    }
}
