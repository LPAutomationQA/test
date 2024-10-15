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

CustomKeywords.'loginHelper.Login.login'('ibrahima@leading-point.com', '123')

WebUI.click(findTestObject('Main_Page/Accounting'))

WebUI.click(findTestObject('Accounting/Accounting_Dashboard_Page/Vendors_tab'))

WebUI.click(findTestObject('Accounting/Accounting_Dashboard_Page/Refunds_link'))

'Create new Vendor'
WebUI.click(findTestObject('General/Create_button'))

def datetime = new Date().format('MM/dd/yyyy HH:mm:ss')

WebUI.delay(5)

WebUI.click(findTestObject('General/Save_button'))

WebUI.delay(5)

WebUI.verifyTextPresent('Refund Created',false)

'Edit Vendor'
WebUI.click(findTestObject('General/Edit_button'))

WebUI.setText(findTestObject('Accounting/Vendor_Details_page/Vendor__Name_field'), 'Accounting Officer edit Vendor ' + datetime)

WebUI.click(findTestObject('General/Save_button'))

def date = new Date().format('MM/dd/yyyy')

WebUI.delay(5)

WebUI.verifyTextPresent('Accounting Officer edit Vendor ' + date, false)

'Delete Vendor'
WebUI.click(findTestObject('General/Action_link'))

WebUI.click(findTestObject('General/Delete_link'))

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('Accounting Officer edit Vendor ' + date, false)

WebUI.closeBrowser()

