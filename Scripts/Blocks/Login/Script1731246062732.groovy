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
WebUI.setText(findTestObject('Login/input_Login Email'), Email)

'step 2'
WebUI.setEncryptedText(findTestObject('Login/input_Login Password'), Password)

'step 3'
if (Show_password == 'true') {
    WebUI.click(findTestObject('Login/mat-button-wrapper'), FailureHandling.STOP_ON_FAILURE)
}

'step 4'
if (Checked == 'true') {
    WebUI.check(findTestObject('Login/checkbox_Remember'), FailureHandling.STOP_ON_FAILURE)
}

'step 5'
WebUI.delay(2)

'step 6'
WebUI.click(findTestObject('Login/button_Log in'))

'step 7'
WebUI.verifyElementVisible(findTestObject('Homepage/span_OWASP Home'))

'step 5'
WebUI.delay(2)

