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

String HomePageURL = findTestData('URLS').getValue(1, 1) + findTestData('URLS').getValue(2, 1)

WebUI.openBrowser(HomePageURL)

WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))

WebUI.setText(findTestObject('Page_Login/input_Email'), 'Alis@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Timesheets'))

WebUI.click(findTestObject('Timesheets/button_Create Multiple Entries'))

def datetime = new Date().format('dd/MM/yyyy')

def futureDate = new Date().plus(1).format('dd/MM/yyyy')

WebUI.setText(findTestObject('Timesheets/input_Date From'), datetime)

WebUI.sendKeys(findTestObject('Timesheets/input_Date From'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Timesheets/input_Date To'), futureDate)

WebUI.sendKeys(findTestObject('Timesheets/input_Date To'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Timesheets/input_Project'), 'MO_Intra')

WebUI.sendKeys(findTestObject('Timesheets/input_Project'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Timesheets/input_Task'), 'default task')

WebUI.sendKeys(findTestObject('Timesheets/input_Task'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Timesheets/input_Time Spent Per Day'), '1')

WebUI.sendKeys(findTestObject('Timesheets/input_Time Spent Per Day'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.setText(findTestObject('Timesheets/input_Description_name'), 'Timesheet for DH on other department ' + datetime)

WebUI.click(findTestObject('Timesheets/button_Create'))

WebUI.click(findTestObject('Timesheets/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Timesheets/span_Submit to Manger'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

//WebUI.click(findTestObject('Timesheets/Order'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Timesheets/Order'))
//
//WebUI.delay(5)
WebUI.click(findTestObject('Timesheets/Request'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Timesheets/Responsible Approver'), 'Manal Dyab Abed Ali' // Verify that the responsible approval is PM
    )

WebUI.verifyElementAttributeValue(findTestObject('Awarded day/Stage Pending PM Approval'), 'title', 'Current state', 0 // Verify Pending PM stage 
    )

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

////////////////////////////////////////////////////////////////////// user create request and verify that it move to PM ////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Page_Login/input_Email'), 'manal.ali@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

String PendingTaskURL = findTestData('URLS').getValue(1, 4) + findTestData('URLS').getValue(2, 4)

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'analy')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.verifyTextNotPresent('error', false)

String AllTimesheet = findTestData('URLS').getValue(1, 10) + findTestData('URLS').getValue(2, 10)

WebUI.navigateToUrl(AllTimesheet)

WebUI.delay(5)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'Ali Ismail Jebreel Shehadeh')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Request'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Timesheets/Responsible Approver'), 'Basel m.fatehy m.shafeeq altamimi' // Verify that the responsible approval is DH
    )

WebUI.verifyElementAttributeValue(findTestObject('Awarded day/Stage Second Approval'), 'title', 'Current state', 0 // Verify Pending DH stage 
    )

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

/////////////////////////////////////////////////////////////////////////////PM Approve the request////////////////////////////////////////////
WebUI.setText(findTestObject('Page_Login/input_Email'), 'baselt@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'analy')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.verifyTextNotPresent('error', false)

WebUI.navigateToUrl(AllTimesheet)

WebUI.delay(5)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), datetime)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Request'))

WebUI.verifyElementAttributeValue(findTestObject('Awarded day/Stage Approve'), 'title', 'Current state', 0 // Verify Pending DH stage 
    )



