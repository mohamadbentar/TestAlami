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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('VerifikasiEmail/Page_Inbox/input__login'), GlobalVariable.Username)

WebUI.delay(2)

WebUI.click(findTestObject('VerifikasiEmail/Page_Inbox/i_'))

//WebUI.click(findTestObject('Object Repository/VerifikasiEmail/Page_Inbox/i_'))
WebUI.click(findTestObject('VerifikasiEmail/Page_Inbox/button_refresh'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('VerifikasiEmail/Page_Inbox/Mohon persiapkan foto KTP dan NPWP'), 0)

WebUI.click(findTestObject('VerifikasiEmail/Page_Inbox/Klik Button Aktivasi'))

WebUI.delay(5)

WebUI.closeBrowser()

