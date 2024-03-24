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

WebUI.callTestCase(findTestCase('Login Test Cases/TC 01 _ LoginWithValidData'), null)

WebUI.click(findTestObject('Object Repository/HomePageObjects/computers_tab'))

WebUI.waitForElementVisible(findTestObject('ComputersPageObjects/desktops_link'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('ComputersPageObjects/desktops_link'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/DesktopsPageObjects/lenovo_600_product'), GlobalVariable.actionTimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/DesktopsPageObjects/Add_to_cart_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/DesktopsPageObjects/shopping_cart_link'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('Object Repository/DesktopsPageObjects/shopping_cart_link'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/ShoppingCartPageObjects/checkout_btn'), GlobalVariable.actionTimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ShoppingCartPageObjects/terms_of_service_checkbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ShoppingCartPageObjects/checkout_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ConfirmationPageObjects/select_country_list'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/select_country_list'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ConfirmationPageObjects/selected_country'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/selected_country'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ConfirmationPageObjects/address_field'), address)

WebUI.setText(findTestObject('Object Repository/ConfirmationPageObjects/city_field'), city)

WebUI.setText(findTestObject('Object Repository/ConfirmationPageObjects/phone_number_field'), phone_number)

WebUI.scrollToElement(findTestObject('Object Repository/ConfirmationPageObjects/postal_code_field'), GlobalVariable.actionTimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ConfirmationPageObjects/postal_code_field'), postal_code)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/shipping_address_continue_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ConfirmationPageObjects/shipping_method_continue_btn'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/shipping_method_continue_btn'))

WebUI.waitForElementVisible(findTestObject('Object Repository/ConfirmationPageObjects/payment_method_continue_btn'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/payment_method_continue_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ConfirmationPageObjects/payment_info_continue_btn'), GlobalVariable.waitTimeOut)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/payment_info_continue_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.delayTimeOut)

WebUI.scrollToElement(findTestObject('Object Repository/ConfirmationPageObjects/confirm_order_btn'), GlobalVariable.actionTimeOut, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ConfirmationPageObjects/confirm_order_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/ConfirmationPageObjects/order_successfull_msg'), GlobalVariable.waitTimeOut)

