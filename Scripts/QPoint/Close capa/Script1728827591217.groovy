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

WebUI.navigateToUrl('https://qpoint.leading-point.com/templates/Audits.html')

WebUI.setText(findTestObject('CAPA/Page_Login/input_User Name_username'), 'yahiaa')

WebUI.setText(findTestObject('CAPA/Page_Login/input_Password_password'), '123123123$')

WebUI.click(findTestObject('CAPA/Page_Login/button_Login'))

WebUI.click(findTestObject('CAPA/Page_CAPA/div_CAPAs'))

WebUI.setText(findTestObject('CAPA/Page_CAPA/input_Action_Type_filter_box'), '')


for (int rowIndex = 1; rowIndex <= 58; rowIndex++) {
	
	String capa_id = findTestData('CAPA').getValue(1, rowIndex)
	
	WebUI.setText(findTestObject('Object Repository/CAPA/Page_CAPA/input_Action_ID_filter_box'), capa_id)
	
}
