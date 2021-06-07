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

WebUI.setText(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta/click Login button'))

WebUI.click(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta - Meta Data Search/click Manage Documents button'))

WebUI.click(findTestObject('Object Repository/Manage Documents/MD0004_manage download requests/Page_eCharta - Upload File/a_Manage Download Requests'))

WebUI.click(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/click calender icon'))

WebUI.selectOptionByLabel(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/select month'), 
    'Apr', false)

WebUI.click(findTestObject('Object Repository/Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/a_1'))

WebUI.click(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/click calender icon'))

WebUI.click(findTestObject('Object Repository/Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/a_27'))

WebUI.selectOptionByLabel(findTestObject('Manage Documents/MD0004_manage download requests/select Requesting group'), 'Land Status', 
    false)

WebUI.selectOptionByLabel(findTestObject('Manage Documents/MD0004_manage download requests/select Requesting user'), 'All', 
    false)

WebUI.selectOptionByLabel(findTestObject('Manage Documents/MD0004_manage download requests/select Download type'), 'All', 
    false)

WebUI.selectOptionByLabel(findTestObject('Manage Documents/MD0004_manage download requests/select search type'), 'All', 
    false)

WebUI.click(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/click search button'))

WebUI.click(findTestObject('Manage Documents/MD0004_manage download requests/Page_eCharta - Download Requests/click Logout button'))

WebUI.click(findTestObject('Object Repository/Manage Documents/MD0004_manage download requests/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

