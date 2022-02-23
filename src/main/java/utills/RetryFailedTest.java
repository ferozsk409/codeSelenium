package utills;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {

		int mincount = 0;
		//int maxcount = 5;
		if (false) {

			mincount++;
			System.out.println(mincount);
			return true;
		}
		return false;
	}

}
