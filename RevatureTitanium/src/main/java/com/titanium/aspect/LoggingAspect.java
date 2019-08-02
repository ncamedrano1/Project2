package com.titanium.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;

public class LoggingAspect {
	private static Logger log = Logger.getLogger(LoggingAspect.class);

	@Around("within(com.revature.configuration.*)")
	public void configLog(JoinPoint jp) {
		log.info("Configuration Method: " + jp.getSignature().getName() + " called from: "
				+ jp.getTarget().getClass().getName());
	}

	@Around("within(com.revature.controllers.*)")
	public void controllerLog(JoinPoint jp) {
		log.info("Controller Method: " + jp.getSignature().getName() + " called from: "
				+ jp.getTarget().getClass().getName());
	}

	@Around("within(com.revature.repository.*)")
	public void repoLog(JoinPoint jp) {
		log.info("Repository Method: " + jp.getSignature().getName() + " called from: "
				+ jp.getTarget().getClass().getName());
	}

	@Around("within(com.revature.services.*)")
	public void serviceLog(JoinPoint jp) {
		log.info("Service Method: " + jp.getSignature().getName() + " called from: "
				+ jp.getTarget().getClass().getName());
	}

	public void callLog(Object obj) {
		log.info("Method called from: " + obj.getClass().getName());
	}
}
