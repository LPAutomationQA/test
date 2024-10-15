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

Random random = new Random()

int randomNumber = random.nextInt(35) + 1

def date = new Date().plus(9).format('dd/MM/yyyy')

String HomePageURL= findTestData('URLS').getValue(1, 1)+findTestData('URLS').getValue(2, 1)

WebUI.openBrowser(HomePageURL)

WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))

WebUI.setText(findTestObject('Page_Login/input_Email'), findTestData('Employees under SH').getValue(1, randomNumber).trim())

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Time Off'))

String MyTimeOffURL=findTestData('URLS').getValue(1, 6)+findTestData('URLS').getValue(2,6)

WebUI.navigateToUrl(MyTimeOffURL)

WebUI.delay(2)

WebUI.click(findTestObject('General/Create_button'))

WebUI.setText(findTestObject('TimeOff/Time off type DD'), 'paid')

WebUI.sendKeys(findTestObject('TimeOff/Time off type DD'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('TimeOff/From date'), date)

WebUI.setText(findTestObject('TimeOff/To date'), date)

def datetime = new Date().format('dd/MM/yyyy HH:mm:ss')

String TimeOffDescription = 'Employee Time off in req ' + datetime

WebUI.setText(findTestObject('TimeOff/Description input'), TimeOffDescription)

WebUI.click(findTestObject('Expense/Expense_Pages/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('TimeOff/Confirm button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('TimeOff/Responsible Approver'), findTestData('Employees under SH').getValue(3, randomNumber).trim())

WebUI.verifyElementAttributeValue(findTestObject('TimeOff/Stage Line Manager Approval'), 'title', 'Current state', 0)

WebUI.click(findTestObject('General/span_Username'))

'Employee create new time off '
WebUI.click(findTestObject('General/a_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), findTestData('Employees under SH').getValue(4, randomNumber).trim())

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

String AllTimeOffURL=findTestData('URLS').getValue(1, 7)+findTestData('URLS').getValue(2,7)


WebUI.navigateToUrl(AllTimeOffURL)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Request'))

WebUI.delay(2)

WebUI.click(findTestObject('TimeOff/Approve by line manger_button'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Expense/Expense_Pages/Responsible Approver'), 'Ahmad Ra’ed Mohammad Khaleel, Nadia Khalil Mahmoud Abu Tarboush, Shauq Waleed Mohammad Shammout, Yasmeen Bilal Rasmi Abueideh, Ahmad Fawzi Ahmad Hijazi')

WebUI.verifyElementAttributeValue(findTestObject('TimeOff/Stage HR Approval'), 'title', 'Current state', 0)

WebUI.click(findTestObject('General/span_Username'))

'SH Approve request'
WebUI.click(findTestObject('General/a_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmad.khaleel@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl(AllTimeOffURL)

WebUI.click(findTestObject('General/View list'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Request'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Reject Button'))

WebUI.delay(2)

WebUI.setText(findTestObject('TimeOff/Reason to reject timeoff'), 'DH reject in req' + datetime)

WebUI.click(findTestObject('TimeOff/button_Save'))

WebUI.delay(2)

'HR reject'
WebUI.verifyElementAttributeValue(findTestObject('TimeOff/Stage Reject'), 'title', 'Current state', 0)