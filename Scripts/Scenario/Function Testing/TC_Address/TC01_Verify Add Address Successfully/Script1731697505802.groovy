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
WebUI.callTestCase(findTestCase('Blocks/Register'), [('Email') : Email, ('Password') : Password, ('Password_repeat') : Password_repeat
        , ('Password_advice') : Password_advice, ('Question') : Question, ('Favorite_book') : Favorite_book, ('Favorite_movei') : Favorite_movei
        , ('Name_pet') : Name_pet], FailureHandling.STOP_ON_FAILURE)

'step 5'
WebUI.callTestCase(findTestCase('Blocks/Login'), [('Email') : Email, ('Password') : Password, ('Show_password') : Show_password
        , ('Checked') : Checked], FailureHandling.STOP_ON_FAILURE)

'step 6'
WebUI.delay(1)

'step 7'
WebUI.click(findTestObject('Account Menu Loged in/button_Account Loged in'))

'step 8'
WebUI.mouseOver(findTestObject('Account Menu Loged in/button_Orders and Payment'))

'step 9'
WebUI.click(findTestObject('Object Repository/Order and Paymen/Address/button_My saved addresses'))

'step 10'
WebUI.click(findTestObject('Object Repository/Order and Paymen/Address/button_Add New Address'))

'step 11'
WebUI.delay(1)

'step 12'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Contry User'), Country)

'step 13'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Name User'), Name)

'step 14'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Mobile Number'), Mobile_number)

'step 15'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_Zip Code'), ZIP_code)

'step 16'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/textarea_Address User'), Address)

'step 17'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_City User'), City)

'step 18'
WebUI.setText(findTestObject('Object Repository/Order and Paymen/Address/input_State User'), State)

'step 20'
WebUI.click(findTestObject('Object Repository/Order and Paymen/Address/button_Submit'))

'step 21'
WebUI.delay(2)

'step 22'
WebUI.verifyElementVisible(findTestObject('Order and Paymen/Address/h1_My saved addresses'))

'step 23'
WebUI.closeBrowser()

