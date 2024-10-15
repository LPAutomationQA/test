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

CustomKeywords.'loginHelper.Login.login'('waseem.hejjaz@leading-point.com', '1234')

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

'Add new job'
WebUI.click(findTestObject('General/Create_button'))

def now = new Date().format('MM/dd/yyyy HH:mm:ss')

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Title_field'), 'HR Manger Job' + now)

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Location_field'), 'jor')

WebUI.sendKeys(findTestObject('Recruitment/Job_Detail_page/Location_field'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Department_field'), 'a')

WebUI.sendKeys(findTestObject('Recruitment/Job_Detail_page/Department_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('General/Save_button'))

WebUI.verifyTextPresent('HR Manger Job' + now, false)

WebUI.click(findTestObject('General/Back_level_0'))

WebUI.setText(findTestObject('General/Search_field'), 'HR Manger Job' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Applications_button'))

WebUI.click(findTestObject('General/Create_button'))

WebUI.setText(findTestObject('Recruitment/Application_Details_page/Application Name_field'), 'HR Manger ' + now)

WebUI.click(findTestObject('General/Save_button'))

WebUI.verifyTextPresent('HR Manger ' + now, false)

WebUI.click(findTestObject('Recruitment/Application_Details_page/Initial Qualification_stage'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Initial Qualification_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('Recruitment/Application_Details_page/First Interview_stage'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/First Interview_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('Recruitment/Application_Details_page/Second Interview_stage'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Second Interview_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('Recruitment/Application_Details_page/Contract Proposal_stage'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Contract Proposal_stage'), 'title', 
    'Current state', 0)

