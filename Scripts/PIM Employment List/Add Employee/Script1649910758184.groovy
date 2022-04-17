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

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/a_Add Employee'))

WebUI.setText(findTestObject('Add Employee/Page_OrangeHRM/input__firstName'), 'Karim')

WebUI.setText(findTestObject('Add Employee/Page_OrangeHRM/input__lastName'), 'Sulaiman')

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/p'))

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/input_Gender_personaloptGender'))

WebUI.selectOptionByValue(findTestObject('Add Employee/Page_OrangeHRM/select_-- Select --AfghanAlbanianAlgerianAm_aef347'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Add Employee/Page_OrangeHRM/select_-- Select --SingleMarriedOther'), 'Single', 
    true)

WebUI.click(findTestObject('Add Employee/Page_OrangeHRM/input__btnSave'))

