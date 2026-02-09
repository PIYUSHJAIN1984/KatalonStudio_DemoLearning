import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('10_Test9_Reuse_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ReuseTC/Page_OrangeHRM_Navigations/a_Admin'))

WebUI.click(findTestObject('Object Repository/ReuseTC/Page_OrangeHRM_Navigations/a_Leave'))

WebUI.click(findTestObject('Object Repository/ReuseTC/Page_OrangeHRM_Navigations/a_My Info'))

WebUI.click(findTestObject('Object Repository/ReuseTC/Page_OrangeHRM_Navigations/i_Upgrade_oxd-icon bi-caret-down-fill oxd-u_ca92f9'))

WebUI.click(findTestObject('Object Repository/ReuseTC/Page_OrangeHRM_Navigations/a_Logout'))

not_run: WebUI.closeBrowser()

testt == 'sdsdsd'

/*
 * @Keyword def funct1() {
 * 
 * }
 */