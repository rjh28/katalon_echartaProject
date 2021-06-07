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

WebUI.setText(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta/enter username'), 
    Username)

WebUI.setText(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta/enter password'), 
    Password)

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta/click login button'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Meta Data Search/click administration button'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click access level button'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click privileges link'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click first edit link'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click first checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click first update link'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click second edit link'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click second checkbox'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click second update link'))

not_run: WebUI.click(findTestObject('Object Repository/ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/a_Edit_1_2'))

not_run: WebUI.click(findTestObject('Object Repository/ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/input_Save  Print_ctl00ContentPlaceHolderBo_117fc8'))

not_run: WebUI.click(findTestObject('Object Repository/ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/a_Update_1_2'))

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click exist link'))

WebUI.delay(1)

WebUI.click(findTestObject('ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Company Administration/click logout button'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0022_modify portfolio access level privileges/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

