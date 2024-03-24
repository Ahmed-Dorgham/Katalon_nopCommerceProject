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

/*WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.websiteLink)*/
WebUI.waitForElementPresent(findTestObject('Object Repository/WelcomePageObjects/register_link'), GlobalVariable.waitTimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WelcomePageObjects/register_link'))

/*WebUI.setText(findTestObject('Object Repository/RegisterationPageObjects/firstname_field'), first_name)

WebUI.setText(findTestObject('Object Repository/RegisterationPageObjects/lastname_field'), last_name)

WebUI.setText(findTestObject('Object Repository/RegisterationPageObjects/email_field'), GlobalVariable.email)*/

WebUI.scrollToElement(findTestObject('Object Repository/RegisterationPageObjects/password_field'), GlobalVariable.actionTimeOut)

/*WebUI.setText(findTestObject('Object Repository/RegisterationPageObjects/password_field'), GlobalVariable.validPassword)

WebUI.setText(findTestObject('Object Repository/RegisterationPageObjects/confirm_password_field'), GlobalVariable.invalidPassword)*/
WebUI.click(findTestObject('RegisterationPageObjects/register_btn'))
WebUI.verifyElementVisible(findTestObject('RegisterationPageObjects/empty_firstname_error_msg'))
WebUI.verifyElementVisible(findTestObject('RegisterationPageObjects/empty_lastname_error_msg'))
WebUI.verifyElementVisible(findTestObject('RegisterationPageObjects/empty_password_error_msg'))
WebUI.scrollToElement(findTestObject('Object Repository/RegisterationPageObjects/password_field'), GlobalVariable.actionTimeOut)
WebUI.verifyElementVisible(findTestObject('RegisterationPageObjects/empty_password_error_msg'))


WebUI.navigateToUrl(GlobalVariable.websiteLink)

