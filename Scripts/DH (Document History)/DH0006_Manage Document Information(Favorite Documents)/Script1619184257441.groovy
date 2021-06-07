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

WebUI.setText(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 
    Username)

WebUI.setText(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta/input_Password_ctl00ContentPlaceHolderBodyL_4a6df6'), 
    Password)

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta/input__ctl00ContentPlaceHolderBodyLogin1Ima_a49b81'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Meta Data Search/input_Company Administrator_ctl00roiButtonD_3e212f'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/input_Document History_ctl00ContentPlaceHol_8654ec'))

WebUI.mouseOver(findTestObject('Document History/DH0006_document info/Mouse hover'))

WebUI.click(findTestObject('Document History/DH0006_document info/Page_eCharta - Document History/a_Optimized PDF'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.mouseOver(findTestObject('Document History/DH0006_document info/Mouse hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/a_Document Information'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/a_Close'))

WebUI.mouseOver(findTestObject('Document History/DH0006_document info/Mouse hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/a_Share Document'))

WebUI.mouseOver(findTestObject('Document History/DH0006_document info/Mouse hover'))

WebUI.setText(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/input_Multiple email addresses should be se_2c7209'), 
    'handger28@gmail.com')

WebUI.setText(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/textarea_Message_ctl00ContentPlaceHolderBod_a23510'), 
    'This is test document')

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/input_Share as Link_ctl00ContentPlaceHolder_2ee793'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/a_Send'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/a_Close_1'))

WebUI.click(findTestObject('Object Repository/Document History/DH0006_document info/Page_eCharta - Document History/input_Company Administrator_ctl00roiButtonLogoutID'))

WebUI.closeBrowser()

