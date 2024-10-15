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

////// DH create job 
CustomKeywords.'loginHelper.Login.login'('alis@leading-point.com', '1234')

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Create_button'))

def now = new Date().format('MM/dd/yyyy HH:mm:ss')

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Title_field'), 'Test Job flow' + now)

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Location_field'), 'Jordan')

WebUI.sendKeys(findTestObject('Recruitment/Job_Detail_page/Location_field'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Department_field'), 'Executive Management / IT Office Basel / Business Applications Department')

WebUI.sendKeys(findTestObject('Recruitment/Job_Detail_page/Department_field'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Recruitment/Application_Details_page/Technical Interviewer_field'), 'Ali Ismail Jebreel Shehadeh')

WebUI.sendKeys(findTestObject('Recruitment/Application_Details_page/Technical Interviewer_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('General/Save_button'))

WebUI.click(findTestObject('General/Menu'))

WebUI.click(findTestObject('General/Log out_link'))

////////////////////////// HR Approve 1 
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'shauqs@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Director Approval_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('General/Menu'))

WebUI.click(findTestObject('General/Log out_link'))

////////////////////////////////////// director approve 1
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ferasa@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), 'Feras@@123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Sourcing Shortlisting_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('General/Menu'))

WebUI.click(findTestObject('General/Log out_link'))

////////////////////////////////////////////////////////// HR approve 1
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'shauqs@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Shortlisted for technical interviews_stage'), 
    'title', 'Current state', 0)

WebUI.click(findTestObject('General/Menu'))

WebUI.click(findTestObject('General/Log out_link'))

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'alis@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Technical Interview_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/HR Interview_stage'), 'title', 'Current state', 
    0)

WebUI.click(findTestObject('General/Menu'))

WebUI.click(findTestObject('General/Log out_link'))

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'shauqs@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Vetting Checking_stage'), 'title', 
    'Current state', 0)

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Salary Approval From Director_stage'), 
    'title', 'Current state', 0)

WebUI.click(findTestObject('General/Menu'))

WebUI.click(findTestObject('General/Log out_link'))

//////////////////////////////////////////////////////// director approve 
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ferasa@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), 'Feras@@123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Candidate Offer Approval_stage'), 
    'title', 'Current state', 0)

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Salary Approval From Director_stage'), 
    'title', 'Current state', 0)

////////////////////// HR Manger
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'waseem.hejjaz@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/Search_field'), 'Test Job flow' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('Recruitment/Application_Details_page/Approve_button'))

WebUI.verifyElementAttributeValue(findTestObject('Recruitment/Application_Details_page/Closed_stage'), 'title', 'Current state', 
    0)

