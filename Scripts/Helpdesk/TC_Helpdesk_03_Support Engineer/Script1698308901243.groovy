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

CustomKeywords.'loginHelper.Login.login'('suhibja@leading-point.com', '1234')

WebUI.click(findTestObject('Main_Page/Helpdesk'))

WebUI.click(findTestObject('Helpdesk/Helpdesk_Main_page/Tickets_tab'))

WebUI.click(findTestObject('Helpdesk/Helpdesk_Main_page/All Tickets_link'))

WebUI.click(findTestObject('General/Create_button'))

def datetime = new Date().format('MM/dd/yyyy HH:mm:ss')

WebUI.setText(findTestObject('Helpdesk/Ticket_Details/Ticket_title_field'), 'Support Engineer ticket ' + datetime)

WebUI.setText(findTestObject('Helpdesk/Ticket_Details/Assigned to_field'), 'a')

WebUI.sendKeys(findTestObject('Helpdesk/Ticket_Details/Assigned to_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('General/Save_button'))

WebUI.verifyTextPresent('Support Engineer ticket ' + datetime, false)

WebUI.click(findTestObject('General/Edit_button'))

WebUI.setText(findTestObject('Helpdesk/Ticket_Details/Ticket_title_field'), 'Support Engineer edit ticket ' + 
    datetime)

WebUI.click(findTestObject('General/Save_button'))

WebUI.verifyTextPresent('Support Engineer edit ticket ' + datetime, false)

WebUI.closeBrowser()

