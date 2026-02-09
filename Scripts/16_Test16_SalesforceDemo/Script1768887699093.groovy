import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://data-momentum-7717.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'piyushmnit-tt7f@force.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_password'), 'gS/5CWqqSBMvOLDqFuE/lQ==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Home  Salesforce/input_SearchBox'), 20)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home  Salesforce/input_SearchBox'), 'Search...')

WebUI.enhancedClick(findTestObject('Page_Home  Salesforce/img'))

WebUI.enhancedClick(findTestObject('Page_Recently Viewed  Accounts  Salesforce/a_testone'))

WebUI.waitForElementPresent(findTestObject('Page_testone  Account  Salesforce/lightning-formatted-text_testone'), 20)

WebUI.verifyElementText(findTestObject('Page_testone  Account  Salesforce/lightning-formatted-text_testone'), 'testone')

WebUI.closeBrowser()

