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

'Launch Browser'
WebUI.openBrowser('')

'Navigate to the URL\r\n'
WebUI.navigateToUrl('https://usda-fs.dcpi-pilot.com/Default.aspx')

'Enter Username'
WebUI.setText(findTestObject('CRE objects/CRE002_Logout/Page_eCharta/input_User Name'), Username)

'Enter Password\r\n'
WebUI.setText(findTestObject('CRE objects/CRE002_Logout/Page_eCharta/input_Password'), Password)

'Click login button'
WebUI.click(findTestObject('CRE objects/CRE002_Logout/Page_eCharta/Login Button'))

'Click logout button'
WebUI.click(findTestObject('CRE objects/CRE002_Logout/Page_eCharta - Meta Data Search/Logout Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('You are now logged out from your session.', false)

WebUI.closeBrowser()

