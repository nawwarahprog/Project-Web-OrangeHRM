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

WebUI.click(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/b_Recruitment'))

WebUI.click(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/a_Candidates'))

WebUI.click(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/input_Method of Application_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/input__addCandidatefirstName'), 'Melisa')

WebUI.setText(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/input__addCandidatelastName'), 'Ahmad')

WebUI.setText(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/input__addCandidateemail'), 'melisaahmad202@gmail.com')

WebUI.setText(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/input_Contact No_addCandidatecontactNo'), 
    '0136780101')

WebUI.selectOptionByValue(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/select_-- Select --Associate IT ManagerJuni_07e71a'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/textarea_Comment_addCandidatecomment'), 
    'Good job')

WebUI.click(findTestObject('Object Repository/Add New Candidate/Page_OrangeHRM/input__btnSave'))

