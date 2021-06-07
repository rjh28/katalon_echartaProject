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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://usda-fs.dcpi-pilot.com/Default.aspx?')

WebUI.setText(findTestObject('Object Repository/CRE objects/CRE0003_forgot password/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 
    'LGulawani')

WebUI.click(findTestObject('Object Repository/CRE objects/CRE0003_forgot password/Page_eCharta/a_Forgot Password'))

WebUI.setText(findTestObject('CRE objects/CRE0003_forgot password/enter username'), 'abc')

WebUI.click(findTestObject('CRE objects/CRE0003_forgot password/click Submit button'))

WebUI.verifyTextPresent('The system created a new password and has sent it to your email address. Please login with the new password and change your password the first time you log in.', 
    false)

WebUI.click(findTestObject('CRE objects/CRE0003_forgot password/click Back to login link'))

WebUI.closeBrowser()

