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

WebUI.click(findTestObject('Accounting/Accounting_Dashboard_Page/Vendors_link'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.click(findTestObject('General/Group By'))

WebUI.click(findTestObject('General/Add Custom Group'))

WebUI.selectOptionByLabel(findTestObject('General/Add Custom Group_dropdowm'), 'Created by', false)

WebUI.click(findTestObject('General/Apply'))

WebUI.click(findTestObject('General/Group By'))

WebUI.delay(5)

WebUI.verifyTextPresent('Abdalhadi Eid Mohammad Banian', false)

WebUI.closeBrowser()
