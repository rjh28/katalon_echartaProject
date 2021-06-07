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

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta/click login button'))

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Meta Data Search/click administration button'))

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click access level button'))

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/enter portfolio name'), 
    'demo')

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click show result'))

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click edit link'))

WebUI.delay(2)

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/cancel previous info'), 
    'Demo Level 01')

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/Enter portfolio description'), 
    'This is demo level 01')

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click cancel link'))

WebUI.delay(1)

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click edit link'))

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/cancel previous info'), 
    'Demo level 01')

WebUI.setText(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/Enter portfolio description'), 
    'This is demo level 01')

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click update link'))

WebUI.delay(1)

WebUI.click(findTestObject('ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Company Administration/click logout button'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0021_edit portfolio access level/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

