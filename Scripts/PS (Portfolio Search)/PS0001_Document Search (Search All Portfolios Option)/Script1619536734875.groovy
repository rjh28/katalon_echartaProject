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

WebUI.setText(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta/enter username'), 
    Username)

WebUI.setText(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta/enter password'), 
    Password)

WebUI.click(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta/click Login button'))

WebUI.click(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta - Meta Data Search/click Search All Portfolio button'))

WebUI.setText(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta - Full Text Search/enter document name'), 
    'demo')

WebUI.click(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta - Full Text Search/click search button'))

WebUI.click(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta - Full Text Search/click display in List button'))

WebUI.click(findTestObject('Portfolio search/PS0001_Document Search (Search All Portfolios Option)/Page_eCharta - Full Text Search/click Logout button'))

WebUI.closeBrowser()

