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

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta/click Login button'))

WebUI.click(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Meta Data Search/click Administration button'))

WebUI.click(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/click Edit button'))

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company name'), 
    CompanyName)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company Address 1'), 
    CompanyAddress1)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company Address 2'), 
    CompanyAddress2)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company City'), 
    CompanyCity)

WebUI.selectOptionByLabel(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/select State'), 
    CompanyState, false)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company Zip'), 
    CompanyZip)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company Phone'), 
    CompanyPhone)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Company Fax'), 
    CompanyFax)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Description'), 
    Description)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Contact Name'), 
    ContactName)

WebUI.setText(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/enter Contact Phone'), 
    ContactPhone)

WebUI.click(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/click Update button'))

WebUI.click(findTestObject('ADM objects/ADM0001_Manage Company profile/Page_eCharta - Company Administration/click Logout button'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0001_Manage Company profile/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

