package com.cg.main.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Aspect
@Configuration
public class LoggingAspect {
	private final Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	 
	private ObjectMapper mapper = new ObjectMapper();

	@Before("execution(* com.cg.main.service..*(..))")
	public void applicationServLogging(JoinPoint joint) throws Exception {
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		try {
			slf4jLogger.info("Begin of - " + joint.getStaticPart().getSignature().getName() + " method");
			slf4jLogger.info("Info Input Parameters -:\n " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(joint.getArgs()));
		} catch (JsonProcessingException e) {
			throw new Exception();
		}

	}
	
	
	@AfterReturning(pointcut = "execution(* com.cg.main.service..*(..))", returning = "result")
	public void serviceSetterMethodLogging(JoinPoint joint, Object result) throws Exception {
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		try {

			slf4jLogger.info("Info Output Parameters -: \n "
					+ mapper.writerWithDefaultPrettyPrinter().writeValueAsString(null != result ? result : ""));
			slf4jLogger.debug("end of  - " + joint.getStaticPart().getSignature().getName() + " method");
		} catch (JsonProcessingException e) {
			throw new Exception();
		}
	}
	
	 @AfterReturning(pointcut="execution(* com.cg.main.service.ComposerService.getAllComposer(..))", returning="retVal")
	    public void logAfterReturningGetEmployee(Object retVal) throws Exception
	    {
	        System.out.println("****LoggingAspect.logAfterReturninggetAllComposer() ");
	    }
	 
	    @AfterReturning("execution(* com.cg.main.service.ComposerService.createComposer(..))")
	    public void logAfterReturningCreateEmployee() throws Exception
	    {
	        System.out.println("****LoggingAspect.logAfterReturningCreateComposer() ");
	    }
	
}