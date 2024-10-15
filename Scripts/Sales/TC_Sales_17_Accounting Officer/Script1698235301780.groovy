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

CustomKeywords.'loginHelper.Login.login'('ibrahima@leading-point.com', '1234')

WebUI.verifyElementNotPresent(findTestObject('Main_Page/Sales'), 0)

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-9058525.dev.odoo.com/web#action=336&model=sale.order&view_type=list&cids=2&menu_id=208')

WebUI.verifyTextPresent('Access Error', false)

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-9058525.dev.odoo.com/web#id=133&action=336&model=sale.order&view_type=form&cids=2&menu_id=208')

WebUI.verifyTextPresent('Access Error', false)

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-9058525.dev.odoo.com/web#action=333&cids=2&menu_id=208&model=sale.order&view_type=list')

WebUI.verifyTextPresent('Access Error', false)

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-9058525.dev.odoo.com/web#action=352&model=sale.report&view_type=dashboard&cids=2&menu_id=208')

WebUI.verifyTextPresent('Access Error', false)

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.navigateToUrl('https://leading-point-ltd-erp-leading-point-erp-stg-9058525.dev.odoo.com/web#action=290&model=crm.team&view_type=list&cids=2&menu_id=208')

WebUI.verifyTextNotPresent('Create', false)

WebUI.closeBrowser()