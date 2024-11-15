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
WebUI.click(findTestObject('Object Repository/Order and Paymen/Address/button_Add New Address'))

'step 2'
WebUI.delay(1)

'step 3'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Contry User'), Country)

'step 4'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Name User'), Name)

'step 5'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Mobile Number'), Mobile_number)

'step 6'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Zip Code'), ZIP_code)

'step 7'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/textarea_Address User'), Address)

'step 8'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_City User'), City)

'step 9'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_State User'), State)

'step 10'
WebUI.delay(1)

'step 11'
WebUI.click(findTestObject('Object Repository/Order and Paymen/Address/button_Submit'))

'step 12'
WebUI.delay(2)

'step 13'
WebUI.verifyElementVisible(findTestObject('Order and Paymen/Address/h1_My saved addresses'))

