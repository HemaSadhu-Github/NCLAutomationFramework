package com.ncl.qa.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer  {
    private int count = 0;
    private int maxCount = 2;

    public boolean retry(ITestResult result) {
        if(count < maxCount && !result.isSuccess()) {
            //log.debug("Going to retry test case: " + result.getMethod() + ", " + count + " out of " + maxCount);
            count++;
            return true;
        }
        return false;
    }
}