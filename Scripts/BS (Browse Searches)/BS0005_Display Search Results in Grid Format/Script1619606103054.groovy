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

WebUI.setText(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta/click login button'))

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Meta Data Search/click browse option button'))

WebUI.selectOptionByLabel(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Tree Search/select portfolio'), 
    'Land Title Files', false)

WebUI.setText(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Tree Search/enter document name'), 
    'demo')

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Tree Search/select Both type radio button'))

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Tree Search/click search button'))

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Tree Search/click Display In Grid button'))

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.mouseOver(findTestObject('FS objects/FS0005_display search results in Grid Format/mouse hover'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0005_display search results in Grid Format/Page_eCharta - Search Results/a_Optimized PDF'))

WebUI.switchToWindowTitle('eCharta - View Document')

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - View Document/click View with PDF Viewer button'))

WebUI.switchToWindowTitle('eCharta - Tree Search')

WebUI.click(findTestObject('FS objects/FS0005_display search results in Grid Format/Page_eCharta - Tree Search/click logout button'))

WebUI.closeBrowser()

