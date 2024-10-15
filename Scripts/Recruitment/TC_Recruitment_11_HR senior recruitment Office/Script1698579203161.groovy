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

CustomKeywords.'loginHelper.Login.login'('shauqs@leading-point.com', '1234')

WebUI.click(findTestObject('Main_Page/Recruitment'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Create_button'))

def now = new Date().format('MM/dd/yyyy HH:mm:ss')

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Title_field'), 'HR senior delete Job' + now)

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Location_field'), 'jor')

WebUI.sendKeys(findTestObject('Recruitment/Job_Detail_page/Location_field'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Recruitment/Job_Detail_page/Department_field'), 'a')

WebUI.sendKeys(findTestObject('Recruitment/Job_Detail_page/Department_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('General/Save_button'))

WebUI.click(findTestObject('General/Back_level_0'))

WebUI.setText(findTestObject('General/Search_field'), 'HR senior delete Job' + now)

WebUI.sendKeys(findTestObject('General/Search_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Applications_button'))

WebUI.click(findTestObject('General/Create_button'))

WebUI.setText(findTestObject('Recruitment/Application_Details_page/Application Name_field'), 'HR senior delete app ' + now)

WebUI.click(findTestObject('General/Save_button'))

WebUI.click(findTestObject('General/Action_link'))

WebUI.click(findTestObject('General/Delete_link'))

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.verifyTextNotPresent('HR senior delete app ' + now, false)

WebUI.click(findTestObject('General/Back_level_0'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Menu_link'))

WebUI.click(findTestObject('Recruitment/Recruitment_Main_page/Edit_link'))

WebUI.click(findTestObject('General/Save_button'))

WebUI.click(findTestObject('General/Action_link'))

WebUI.click(findTestObject('General/Delete_link'))

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.verifyTextNotPresent('HR senior delete Job' + now, false)

