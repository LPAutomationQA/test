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

int randomNumber = random.nextInt(7) + 1

String HomePageURL = findTestData('URLS').getValue(1, 1) + findTestData('URLS').getValue(2, 1)

WebUI.openBrowser(HomePageURL)

WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))

WebUI.setText(findTestObject('Page_Login/input_Email'), 'luays@leading-point.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Loans'))

WebUI.click(findTestObject('General/Create_button'))

WebUI.setText(findTestObject('Loans/Loan Employee field'), 'Luay')

WebUI.sendKeys(findTestObject('Loans/Loan Employee field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Loans/Loan Amount'), randomNumber.toString())


WebUI.click(findTestObject('General/Save_button'))

WebUI.delay(4)

WebUI.click(findTestObject('Loans/Submit to manager_button'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('Loans/Pending HR Approval stage'), 'title', 'Current state', 0)

WebUI.verifyElementText(findTestObject('Loans/Respnsable Approver'), 'HR Loans Team')

WebUI.click(findTestObject('General/span_Username'))

'DH create new loan '
WebUI.click(findTestObject('General/a_Log out'))
////////////////////////////////////////////////////

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmad.khaleel@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=767&model=x_loan&view_type=kanban&cids=2&menu_id=414')

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.click(findTestObject('General/View list'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Filters'))

WebUI.click(findTestObject('Loans/Pending HR Task filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Request'))

WebUI.click(findTestObject('Loans/Approved by HR button'))

WebUI.delay(2)

'HR Approve Loan'
WebUI.verifyElementAttributeValue(findTestObject('Loans/Pending Finance approval stage'), 'title', 'Current state', 0)

WebUI.verifyElementText(findTestObject('Loans/Respnsable Approver'), 'Accounting Team')

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))
//////////////////////////////////////////////////WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmads@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmads@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/webb#action=767&model=x_loan&view_type=kanban&cids=2&menu_id=414')

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.click(findTestObject('General/View list'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Filters'))

WebUI.click(findTestObject('Loans/Pending Finance Approval filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Request'))

WebUI.click(findTestObject('Loans/Approved By Finance button'))

WebUI.delay(5)

'Finance Approve Loan'
WebUI.verifyElementAttributeValue(findTestObject('Loans/Pending Director approval stage'), 'title', 'Current state', 0)

WebUI.verifyElementText(findTestObject('Loans/Respnsable Approver'), 'Feras Ahmad Ismail Arafah')

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ferasa@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=767&model=x_loan&view_type=kanban&cids=2&menu_id=414')

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.click(findTestObject('General/View list'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Filters'))

WebUI.click(findTestObject('Loans/Pending Director Approval filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(2)

WebUI.click(findTestObject('General/Request'))

WebUI.click(findTestObject('Loans/Approved by Director button'))

WebUI.delay(2)

'Director Approve Loan'
WebUI.verifyElementAttributeValue(findTestObject('Loans/Approved stage'), 'title', 'Current state', 0)
