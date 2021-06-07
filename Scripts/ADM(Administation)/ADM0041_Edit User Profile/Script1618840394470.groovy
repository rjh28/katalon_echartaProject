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

WebUI.setText(findTestObject('ADM objects/ADM0041_edit user profile/Page_eCharta/enter Username'), Username)

WebUI.setText(findTestObject('ADM objects/ADM0041_edit user profile/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('ADM objects/ADM0041_edit user profile/Page_eCharta/click login button'))

WebUI.click(findTestObject('ADM objects/ADM0041_edit user profile/Page_eCharta - Meta Data Search/click adminisration button'))

WebUI.click(findTestObject('ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/click users tab'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/select_-- All --Demo status gropu11Demo sta_057d20'), 
    'Land Status', false)

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/input_Filter on Username_ctl00ContentPlaceH_26ec96'), 
    'test')

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/input_Filter on Username_ctl00ContentPlaceH_f572d8'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/a_TestUser'))

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/input_First Name_ctl00ContentPlaceHolderBod_67dc28'), 
    'DemoUser1128')

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/input_Last Name_ctl00ContentPlaceHolderBody_78b432'), 
    'User1128')

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/input_Reset User Session_ctl00ContentPlaceH_b1677a'))

WebUI.delay(1)

WebUI.verifyTextPresent('User profile has been updated.', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Company Administration/input_Company Administrator_ctl00roiButtonLogoutID'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0041_edit user profile/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

