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

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 
    Username)

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta/input_Password_ctl00ContentPlaceHolderBodyL_4a6df6'), 
    Password)

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta/input__ctl00ContentPlaceHolderBodyLogin1Ima_a49b81'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Meta Data Search/input_Company Administrator_ctl00roiButtonA_944978'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/img'))

WebUI.selectOptionByLabel(findTestObject('ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/select_-- All --Demo status gropu11Demo'), 
    'Test Land Status', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/input_Filter on Username_ctl00ContentPlaceH_26ec96'), 
    'test')

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/input_Filter on Username_ctl00ContentPlaceH_f572d8'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/a_TestUser20'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/a_Reset Password'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.verifyTextPresent('Password has been reset successfully, email has been sent to user', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0042_reset user password/Page_eCharta - Company Administration/input_Company Administrator_ctl00roiButtonLogoutID'))

WebUI.closeBrowser()

