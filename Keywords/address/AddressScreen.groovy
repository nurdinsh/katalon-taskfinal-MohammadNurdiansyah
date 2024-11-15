package address
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
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class AddressScreen {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def InputCountry(String country) {
		try {
			WebUI.sendKeys(findTestObject(null), '')
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_Country'), country)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	@Keyword
	def InputName(String name) {
		try {
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_Name'), name, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	@Keyword
	def InputNumber(String number) {
		try {
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_Mobile number'), number, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	@Keyword
	def InputZip(String zip) {
		try {
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_ZIP Code'), zip, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	@Keyword
	def InputAddress(String address) {
		try {
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_Address'), address, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	@Keyword
	def InputCity(String city) {
		try {
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_City'), city, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	@Keyword
	def InputState(String state) {
		try {
			WebUI.sendKeys(findTestObject('Order and Paymen/Address/input_State'), state, FailureHandling.STOP_ON_FAILURE)
			KeywordUtil.logInfo("Input Country Field")
			KeywordUtil.markPassed("Input has been inputted")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to inputted on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}