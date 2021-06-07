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

WebUI.setText(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta/click login button'))

WebUI.click(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta - Meta Data Search/click document history'))

WebUI.selectOptionByIndex(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta - Document History/select no. of records per page'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta - Document History/click page number'))

WebUI.click(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta - Document History/click document link'))

WebUI.switchToWindowTitle('eCharta - View Document')

WebUI.click(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta - View Document/click view with pdf viewer button'))

WebUI.delay(1)

WebUI.closeWindowTitle('eCharta - View Document')

WebUI.switchToWindowTitle('eCharta - Document History')

WebUI.delay(1)

WebUI.click(findTestObject('Document History/DH0001_open document for viewing/Page_eCharta - Document History/click logout button'))

WebUI.click(findTestObject('Object Repository/Document History/DH0001_open document for viewing/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

