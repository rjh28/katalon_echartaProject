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

WebUI.setText(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta/input_User Name_ctl00ContentPlaceHolderBody_075279'), 
    Username)

WebUI.setText(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta/input_Password_ctl00ContentPlaceHolderBodyL_4a6df6'), 
    Password)

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta/input__ctl00ContentPlaceHolderBodyLogin1Ima_a49b81'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Meta Data Search/img'))

WebUI.selectOptionByLabel(findTestObject('FS objects/FS0012_Manage Document Information/select portfolio'), 'Land Title Files', 
    false)

WebUI.setText(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Tree Search/input_Text Search_ctl00ContentPlaceHolderBo_4d9b7a'), 
    'Demo')

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Tree Search/input_Text Inside Document_ctl00ContentPlac_b50f61'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Tree Search/input_Text Search_ctl00ContentPlaceHolderBo_35e8c5'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Tree Search/input_Documents_ctl00ContentPlaceHolderBody_665e4a'))

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.mouseOver(findTestObject('FS objects/FS0012_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Optimized PDF'))

WebUI.switchToWindowTitle('eCharta - View Document')

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - View Document/img'))

WebUI.closeWindowTitle('eCharta - View Document')

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.mouseOver(findTestObject('FS objects/FS0012_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Add to Favorites'))

WebUI.mouseOver(findTestObject('FS objects/FS0012_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Document Information'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Close'))

WebUI.mouseOver(findTestObject('FS objects/FS0012_Manage Document Information/Mouse hover'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Share Document'))

WebUI.setText(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/input_Multiple email addresses should be se_0ee3a7'), 
    'handger28@gmail.com')

WebUI.setText(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/textarea_Message_ctl00ContentPlaceHolderBod_078f87'), 
    'This is test document')

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/input_Share as Link_ctl00ContentPlaceHolder_823870'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Send'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Search Results/a_Close_1'))

WebUI.switchToWindowTitle('eCharta - Tree Search')

WebUI.click(findTestObject('Object Repository/FS objects/FS0012_Manage Document Information/Page_eCharta - Tree Search/input_Company Administrator_ctl00roiButtonLogoutID'))

WebUI.closeBrowser()

