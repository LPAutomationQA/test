import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.DecimalFormat as DecimalFormat
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

WebUI.setText(findTestObject('Page_Login/input_Email'), 'baselh@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Expenses'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Create_button'))

def datetime = new Date().format('dd/MM/yyyy HH:mm:ss')

String ExpenseName = 'Director Expense Same Dep in pending' + datetime

WebUI.setText(findTestObject('Expense/Expense_Pages/input_Title'), ExpenseName)

WebUI.selectOptionByLabel(findTestObject('Expense/Expense_Pages/select_Expense For'), 'Project', false)

'Project in same dep'
WebUI.setText(findTestObject('Expense/Expense_Pages/input_Project'), 'MO_IntraCast')

WebUI.sendKeys(findTestObject('Expense/Expense_Pages/input_Project'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Expense/Expense_Pages/input_Type'), 'Cell Phones')

WebUI.sendKeys(findTestObject('Expense/Expense_Pages/input_Type'), Keys.chord(Keys.TAB))

Random random = new Random()

int randomNumber = random.nextInt(1520) + 1

WebUI.clearText(findTestObject('Expense/Expense_Pages/input_Unit Price'))

WebUI.setText(findTestObject('Expense/Expense_Pages/input_Unit Price'), randomNumber.toString())

WebUI.click(findTestObject('Expense/Expense_Pages/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Expense/Expense_Pages/span_Submit to manager'))

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Expense/Expense_Pages/Responsible Approver'), 'Manal Dyab Abed Ali')

WebUI.click(findTestObject('General/span_Username'))

'DH Create request'
WebUI.click(findTestObject('General/a_Log out'))

////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'manal.ali@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

String PendingTaskURL = findTestData('URLS').getValue(1, 1) + "#action=1341&model=mail.activity&view_type=list&cids=2&menu_id=813"
WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(4)

WebUI.setText(findTestObject('General/Search_field'), 'Expense')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.delay(5)

String ExpenseURL = findTestData('URLS').getValue(1, 1) + "#action=1008&cids=2&menu_id=268&model=hr.expense.sheet&view_type=kanban"
WebUI.navigateToUrl(ExpenseURL)
WebUI.delay(5)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Request'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Expense/Expense_Pages/Responsible Approver'), 'Basel m.fatehy m.shafeeq altamimi')

WebUI.verifyElementAttributeValue(findTestObject('Expense/Expense_Pages/Stage Second Approval'), 'title', 'Current state', 
    0)

///////////////////////////////////////////////////////////////////////////////////////
WebUI.click(findTestObject('General/span_Username'))

'PM Approve request'
WebUI.click(findTestObject('General/a_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'baselt@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'Expense')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.delay(5)

WebUI.navigateToUrl(ExpenseURL)
WebUI.delay(5)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Request'))

'DH director approve request'
WebUI.delay(3)

WebUI.verifyElementAttributeValue(findTestObject('Expense/Expense_Pages/Stage Approve'), 'title', 'Current state', 0)

