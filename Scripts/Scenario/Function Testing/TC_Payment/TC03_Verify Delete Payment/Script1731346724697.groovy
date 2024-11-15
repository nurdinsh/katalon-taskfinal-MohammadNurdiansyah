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
WebUI.callTestCase(findTestCase('Blocks/Payment'), [('Name') : 'Mohammad Nurdiansyah', ('Card_number') : '1111111111111111'
        , ('Expiry_month') : '2', ('Expiry_year') : 4], FailureHandling.STOP_ON_FAILURE)

'step 5'
WebUI.verifyElementVisible(findTestObject('Order and Paymen/Payment/h1_My Payment Options'))

'step 8'
WebUI.delay(1)

'step 6'
WebUI.click(findTestObject('Order and Paymen/Payment/button_Delete'))

'step 7'
WebUI.delay(3)

'step 8'
WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

