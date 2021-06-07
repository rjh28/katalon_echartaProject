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

WebUI.setText(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta/enter username'), 
    Username)

WebUI.setText(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta/enter password'), 
    Password)

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta/click login button'))

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Meta Data Search/click browse option button'))

WebUI.selectOptionByLabel(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Tree Search/select portfolio'), 
    'Mineral Leases', false)

WebUI.setText(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Tree Search/enter document name'), 
    'test')

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Tree Search/select Both type radio button'))

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Tree Search/click search button'))

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Tree Search/click document in list button'))

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Search Results/click update all button'))

WebUI.setText(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Search Results/enter language key'), 
    'Marathi')

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/select replace radio button'))

WebUI.setText(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Search Results/enter revision number'), 
    'new')

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Search Results/click update link'))

WebUI.verifyTextPresent('Documents updated successfully.', true)

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Search Results/click back link'))

WebUI.switchToWindowTitle('eCharta - Tree Search')

WebUI.click(findTestObject('FS objects/FS0004_update all search results from List Format/Page_eCharta - Tree Search/click logout button'))

WebUI.closeBrowser()

