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

WebUI.setText(findTestObject('Page_Login/input_Email'), 'mays.yaghi@leading-point.com')

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

WebUI.setText(findTestObject('Timesheets/input_Project'), 'BA_Sales')

WebUI.sendKeys(findTestObject('Timesheets/input_Project'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Timesheets/input_Task'), 'default task')

WebUI.sendKeys(findTestObject('Timesheets/input_Task'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Timesheets/input_Time Spent Per Day'), '1')

WebUI.sendKeys(findTestObject('Timesheets/input_Time Spent Per Day'), Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.setText(findTestObject('Timesheets/input_Description_name'), 'Timesheet for employee ' + datetime)

WebUI.click(findTestObject('Timesheets/button_Create'))

WebUI.click(findTestObject('Timesheets/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Timesheets/span_Submit to Manger'))

