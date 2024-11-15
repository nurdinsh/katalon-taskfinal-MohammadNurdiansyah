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
WebUI.click(findTestObject('Account Menu/button_Account'))

'step 3'
WebUI.click(findTestObject('Account Menu/button_Login'))

'step 4'
WebUI.callTestCase(findTestCase('Blocks/Register'), [('Email') : Email, ('Password') : Password, ('Password_repeat') : PasswordRepeat
        , ('Password_advice') : 'false', ('Question') : Question, ('Favorite_book') : Favorite_book, ('Favorite_movei') : Favorite_movei
        , ('Name_pet') : Name_pet], FailureHandling.STOP_ON_FAILURE)

'step 7'
WebUI.click(findTestObject('Forgot Password/a_Forgot your password'))

'step 8'
WebUI.delay(1)

'step 9'
WebUI.verifyElementVisible(findTestObject('Forgot Password/h1_Forgot Password'))

'step 10'
WebUI.setText(findTestObject('Forgot Password/input_Forgot Email'), Email)

'step 11'
def choiseQuestion = Question

'step 12'
switch (choiseQuestion) {
    case choiseQuestion = 'favorite book':
        println(choiseQuestion)

        WebUI.setText(findTestObject('Forgot Password/input_Security Question'), Favorite_book)

        break
    case choiseQuestion = 'favorite movie':
        println(choiseQuestion)

        WebUI.setText(findTestObject('Forgot Password/input_Security Question'), Favorite_movei)

        break
    case choiseQuestion = 'name pet':
        println(choiseQuestion)

        WebUI.setText(findTestObject('Forgot Password/input_Security Question'), Name_pet)
}

'step 13'
WebUI.setEncryptedText(findTestObject('Forgot Password/input_New Password'), Password)

'step 14'
WebUI.setEncryptedText(findTestObject('Forgot Password/input_New Password Repeat'), PasswordRepeat)

'step 15'
WebUI.click(findTestObject('Forgot Password/mat-slide-toggle-bar'))

'step 16'
WebUI.delay(2)

'step 17'
WebUI.click(findTestObject('Forgot Password/button_Change'))

'step 18'
WebUI.verifyElementVisible(findTestObject('Object Repository/Forgot Password/div_Your password was successfully changed'))

