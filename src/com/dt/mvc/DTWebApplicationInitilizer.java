package com.dt.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DTWebApplicationInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] { DTConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { DTConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("** getServletMappings");
		return new String[] { "*.dt" };
	}

}
