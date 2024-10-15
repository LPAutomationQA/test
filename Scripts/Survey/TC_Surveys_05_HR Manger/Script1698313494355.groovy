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

CustomKeywords.'loginHelper.Login.login'('waseem.hejjaz@leading-point.com', '1234')

WebUI.click(findTestObject('Main_Page/Surveys'))

WebUI.click(findTestObject('General/Create_button'))

def datetime = new Date().format('MM/dd/yyyy HH:mm:ss')

WebUI.setText(findTestObject('Survey/Survey_details_page/Survey Title_field'), 'HR Manger delete Survey ' + datetime)

//WebUI.setText(findTestObject('Survey/Survey_details_page/Job Position_field'), 'a')
//
//WebUI.sendKeys(findTestObject('Survey/Survey_details_page/Job Position_field'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('General/Save_button'))

WebUI.verifyTextPresent('HR Manger delete Survey ' + datetime, false)

WebUI.click(findTestObject('General/Action_link'))

WebUI.click(findTestObject('General/Delete_link'))

WebUI.click(findTestObject('General/Ok_Delete_button'))

WebUI.verifyTextNotPresent('HR Manger delete Survey ' + datetime, false)

WebUI.closeBrowser()

