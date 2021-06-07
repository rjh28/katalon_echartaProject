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

WebUI.setText(findTestObject('Browse Search/FS0001_document search option/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Browse Search/FS0001_document search option/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta/click login button'))

WebUI.selectOptionByLabel(findTestObject('Browse Search/FS0001_document search option/select portfolio'), 'Land Title Files', 
    false)

WebUI.setText(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/click text search box'), 
    'demo')

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/select both option redio button'))

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/click search option'))

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/click display in list button'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/click display in grid button'))

WebUI.switchToWindowIndex(1)

not_run: WebUI.delay(2)

not_run: WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/click reset button'))

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Meta Data Search/click logout button'))

WebUI.click(findTestObject('Browse Search/FS0001_document search option/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

