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

WebUI.setText(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta/input_User Name'), Username)

WebUI.setText(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta/input_Password'), Password)

WebUI.click(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta/input__Login1button'))

WebUI.click(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - Meta Data Search/input_Company Administrator_button'))

WebUI.setText(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - My Account/input_Current Password'), CurrentPassword)

WebUI.setText(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - My Account/input_New Password'), NewPassword)

WebUI.setText(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - My Account/input_Confirm New Password'), 
    ConfirmPassword)

WebUI.click(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - My Account/tbody_Change Password'))

WebUI.click(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - My Account/input_Passwords do not match, please retry._54293a'))

WebUI.click(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - My Account/input_Company Administrator_ButtonLogoutID'))

WebUI.click(findTestObject('CRE objects/CRE0006_ChangePassword/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

