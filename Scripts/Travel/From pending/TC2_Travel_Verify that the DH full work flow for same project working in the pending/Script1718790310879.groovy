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

WebUI.setText(findTestObject('Page_Login/input_Email'), 'alis@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Travel'))

WebUI.delay(5)

WebUI.click(findTestObject('Awarded day/Create_button'))

def datetime = new Date().format('dd/MM/yyyy')

def futureDate = new Date().plus(1).format('dd/MM/yyyy')

String ExpenseName = 'Employee awarded day Same Dep in pending' + datetime

WebUI.selectOptionByLabel(findTestObject('Travel/select_Travel for'), 'Project', false)

WebUI.click(findTestObject('Travel/a_Add a line'))

WebUI.delay(5)

WebUI.setText(findTestObject('Travel/input_project'), 'BA_Sales')

WebUI.sendKeys(findTestObject('Travel/input_project'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Travel/input_percentage'), '100')

WebUI.selectOptionByLabel(findTestObject('Travel/select_Origin'), 'Jordan', false)

WebUI.selectOptionByLabel(findTestObject('Travel/select_Destination'), 'Oman', false)

WebUI.setText(findTestObject('Travel/input_From'), datetime)

WebUI.sendKeys(findTestObject('Travel/input_From'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Travel/input_To'), futureDate)

WebUI.sendKeys(findTestObject('Travel/input_To'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByLabel(findTestObject('Travel/select_Visa status'), 'Resident', false)

WebUI.click(findTestObject('General/Save_button'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Travel/Submit to manager Button'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Travel/Responsible Approver'), 'Banan Emad Majed AL- Momani' // Verify that the responsible approval is PM
    )

WebUI.verifyElementAttributeValue(findTestObject('Awarded day/Stage Pending PM Approval'), 'title', 'Current state', 0 // Verify Pending PM stage 
    )

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

////////////////////////////////////////////////////////////////////// user create request and verify that it move to PM ////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Page_Login/input_Email'), 'banan.almomani@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Awarded Days'))

String PendingTaskURL = findTestData('URLS').getValue(1, 4) + findTestData('URLS').getValue(2, 4)

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'trip')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('error', false)

String MyTeamTrip = findTestData('URLS').getValue(1, 9) + findTestData('URLS').getValue(2, 9)

WebUI.navigateToUrl(MyTeamTrip)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('Travel/Order'))

WebUI.delay(5)


WebUI.click(findTestObject('Travel/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Travel/Request'))

WebUI.verifyElementText(findTestObject('Travel/Responsible Approver'), 'Basel Ahmad Yacoub Hijazi' // Verify that the responsible approval is DH
    )

WebUI.verifyElementAttributeValue(findTestObject('Awarded day/Stage Second Approval'), 'title', 'Current state', 0 // Verify Pending PM stage
    )

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

/////////////////////////////////////////////////////// PM Approve the the request and verify that it move to DH//////////////////////////////////
WebUI.setText(findTestObject('Page_Login/input_Email'), 'baselh@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Awarded Days'))

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'trip')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('error', false)

WebUI.navigateToUrl(MyTeamTrip)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('Travel/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Travel/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Travel/Request'))

WebUI.verifyElementAttributeValue(findTestObject('Awarded day/Stage Approve'), 'title', 'Current state', 0 // Verify Approve stage
    )

