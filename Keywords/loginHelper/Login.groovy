package loginHelper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {

	@Keyword
	public void login (String username, String password) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		String homepage = findTestData('URLS').getValue(1, 1) + "#cids=2&home="
		WebUI.navigateToUrl(homepage)
		WebUI.click(findTestObject('Page_Unsupported version/button_Continue'))
		WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email'), username)
		WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password'), password)
		WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))
	}
}
