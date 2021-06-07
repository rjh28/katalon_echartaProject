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

WebUI.setText(findTestObject('Manage Documents/MD0001_add documents/Page_eCharta/enter username'), 
    Username)

WebUI.setText(findTestObject('Manage Documents/MD0001_add documents/Page_eCharta/enter password'), 
    Password)

WebUI.click(findTestObject('Manage Documents/MD0001_add documents/Page_eCharta/click Login button'))

WebUI.click(findTestObject('Manage Documents/MD0001_add documents/Page_eCharta - Meta Data Search/click administration button'))

WebUI.selectOptionByLabel(findTestObject('Manage Documents/MD0001_add documents/Page_eCharta - Upload File/select portfolio'), 
    'Demo Portfolio 1', false)

WebUI.uploadFile(findTestObject('Manage Documents/MD0001_add documents/upload file'), 'C:\\Users\\ram.handge\\ProjectX\\Month April\\22nd April\\Lorem ipsum.pdf')

WebUI.click(findTestObject('Manage Documents/MD0001_add documents/click Insert button'))

WebUI.click(findTestObject('Manage Documents/MD0001_add documents/click second Insert button'))

WebUI.click(findTestObject('Manage Documents/MD0001_add documents/Page_eCharta - Upload File/click Logout button'))

WebUI.click(findTestObject('Object Repository/Manage Documents/MD0001_add documents/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

