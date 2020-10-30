package com.ncl.qa.utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class NclSearchResultsPageTest, Constructor NclSearchResultsPage1, Method comparePrices) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}