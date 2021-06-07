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

WebUI.navigateToUrl(Url)

WebUI.setText(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 
    Username)

WebUI.setText(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta/input_Password_ctl00ContentPlaceHolderBodyL_4a6df6'), 
    Password)

WebUI.click(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta/input__ctl00ContentPlaceHolderBodyLogin1Ima_a49b81'))

WebUI.selectOptionByLabel(findTestObject('Browse Search/BS0009_Enhance Filtered Search/Select portfolio'), 'Land Title Files', 
    true)

WebUI.setText(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/input_Text Search_ctl00ContentPlaceHolderBo_4d9b7a'), 
    'Demo')

WebUI.click(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/input_Text Inside Document_ctl00ContentPlac_b50f61'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/input_Text Search_ctl00ContentPlaceHolderBo_35e8c5'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/a_Select'))

WebUI.selectOptionByLabel(findTestObject('Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/select state from dropdown list'), 
    'ALABAMA', true)

WebUI.click(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/a_Select_1'))

WebUI.selectOptionByLabel(findTestObject('Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/select identification number from dropdown list'), 
    'TAL0017', true)

WebUI.click(findTestObject('Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Meta Data Search/click logout button'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0009_Enhance Filtered Search/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

