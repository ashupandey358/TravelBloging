package com.blogger.travelling;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAop {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Before(value = "execution(* com.blogger.travelling.*.*.*(..))")
	public void beforeSerive(JoinPoint joinPoint)
	{
		LOGGER.info("Start {}", joinPoint.getSignature().toShortString());
	}
	
	@After(value = "execution(* com.blogger.travelling.*.*.*(..))")
	public void afterSerive(JoinPoint joinPoint)
	{
		LOGGER.info("end {}", joinPoint.getSignature().toShortString());
	}

}
