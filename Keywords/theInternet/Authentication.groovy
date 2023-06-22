package theInternet
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import static org.junit.Assert.assertEquals

import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class Authentication {

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		WebUiCommonHelper.findWebElement(to, 1).click()
	}

	/**
	 * fill in textbox
	 * @param test object, String
	 */	
	@Keyword
	def fillInTextbox(TestObject to, String string) {
		WebUiCommonHelper.findWebElement(to, 1).sendKeys(string)
	}

	/**
	 * assert element with text
	 * @param testobject, String
	 */
	@Keyword
	def assertString(TestObject to, String text) {
		String actualText = WebUiCommonHelper.findWebElement(to, 1).getText()
		assertEquals(text, actualText)
	}

	/**
	 * checks if element is visible
	 * @param testobject
	 */
	@Keyword
	def isVisible(TestObject to) {
		WebUiCommonHelper.findWebElement(to, 1).isDisplayed();
	}

	/**
	 * checks if element is not visible
	 * @param testobject
	 */
	@Keyword
	def isNotVisible(TestObject to) {
		try {
			WebUiCommonHelper.findWebElement(to, 1).isDisplayed();
		} catch (WebElementNotFoundException e) {
			true
		}
	}

	/**
	 * closes the browser  
	 */
	@Keyword
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}