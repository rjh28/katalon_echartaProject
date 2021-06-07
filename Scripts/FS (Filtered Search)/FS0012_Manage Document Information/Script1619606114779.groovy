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

WebUI.setText(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta/click login button'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Browse Search/BS0012_manage document information/Page_eCharta - Meta Data Search/select_Land Title FilesMineral Leases'), 
    'Mineral Leases', false)

WebUI.setText(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Meta Data Search/enter document name'), 
    'test')

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Meta Data Search/select both type radio button'))

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Meta Data Search/click search button'))

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Meta Data Search/click display in list button'))

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.mouseOver(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/Mouse over'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0012_manage document information/Page_eCharta - Search Results/a_Optimized PDF'))

WebUI.switchToWindowTitle('eCharta - View Document')

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - View Document/click view in pdf viewer button'))

WebUI.closeWindowTitle('eCharta - View Document')

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.mouseOver(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/Mouse over'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0012_manage document information/Page_eCharta - Search Results/a_Add to Favorites'))

WebUI.mouseOver(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/Mouse over'))

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/a_Document Information'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/a_Close'))

WebUI.mouseOver(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/Mouse over'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0012_manage document information/Page_eCharta - Search Results/a_Share Document'))

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/click send link'))

WebUI.setText(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/enter email address'), 
    'handger28@gmail.com')

WebUI.setText(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/enter text message'), 
    'This is test document')

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/select send email as attachent radio button'))

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Search Results/click send link'))

WebUI.verifyTextPresent('Email containing document attachment sent.', true)

WebUI.click(findTestObject('Object Repository/Browse Search/BS0012_manage document information/Page_eCharta - Search Results/a_Close_1'))

WebUI.switchToWindowTitle('eCharta - Meta Data Search')

WebUI.click(findTestObject('Browse Search/BS0012_manage document information/Page_eCharta - Meta Data Search/click logout button'))

WebUI.click(findTestObject('Object Repository/Browse Search/BS0012_manage document information/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

