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
WebUI.verifyElementVisible(findTestObject('Login/h1_Login'))

'step 4'
WebUI.click(findTestObject('Object Repository/Register/a_Not yet a customer'))

'step 5'
WebUI.verifyElementVisible(findTestObject('Register/h1_User Registration'))

'step 6'
WebUI.setText(findTestObject('Object Repository/Register/input_Register Email'), Email)

'step 7'
WebUI.setEncryptedText(findTestObject('Register/input_Register Password'), Password)

'step 8'
WebUI.setEncryptedText(findTestObject('Register/input_Repeat Password'), Password_repeat)

'step 9'
if (Password_advice == 'true') {
    WebUI.click(findTestObject('Register/span_Show password advice'))
}

'step 10'
WebUI.click(findTestObject('Register/Span_Scurity question'))

'step 11'
def choiseQuestion = Question

'step 12'
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

'step 13'
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

        WebUI.setText(findTestObject('Register/input_Security Answer'), Name_pet)}


'step 13'
WebUI.delay(1)

'step 14'
WebUI.click(findTestObject('Register/a_Already a customer'))

'step 15'
WebUI.verifyElementVisible(findTestObject('Login/h1_Login'), FailureHandling.STOP_ON_FAILURE)

'step 16'
WebUI.delay(2)

'step 17'
WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

