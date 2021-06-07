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

WebUI.setText(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta/enter username'), 
    Username)

WebUI.setText(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta/enter password'), 
    Password)

WebUI.click(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta/click login button'))

WebUI.click(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta - Meta Data Search/click document history button'))

WebUI.mouseOver(findTestObject('Document History/DH0003_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Optimized PDF'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Document History/DH0003_Manage Document Information/click view with pdf viwer'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.mouseOver(findTestObject('Document History/DH0003_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Add to Favorites'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Document History/DH0003_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Document Information'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Close'))

WebUI.mouseOver(findTestObject('Document History/DH0003_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Share Document'))

WebUI.setText(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta - Document History/enter email address'), 
    'handger28@gmail.com')

WebUI.setText(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta - Document History/enter message'), 
    'This is demo document')

WebUI.click(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta - Document History/select send redio button'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Send'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Document History/a_Close_1'))

WebUI.click(findTestObject('Document History/DH0003_Manage Document Information/Page_eCharta - Document History/click logout button'))

WebUI.click(findTestObject('Object Repository/Document History/DH0003_Manage Document Information/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

