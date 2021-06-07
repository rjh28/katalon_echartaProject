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

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta/click Login button'))

WebUI.click(findTestObject('Object Repository/FS objects/FS0008_Update All Search Results/Page_eCharta - Meta Data Search/img'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/FS objects/FS0008_Update All Search Results/Page_eCharta - Tree Search/select_Land Title FilesMineral Leases'), 
    'Mineral Leases', false)

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Tree Search/enter document name'), 
    'test')

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Tree Search/selct Both type radio button'))

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Tree Search/click search button'))

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Tree Search/click Display In Grid button'))

WebUI.switchToWindowTitle('eCharta - Search Results')

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/click Update All button'))

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/enter townlship number'), 
    '15')

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/enter township direction'), 
    'S')

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/enter range number'), 
    '14')

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/enter unit code'), 
    'No value')

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/select replace radio button for Unit code'))

WebUI.setText(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/enter language'), 
    'Hindi')

WebUI.click(findTestObject('Object Repository/FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/a_Update Keys'))

WebUI.verifyTextPresent('Documents updated successfully.', true)

WebUI.click(findTestObject('Object Repository/FS objects/FS0008_Update All Search Results/Page_eCharta - Search Results/a_Back'))

WebUI.switchToWindowTitle('eCharta - Tree Search')

WebUI.click(findTestObject('FS objects/FS0008_Update All Search Results/Page_eCharta - Tree Search/click Logout button'))

WebUI.closeBrowser()

