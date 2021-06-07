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

WebUI.setText(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 
    'LGulawani')

WebUI.setEncryptedText(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta/input_Password_ctl00ContentPlaceHolderBodyL_4a6df6'), 
    'InXphC9k2qV3FEDd5begzA==')

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta/input__ctl00ContentPlaceHolderBodyLogin1Ima_a49b81'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Meta Data Search/input_Company Administrator_ctl00roiButtonA_944978'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/img'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/select_--All--Demo status gropu11Demo statu_69375d'), 
    'Test Land Status', false)

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/a_File Renaming'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/input_Create filename from meta tags_ctl00C_99de3c'))

WebUI.click(findTestObject('ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/select tag'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/input_Available Tags_ctl00ContentPlaceHolde_215f0d'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/a_Confirm'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/a_Close'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Company Administration/input_Company Administrator_ctl00roiButtonLogoutID'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0028_set file renaming option/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

