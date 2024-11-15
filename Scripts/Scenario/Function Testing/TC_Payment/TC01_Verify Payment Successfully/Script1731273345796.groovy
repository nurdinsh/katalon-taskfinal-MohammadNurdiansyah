import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'step 1'
WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

'step 2'
WebUI.callTestCase(findTestCase('Blocks/Menu Account'), [:], FailureHandling.STOP_ON_FAILURE)

'step 3'
WebUI.callTestCase(findTestCase('Blocks/Login'), [('Email') : Email, ('Password') : Password, ('Show_password') : Show_password
        , ('Checked') : Checked], FailureHandling.STOP_ON_FAILURE)

'step 4'
WebUI.click(findTestObject('Account Menu Loged in/button_Account Loged in'))

'step 5'
WebUI.mouseOver(findTestObject('Account Menu Loged in/button_Orders and Payment'))

'step 6'
WebUI.click(findTestObject('Account Menu Loged in/SM_Orders and Payment/button_My Payment Options'))

'step 7'
WebUI.verifyElementVisible(findTestObject('Order and Paymen/Payment/h1_My Payment Options'))

'step 8'
WebUI.delay(1)

'step 9'
WebUI.click(findTestObject('Order and Paymen/Payment/mat-Add new card'))

'step 10'
WebUI.delay(1)

'step 11'
WebUI.setText(findTestObject('Order and Paymen/Payment/input_Name'), Name)

'step 12'
WebUI.setText(findTestObject('Order and Paymen/Payment/input_Card Number'), Card_number)

'step 13'
WebUI.selectOptionByValue(findTestObject('Order and Paymen/Payment/select_Expiry Month'), Expiry_month, false)

'step 14'
WebUI.selectOptionByIndex(findTestObject('Order and Paymen/Payment/select_Expiry Year'), Expiry_year, FailureHandling.STOP_ON_FAILURE)

'step 15'
WebUI.delay(2)

'step 16'
WebUI.click(findTestObject('Order and Paymen/Payment/button_Submit'))

'step 17'
WebUI.verifyElementVisible(findTestObject('Order and Paymen/Payment/h1_My Payment Options'))

'step 18'
WebUI.delay(4)

'step 19'
WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

