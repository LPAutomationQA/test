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

WebUI.click(findTestObject('Main_Page/Expenses'))

WebUI.delay(4)

WebUI.click(findTestObject('General/Create_button'))

def datetime = new Date().format('dd/MM/yyyy HH:mm:ss')

String ExpenseName = 'Reject Employee Expense Same Dep in pending' + datetime

WebUI.setText(findTestObject('Expense/Expense_Pages/input_Title'), ExpenseName)

WebUI.selectOptionByLabel(findTestObject('Expense/Expense_Pages/select_Expense For'), 'Project', false)

'Project in same dep'
WebUI.setText(findTestObject('Expense/Expense_Pages/input_Project'), 'BA_SalesPoint')

WebUI.sendKeys(findTestObject('Expense/Expense_Pages/input_Project'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Expense/Expense_Pages/input_Type'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Expense/Expense_Pages/input_Type'), 'Cell Phones')

Random random = new Random()

int randomNumber = random.nextInt(1520) + 1

WebUI.clearText(findTestObject('Expense/Expense_Pages/input_Unit Price'))

WebUI.setText(findTestObject('Expense/Expense_Pages/input_Unit Price'), randomNumber.toString())

WebUI.click(findTestObject('Expense/Expense_Pages/button_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Expense/Expense_Pages/span_Submit to manager'))

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
'User Create request'
WebUI.delay(4)

WebUI.verifyElementText(findTestObject('Expense/Expense_Pages/Responsible Approver'), 'Banan Emad Majed AL- Momani')

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'banan.almomani@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

String PendingTaskURL = findTestData('URLS').getValue(1, 1) + "#action=1341&model=mail.activity&view_type=list&cids=2&menu_id=813"
WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(4)

WebUI.setText(findTestObject('General/Search_field'), 'Expense')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Reject Selected'))

WebUI.setText(findTestObject('Object Repository/Pending Tasks/Reason to reject'), 'PM reject same from pending ' + datetime)

WebUI.click(findTestObject('Timesheets/Reject button in pending'))

WebUI.delay(5)
String ExpenseURL = findTestData('URLS').getValue(1, 1) + "#action=1008&cids=2&menu_id=268&model=hr.expense.sheet&view_type=kanban"
WebUI.navigateToUrl(ExpenseURL)
WebUI.delay(5)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(4)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(4)

WebUI.click(findTestObject('General/Request'))

WebUI.delay(4)

WebUI.verifyElementAttributeValue(findTestObject('Expense/Expense_Pages/Stage Reject'), 'title', 'Current state', 0)

