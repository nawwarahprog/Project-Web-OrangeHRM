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

WebUI.callTestCase(findTestCase('Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/a_User Management'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/a_Users'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'Farah Ali')

WebUI.setText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUseruserName'), 'FarahA')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserpassword'), 'E7+ZWwpx/m4nM2RhdIPWkg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserconfirmPassword'), 
    'E7+ZWwpx/m4nM2RhdIPWkg==')

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__btnSave'))

