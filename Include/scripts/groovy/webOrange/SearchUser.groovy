package webOrange
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SearchUser {

	@Given("User is at login page")
	def atLoginPage(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("User fills textbox with (.*) and (.*)")
	def enterCredentials(String username, String password){
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Username_txtPassword'), password)
	}

	@And("User clicks on login button")
	def ClickLogin(){
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Password_Submit'))
	}

	@When("User navigate to homepage")
	def verifyHomePage(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/Search User/Page_OrangeHRM/b_Dashboard'), 5)
	}

	@When("User clicks Admin")
	def ClickAdmin(){
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/b_Admin'))
	}

	@When("User clicks Management")
	def ClickManagement() {
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/a_User Management'))
	}

	@Then("User is directed to Users page")
	def ClickUsersPage() {
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/a_Users'))
	}

	@Then("User Input Details with (.*) and (.*)")
	def enterDetails(String usrname, String employeeName) {
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Username_searchSystemUseruserName'), usrname)
		WebUI.setText(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Employee Name_searchSystemUseremploye_55f714'), employeeName)
	}
	
	@Then("User select option User Role and Status")
	def SelectOptionUserRoleandStatus() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Search User/Page_OrangeHRM/select_AllAdminESS'), '2', true)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Search User/Page_OrangeHRM/select_AllEnabledDisabled'), '1', true)
	}

	@Then("User clicks Search button")
	def ClickSearchButton() {
		WebUI.click(findTestObject('Object Repository/Search User/Page_OrangeHRM/input_Status__search'))
	}
}