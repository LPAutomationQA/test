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

String homepage = findTestData('URLS').getValue(1, 1) + '#cids=2&home='

WebUI.openBrowser(homepage)

WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))

WebUI.setText(findTestObject('Page_Login/input_Email'), 'ibrahima@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Accounting'))

WebUI.click(findTestObject('Accounting/Accounting_Dashboard_Page/Customers_tab'))

WebUI.click(findTestObject('Accounting/Accounting_Dashboard_Page/Invoices_link'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Group By'))

WebUI.click(findTestObject('General/Add Custom Group'))

WebUI.selectOptionByLabel(findTestObject('General/Add Custom Group_dropdowm'), 'Created by', false)

WebUI.click(findTestObject('General/Apply'))

WebUI.delay(5)

'Verify that all invoices appear'
WebUI.verifyTextPresent('Feras Ahmad Ismail Arafah', false)

WebUI.verifyTextPresent('Iyad Ismail Hasan Zabalawi', false)

