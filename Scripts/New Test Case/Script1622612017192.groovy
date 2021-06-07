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

WebUI.navigateToUrl('https://usda-fs.dcpi-pilot.com/Default.aspx')

WebUI.setText(findTestObject('Object Repository/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 'LGulawani')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_eCharta/input_Password_ctl00ContentPlaceHolderBodyL_4a6df6'), 
    'InXphC9k2qV3FEDd5begzA==')

WebUI.click(findTestObject('Object Repository/Page_eCharta/input__ctl00ContentPlaceHolderBodyLogin1Ima_a49b81'))

WebUI.click(findTestObject('Object Repository/Page_eCharta - Meta Data Search/input_Company Administrator_ctl00roiButtonLogoutID'))

WebUI.closeBrowser()

