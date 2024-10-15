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

CustomKeywords.'loginHelper.Login.login'('iyadz@leading-point.com', '1234')

WebUI.click(findTestObject('Main_Page/Sales'))

WebUI.click(findTestObject('Sales/Sales_Main_page/Orders_tab'))

WebUI.click(findTestObject('Sales/Sales_Main_page/Orders_link'))

WebUI.click(findTestObject('General/Create_button'))

Random random = new Random()

int randomNumber = random.nextInt(1520) + 1

WebUI.setText(findTestObject('Sales/Quotations_Details_page/Customer_field'), findTestData('Customer').getValue(1, randomNumber))

WebUI.sendKeys(findTestObject('Sales/Quotations_Details_page/Customer_field'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Sales/Quotations_Details_page/Department_field'), 'a')

WebUI.sendKeys(findTestObject('Sales/Quotations_Details_page/Department_field'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Sales/Quotations_Details_page/Pricelist_field'), 'RHC')

WebUI.sendKeys(findTestObject('Sales/Quotations_Details_page/Pricelist_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('General/Save_button'))

WebUI.click(findTestObject('Sales/Quotations_Details_page/Send by Email_button'))

WebUI.click(findTestObject('Sales/Quotations_Details_page/Send_button'))

WebUI.click(findTestObject('Sales/Quotations_Details_page/Confirm_button'))

WebUI.click(findTestObject('General/Action_link'))

WebUI.click(findTestObject('General/Delete_link'))

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.verifyTextPresent('You can not delete a sent quotation or a confirmed sales order. You must first cancel it.', false)

WebUI.closeBrowser()

