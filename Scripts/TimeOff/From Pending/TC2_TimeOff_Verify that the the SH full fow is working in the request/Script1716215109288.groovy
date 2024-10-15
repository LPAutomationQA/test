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

int randomNumber = random.nextInt(10) + 1
def date = new Date().format('dd MM yyyy')

String HomePageURL= findTestData('URLS').getValue(1, 1)+findTestData('URLS').getValue(2, 1)

WebUI.openBrowser(HomePageURL)

WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))

WebUI.setText(findTestObject('Page_Login/input_Email'), findTestData('Employees under DH').getValue(1, randomNumber))

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Time Off'))

String MyTimeOffURL=findTestData('URLS').getValue(1, 6)+findTestData('URLS').getValue(2,6)

WebUI.navigateToUrl(MyTimeOffURL)
WebUI.delay(5)

WebUI.click(findTestObject('General/Create_button'))

WebUI.setText(findTestObject('TimeOff/Time off type DD'), 'paid')

WebUI.sendKeys(findTestObject('TimeOff/Time off type DD'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('TimeOff/From date'), date)

WebUI.setText(findTestObject('TimeOff/To date'), date)

def datetime = new Date().format('dd/MM/yyyy HH:mm:ss')

String TimeOffDescription = 'SH Time off in pending ' + datetime

WebUI.setText(findTestObject('TimeOff/Description input'), TimeOffDescription)

WebUI.click(findTestObject('Expense/Expense_Pages/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('TimeOff/Confirm button'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('TimeOff/Responsible Approver'), findTestData('Employees under DH').getValue(2, randomNumber).trim())

WebUI.verifyElementAttributeValue(findTestObject('TimeOff/Stage Line Manager Approval'), 'title', 'Current state', 0)

WebUI.click(findTestObject('General/span_Username'))

'Employee create new time off '
WebUI.click(findTestObject('General/a_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), findTestData('Employees under DH').getValue(3, 
        randomNumber))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

String PendingTaskURL=findTestData('URLS').getValue(1, 4)+findTestData('URLS').getValue(2,4)

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'Time Off')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('error', false)

WebUI.click(findTestObject('General/span_Username'))

'Line manger approve request from pending task'
WebUI.click(findTestObject('General/a_Log out'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmad.khaleel@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl(PendingTaskURL)

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'Time Off')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.delay(5)

WebUI.verifyTextNotPresent('error', false)

