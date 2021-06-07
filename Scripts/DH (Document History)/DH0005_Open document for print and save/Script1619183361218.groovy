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

WebUI.setText(findTestObject('Document History/DH0004_Open Document/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Document History/DH0004_Open Document/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Document History/DH0004_Open Document/Page_eCharta/click login button'))

WebUI.click(findTestObject('Document History/DH0004_Open Document/Page_eCharta - Meta Data Search/click favourite document tab'))

WebUI.click(findTestObject('Document History/DH0004_Open Document/Page_eCharta - Document History/click document history button'))

WebUI.mouseOver(findTestObject('Document History/DH0004_Open Document/Mouse Hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0004_Open Document/Page_eCharta - Document History/a_Optimized PDF'))

WebUI.switchToWindowTitle('eCharta - View Document')

WebUI.click(findTestObject('Object Repository/Document History/DH0004_Open Document/Page_eCharta - View Document/img'))

WebUI.closeWindowTitle('eCharta - View Document')

WebUI.switchToWindowTitle('eCharta - Document History')

WebUI.click(findTestObject('Document History/DH0004_Open Document/Page_eCharta - Document History/click logout button'))

WebUI.closeBrowser()

