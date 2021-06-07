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

WebUI.setText(findTestObject('ADM objects/ADM0004_welcome msg/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('ADM objects/ADM0004_welcome msg/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('ADM objects/ADM0004_welcome msg/Page_eCharta/click Login button'))

WebUI.click(findTestObject('ADM objects/ADM0004_welcome msg/Page_eCharta - Meta Data Search/click Administration button'))

WebUI.click(findTestObject('Object Repository/ADM objects/ADM0004_welcome msg/Page_eCharta - Company Administration/span_Welcome Message'))

WebUI.switchToFrame(findTestObject('ADM objects/ADM0004_welcome msg/Edit Msg main iframe'), 0)

WebUI.switchToFrame(findTestObject('ADM objects/ADM0004_welcome msg/Edit Msg iframe'), 0)

WebUI.clearText(findTestObject('ADM objects/ADM0004_welcome msg/edit Msg-1'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ADM objects/ADM0004_welcome msg/edit Msg-1'), 'Hello,Welcome to the Land Title File')

WebUI.sendKeys(findTestObject('ADM objects/ADM0004_welcome msg/edit Msg-1'), Keys.chord(Keys.ENTER))

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('ADM objects/ADM0004_welcome msg/Edit Msg main iframe'), 0)

WebUI.click(findTestObject('ADM objects/ADM0004_welcome msg/update button'))

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('ADM objects/ADM0004_welcome msg/click Logout button'))

WebUI.closeBrowser()

