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

WebUI.setText(findTestObject('Browse Search/BS0003_download files/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Browse Search/BS0003_download files/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta/click login button'))

WebUI.selectOptionByLabel(findTestObject('Browse Search/BS0003_download files/select portfolio'), 'Land Title Files', false)

WebUI.setText(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Meta Data Search/enter document text'), 
    'demo')

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Meta Data Search/select both radio button'))

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Meta Data Search/click search button'))

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Meta Data Search/click download in list button'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Search Results/click download document button'))

WebUI.switchToWindowIndex(2)

WebUI.setText(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Add Download Request/enter download request name'), 
    'Demo request')

WebUI.setText(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Add Download Request/enter download request description'), 
    'This is demo request')

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Add Download Request/click process download request button'))

WebUI.delay(2)

WebUI.verifyTextPresent('The documents will be downloaded and available with 24 hours or less and that an email will be sent once the documents are available.', 
    true)

WebUI.closeWindowIndex(2)

WebUI.delay(2)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Browse Search/BS0003_download files/Page_eCharta - Meta Data Search/click logout button'))

WebUI.closeBrowser()

