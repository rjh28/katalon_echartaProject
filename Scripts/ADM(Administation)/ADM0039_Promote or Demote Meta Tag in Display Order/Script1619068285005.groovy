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

WebUI.setText(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta/click login button'))

WebUI.click(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta - Meta Data Search/click administration button'))

WebUI.click(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta - Company Administration/click search tags button'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/ADM objects/ADM0039_promote or demote meta tags/Page_eCharta - Company Administration/select_--All--Land StatusTest Land StatusDe_71bd5b'), 
    'Test Land Status', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('ADM objects/ADM0039_promote or demote meta tags/select portfolio from dropdown'), 
    'Demo Portfolio 1', false)

WebUI.delay(1)

WebUI.click(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta - Company Administration/click promote button'))

WebUI.verifyElementText(findTestObject('ADM objects/ADM0039_promote or demote meta tags/verification text'), 'Meta Tag Sort Order has been successfully updated.')

WebUI.click(findTestObject('ADM objects/ADM0039_promote or demote meta tags/Page_eCharta - Company Administration/click logout button'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0039_promote or demote meta tags/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

