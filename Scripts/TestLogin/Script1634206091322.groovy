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

WebUI.navigateToUrl('https://test-kointra-web-ui-c3zcno2t6a-ew.a.run.app/login')

WebUI.click(findTestObject('Object Repository/login/Page_Kointra/body_function(e,t,a,n,c,m,r)e.yme.ymfunctio_743dc6'))

WebUI.setText(findTestObject('Object Repository/login/Page_Kointra/input_Giri Yap_form-control'), 'kubraverep79@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Kointra/input_Giri Yap_form-control_1'), 'lktuTHSQk3UFdhB7HradwA==')

WebUI.click(findTestObject('Object Repository/login/Page_Kointra/label_Beni Hatrla'))

WebUI.click(findTestObject('Object Repository/login/Page_Kointra/div_reCAPTCHA_recaptcha-checkbox-border'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/img_concat(Seilmemi resim kalmadnda Dorula, , y tklayn)_rc-image-tile-33'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/img_concat(Seilmemi resim kalmadnda Dorula, , y tklayn)_rc-image-tile-33'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/img_concat(Seilmemi resim kalmadnda Dorula, , y tklayn)_rc-image-tile-33'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/button_Dorula'))

WebUI.click(findTestObject('Object Repository/login/Page_Kointra/button_Giri Yap'))

not_run: WebUI.setText(findTestObject('Object Repository/login/Page_Kointra/input_SMS_form-control'), '684250')

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/button_Gnder'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/button_Evet'))

WebUI.closeBrowser()

