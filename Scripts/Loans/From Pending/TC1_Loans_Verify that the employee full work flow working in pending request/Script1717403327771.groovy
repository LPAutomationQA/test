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

String HomePageURL = findTestData('URLS').getValue(1, 1) + findTestData('URLS').getValue(2, 1)
WebUI.openBrowser(HomePageURL)

WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))

WebUI.setText(findTestObject('Page_Login/input_Email'), findTestData('Employees under SH').getValue(1, randomNumber))

WebUI.setText(findTestObject('Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Main_Page/Loans'))

WebUI.click(findTestObject('General/Create_button'))

WebUI.setText(findTestObject('Loans/Loan Amount'), randomNumber.toString())

WebUI.click(findTestObject('General/Save_button'))

WebUI.delay(4)

WebUI.click(findTestObject('Loans/Submit to manager_button'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('Loans/Pending HR Approval stage'), 'title', 'Current state', 0)

WebUI.verifyElementText(findTestObject('Loans/Respnsable Approver'), 'HR Loans Team')

WebUI.click(findTestObject('General/span_Username'))

'Employee create new loan '
WebUI.click(findTestObject('General/a_Log out'))

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmad.khaleel@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=1341&model=mail.activity&view_type=list&cids=2&menu_id=813' // Pending task page
    )

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'Loan')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=767&model=x_loan&view_type=kanban&cids=2&menu_id=414' // All Loan page
    )

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Request'))

WebUI.verifyTextPresent(findTestData('Employees under SH').getValue(2, randomNumber).trim(), false)

WebUI.verifyElementAttributeValue(findTestObject('Loans/Pending Finance approval stage'), 'title', 'Current state', 0)

WebUI.verifyElementText(findTestObject('Loans/Respnsable Approver'), 'Accounting Team')

WebUI.click(findTestObject('General/span_Username'))

'HR Approve Loan'
WebUI.click(findTestObject('General/a_Log out'))

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), 'ahmads@leading-point.com')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=1341&model=mail.activity&view_type=list&cids=2&menu_id=813' // Pending task page
    )

WebUI.delay(5)


WebUI.setText(findTestObject('General/Search_field'), 'Loan')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Timesheets/Span_Select all'))

WebUI.click(findTestObject('Pending Tasks/span_Action'))

WebUI.click(findTestObject('Pending Tasks/a_Approve Selected'))


WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=767&model=x_loan&view_type=kanban&cids=2&menu_id=414' // All Loan page
    )

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Request'))

WebUI.verifyTextPresent(findTestData('Employees under SH').getValue(2, randomNumber).trim(), false)

'Finance Approve Loan'
WebUI.verifyElementAttributeValue(findTestObject('Loans/Pending Director approval stage'), 'title', 'Current state', 0)

WebUI.verifyElementText(findTestObject('Loans/Respnsable Approver'), findTestData('Employees under SH').getValue(5, randomNumber))

WebUI.click(findTestObject('General/span_Username'))

WebUI.click(findTestObject('General/a_Log out'))

////////////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), findTestData('Employees under SH').getValue(6, 
        randomNumber))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), '123')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=1341&model=mail.activity&view_type=list&cids=2&menu_id=813' // Pending task page
    )

WebUI.delay(5)

WebUI.setText(findTestObject('General/Search_field'), 'Loan')

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Pending Tasks/span_Approve'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-14157137.dev.odoo.com/web#action=767&model=x_loan&view_type=kanban&cids=2&menu_id=414' // All Loan page
    )

WebUI.click(findTestObject('General/View list'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.delay(5)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Loans/Order'))

WebUI.delay(5)

WebUI.click(findTestObject('General/Request'))

WebUI.verifyTextPresent(findTestData('Employees under SH').getValue(2, randomNumber).trim(), false)

'Director Approve Loan'
WebUI.verifyElementAttributeValue(findTestObject('Loans/Approved stage'), 'title', 'Current state', 0)

