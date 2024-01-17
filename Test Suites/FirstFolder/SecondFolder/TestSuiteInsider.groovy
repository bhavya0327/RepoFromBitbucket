import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

 

/**

 * Some methods below are samples for using SetUp/TearDown in a test suite.

 */

 

/**

 * Setup test suite environment.

 */

@SetUp(skipped = false) // Please change skipped to be false to activate this method.

def setUp() {

   // Put your code here.

//   Runtime.getRuntime().exec("taskkill /f /im chrome.exe")
//
//   Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe")
//	driver.quit()
	
//	Runtime.getRuntime().exec("taskkill /f /im chrome.exe")
//	Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe")
//
//   WebUI.delay(5)

}

 

/**

 * Clean test suites environment.

 */

@TearDown(skipped = false) // Please change skipped to be false to activate this method.

def tearDown() {

   // Put your code here.

//   WebUI.closeBrowser()

}

 

/**

 * Run before each test case starts.

 */

@SetupTestCase(skipped = false) // Please change skipped to be false to activate this method.

def setupTestCase() {

   // Put your code here.

////   Runtime.getRuntime().exec("taskkill /f /im chrome.exe")
////
////   Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe")
//
//   WebUI.delay(5)

//   WebUI.openBrowser('')

}

 

/**

 * Run after each test case ends.

 */

@TearDownTestCase(skipped = false) // Please change skipped to be false to activate this method.

def tearDownTestCase() {

   // Put your code here.

   WebUI.closeBrowser()

}

 

/**

 * References:

 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/

 */