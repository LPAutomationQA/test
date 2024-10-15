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

WebUI.click(findTestObject('General/Remove_filter1'))

WebUI.click(findTestObject('General/Group By'))

WebUI.click(findTestObject('General/Add Custom Group'))

WebUI.selectOptionByValue(findTestObject('General/Add Custom Group_dropdowm'), 'create_uid', false)

WebUI.click(findTestObject('General/Apply'))

WebUI.verifyTextPresent('Ahmad Ra’ed Mohammad Khaleel', false)

WebUI.verifyTextPresent('Feras Ahmad Ismail Arafah', false)

WebUI.verifyTextPresent('Luay Hussein Moh`d Abu Shariha', false)

WebUI.verifyTextPresent('Rabea Hasan Fayyad Momani', false)

WebUI.verifyTextPresent('Shauq Waleed Mohammad Shammout', false)

WebUI.verifyTextPresent('Waseem Adnan Mohamed Hejjaz', false)

WebUI.closeBrowser()

