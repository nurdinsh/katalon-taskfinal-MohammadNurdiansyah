package functions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("The Juice Shop URL")
	def TheJuiceShopURL() {
		WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("I clik on the Menu Account")
	def IclikontheMenuAccount() {
		WebUI.callTestCase(findTestCase('Blocks/Menu Account'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("The Login menu butten will be displayed1")
	def TheLoginmenubuttenwillbedisplayed1() {
	WebUI.verifyElementVisible(findTestObject('Login/h1_Login'))
	}
	
	@And("I clik on the Register Link")
	def IclikontheRegisterLink() {
		WebUI.click(findTestObject('Object Repository/Register/a_Not yet a customer'))
	}

	@Then("The Register menu will be displayed")
	def TheRegistermenuwillbedisplayed() {
	WebUI.verifyElementVisible(findTestObject('Register/h1_User Registration'))
	}
	
	@When("I input (.*),(.*),(.*), and (.*) in the fields")
	def Iinputregis(String Email, Password, Password_repeat, Dilan1991 ) {

		WebUI.verifyElementVisible(findTestObject('Register/h1_User Registration'))

		WebUI.setText(findTestObject('Object Repository/Register/input_Register Email'), Email)

		WebUI.setEncryptedText(findTestObject('Register/input_Register Password'), Password)

		WebUI.setEncryptedText(findTestObject('Register/input_Repeat Password'), Password_repeat)

		if (Password_advice == 'true') {
		WebUI.click(findTestObject('Register/span_Show password advice'))
		}

		WebUI.click(findTestObject('Register/Span_Scurity question'))

		def choiseQuestion = Question

		switch (choiseQuestion) {
			case choiseQuestion = 'favorite book':
			println(choiseQuestion)

			WebUI.click(findTestObject('Register/span_Your favorite book'))

			break
			case choiseQuestion = 'favorite movie':
			println(choiseQuestion)

			WebUI.click(findTestObject('Register/span_Your favorite movie'))

			break
			case choiseQuestion = 'name pet':
			println(choiseQuestion)

			WebUI.click(findTestObject('Register/span_Name of your favorite pet'))}

		switch (choiseQuestion) {
			case choiseQuestion = 'favorite book':
			println(choiseQuestion)

			WebUI.setText(findTestObject('Register/input_Security Answer'), Favorite_book)

			break
			case choiseQuestion = 'favorite movie':
			println(choiseQuestion)

			WebUI.setText(findTestObject('Register/input_Security Answer'), Favorite_movei)

			break
			case choiseQuestion = 'name pet':
			println(choiseQuestion)

			WebUI.setText(findTestObject('Register/input_Security Answer'), Name_pet)
			}
		}
	
	

	@And("I click on the register button")
	def Iclickontheregisterbutton() {
		WebUI.click(findTestObject('Register/button_Register'))
	}
	
	@Then("The Login menu butten will be displayed2")
		def TheLoginmenubuttenwillbedisplayed2() {
		WebUI.verifyElementVisible(findTestObject('Login/h1_Login'), FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)
		}
	}
	