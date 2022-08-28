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

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/register/funder')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/input_Nama Lengkap_name'), 'TestNamaAutomation')

WebUI.setText(findTestObject('Page_Daftar Sebagai Pemberi Dana ALAMI/input_Email_email'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/input_No. Handphone_phone'), '081212122323')

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/select_-- Silahkan Pilih --'), 
    '1', true)

WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana ALAMI/button_Lanjutkan'))

//WebUI.verifyElementClickable(findTestObject('Page_Daftar Sebagai Pemberi Dana ALAMI/button_Lanjutkan'))
WebUI.scrollToElement(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/p_Bismillahirrahmanirrahim'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/p_Plaza 89, Kav. X7Jln. H.R. Rasuna Said'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/input_Saya tertarik update info terbaru'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/input_Saya sudah membaca'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana ALAMI/button_Lanjutkan_1'))

WebUI.delay(2)

WebUI.closeBrowser()

