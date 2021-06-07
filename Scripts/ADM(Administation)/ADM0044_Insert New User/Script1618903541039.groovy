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

WebUI.setText(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta/click login button'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Meta Data Search/click administration button'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/click users tab'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select_-- All --Demo status gropu11Demo sta_057d20'), 
    'Test Land Status', false)

WebUI.setText(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/enter username'), 
    uname)

WebUI.setText(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/enter firstname'), 
    firstname)

WebUI.setText(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/enter lastname'), 
    firstname)

WebUI.setText(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/enter email address'), 
    email)

WebUI.selectOptionByIndex(findTestObject('Object Repository/ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select_demo Test 4Demo Test5DemoTest1Editor_ba7b0a'), 
    '3', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select can upload checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select can generate bulk offloads checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select Can Generate Bulk Uploads checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select Can Export checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select Can Generate Reports checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/select Can Generate Reports all checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/click insert button'))

not_run: WebUI.verifyTextPresent('User is inserted successfully. A temporary password', false)

WebUI.click(findTestObject('ADM objects/ADM0044_insert new user/Page_eCharta - Company Administration/click logout button'))

WebUI.closeBrowser()

