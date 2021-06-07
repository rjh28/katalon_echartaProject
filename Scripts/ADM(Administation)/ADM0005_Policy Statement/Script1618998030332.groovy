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

WebUI.setText(findTestObject('Policies/POL0001_privacy policy (User View)/Page_eCharta/enter username'), Username)

WebUI.setText(findTestObject('Policies/POL0001_privacy policy (User View)/Page_eCharta/enter password'), Password)

WebUI.click(findTestObject('Policies/POL0001_privacy policy (User View)/Page_eCharta/click login button'))

WebUI.click(findTestObject('Policies/POL0001_privacy policy (User View)/Page_eCharta - Meta Data Search/click Administration button'))

WebUI.click(findTestObject('Object Repository/Policies/POL0001_privacy policy (User View)/Page_eCharta - Company Administration/span_Policy Statement'))

WebUI.switchToFrame(findTestObject('Policies/POL0001_privacy policy (User View)/iframe first'), 0)

WebUI.switchToFrame(findTestObject('Policies/POL0001_privacy policy (User View)/iframe second'), 0)

WebUI.sendKeys(findTestObject('Policies/POL0001_privacy policy (User View)/edit message'), 'Hello')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Policies/POL0001_privacy policy (User View)/iframe first'), 0)

WebUI.click(findTestObject('Policies/POL0001_privacy policy (User View)/update button'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Policies/POL0001_privacy policy (User View)/click Logout button'))

WebUI.click(findTestObject('Object Repository/Policies/POL0001_privacy policy (User View)/Page_eCharta - Logout/a_Return to Login Page'))

WebUI.closeBrowser()

