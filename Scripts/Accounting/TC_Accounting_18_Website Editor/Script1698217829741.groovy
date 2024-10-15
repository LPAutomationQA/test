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

CustomKeywords.'loginHelper.Login.login'('mohammad.nwaider@leading-point.com', '123')

WebUI.verifyElementNotPresent(findTestObject('Main_Page/Accounting'), 0)

// Alreday logged (the direct UL is open)


//WebUI.navigateToUrl(findTestData('URLS').getValue(1, 1)+'#action=252&model=account.journal&view_type=kanban&cids=2&menu_id=299')
//
//WebUI.delay(5)
//
//WebUI.verifyTextPresent('Access Error', false)
//
//WebUI.click(findTestObject('General/Ok_Delete_button'))
//
//WebUI.navigateToUrl(findTestData('URLS').getValue(1, 1)+'#id=1202&action=197&model=account.move&view_type=form&cids=2&menu_id=299')
//
//WebUI.delay(5)
//
//WebUI.verifyTextPresent('Access Error', false)
//
//WebUI.click(findTestObject('General/Ok_Delete_button'))
//
//WebUI.navigateToUrl(findTestData('URLS').getValue(1, 1)+'#id=6584&action=196&model=account.move&view_type=form&cids=2&menu_id=299')
//
//WebUI.delay(5)
//
//WebUI.verifyTextPresent('Access Error', false)
//
//WebUI.click(findTestObject('General/Ok_Delete_button'))
//
//WebUI.navigateToUrl(findTestData('URLS').getValue(1, 1)+'#id=329&action=171&model=account.payment&view_type=form&cids=2&menu_id=299')
//
//WebUI.delay(5)
//
//WebUI.verifyTextPresent('Access Error', false)
//
//WebUI.click(findTestObject('General/Ok_Delete_button'))
//
//WebUI.navigateToUrl(findTestData('URLS').getValue(1, 1)+'#id=2342&action=480&model=res.partner&view_type=form&cids=2&menu_id=299')
//
//WebUI.delay(5)
//
//WebUI.verifyTextPresent('Access Error', false)
//
//WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.closeBrowser()
