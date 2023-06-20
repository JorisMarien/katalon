import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://the-internet.herokuapp.com/login')

CustomKeywords.'theInternet.Authentication.fillInTextbox'(findTestObject('Object Repository/Page_The Internet/input_Username_username'),'tomsmith')

CustomKeywords.'theInternet.Authentication.fillInTextbox'(findTestObject('Object Repository/Page_The Internet/input_Password_password'),'SuperSecretPassword!')

CustomKeywords.'theInternet.Authentication.clickElement'(findTestObject('Object Repository/Page_The Internet/i_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_The Internet/div_You logged into a secure area'), 0)

WebUI.click(findTestObject('Object Repository/Page_The Internet/i_Logout'))

WebUI.closeBrowser()
