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

WebUI.navigateToUrl('https://test-kointra-web-ui-c3zcno2t6a-ew.a.run.app/signup')

WebUI.setText(findTestObject('SignUp/Page_Kointra/input_Hesap Olutur_firstName'), '"Berra"')

WebUI.setText(findTestObject('SignUp/Page_Kointra/input_Hesap Olutur_lastName'), '"Çiftlik"')

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Hesap Olutur_email'), 'berraciftlikk@gmail.com')

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Phone_phone'), '+90 531 733 13 98')

WebUI.setEncryptedText(findTestObject('deneme/Page_Kointra/input_Phone_password'), 'lktuTHSQk3UFdhB7HradwA==')

WebUI.setEncryptedText(findTestObject('deneme/Page_Kointra/input_Minimum 8 karakter_passwordConfirm'), 'lktuTHSQk3UFdhB7HradwA==')

not_run: WebUI.click(findTestObject('Object Repository/deneme/Page_Kointra/a_artlar ve Koullar'))

WebUI.click(findTestObject('Object Repository/deneme/Page_Kointra/input_Minimum 8 karakter_termsAndConditions'))

not_run: WebUI.click(findTestObject('Object Repository/deneme/Page_Kointra/a_Kiisel Verilerin Korunmas Kanunu'))

WebUI.click(findTestObject('Object Repository/deneme/Page_Kointra/input_artlar ve Koullar_kvkk'))

not_run: WebUI.click(findTestObject('Object Repository/deneme/Page_Kointra/a_Ticari Elektronik leti'))

WebUI.click(findTestObject('Object Repository/deneme/Page_Kointra/input_Kiisel Verilerin Korunmas Kanunu_cmm'))

WebUI.click(findTestObject('Object Repository/login/Page_Kointra/div_reCAPTCHA_recaptcha-checkbox-border'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/img_concat(Seilmemi resim kalmadnda Dorula, , y tklayn)_rc-image-tile-33'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/img_concat(Seilmemi resim kalmadnda Dorula, , y tklayn)_rc-image-tile-33'))

not_run: WebUI.click(findTestObject('Object Repository/login/Page_Kointra/img_concat(Seilmemi resim kalmadnda Dorula, , y tklayn)_rc-image-tile-33'))

not_run: WebUI.click(findTestObject('Signup2/Page_Kointra/button_Dorula'))

WebUI.click(findTestObject('Signup2/Page_Kointra/button_Hesap Olutur'))

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_SMS_form-control'), '573034')

WebUI.click(findTestObject('Signup2/Page_Kointra/button_Gnder'))

WebUI.click(findTestObject('Signup2/Page_Kointra/button_TAMAM'))

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Giri Yap_form-control'), 'berraciftlikk@gmail.com')

WebUI.setEncryptedText(findTestObject('Signup2/Page_Kointra/input_Giri Yap_form-control_1'), 'lktuTHSQk3UFdhB7HradwA==')

WebUI.click(findTestObject('Signup2/Page_Kointra/label_Beni Hatrla'))

WebUI.click(findTestObject('Signup2/Page_Kointra/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Signup2/Page_Kointra/button_Giri Yap'))

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_SMS_form-control'), '624449')

WebUI.click(findTestObject('Signup2/Page_Kointra/button_Gnder'))

WebUI.click(findTestObject('Signup2/Page_Kointra/button_Evet'))

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Adnz_firstName'), 'Zülfiye')

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Soyadnz_lastName'), 'Verep')

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_TC Kimlik Numaras_identityNumber'), '22802410986')

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Doum Tarihi_birthDateDay'), '24')

WebUI.click(findTestObject('Signup2/Page_Kointra/svg_Bir ay seiniz_css-8mmkcg'))

WebUI.click(findTestObject('Signup2/Page_Kointra/div_Aralk'))

WebUI.setText(findTestObject('Page_Kointra/input_Aralk_birthDateYear'), '1981')

WebUI.click(findTestObject('Signup2/Page_Kointra/label_Yeni tip kimlik kart kullanyorum'))

WebUI.setText(findTestObject('Signup2/Page_Kointra/input_Kimlik Kart Seri Numaras_serialNumber'), 'A28T82255')

WebUI.click(findTestObject('Signup2/Page_Kointra/svg_ehrinizi giriniz_css-8mmkcg'))

WebUI.click(findTestObject('Signup2/Page_Kointra/div_SAKARYA'))

WebUI.click(findTestObject('Signup2/Page_Kointra/svg_ehrinizi giriniz_css-8mmkcg'))

WebUI.click(findTestObject('Signup2/Page_Kointra/div_SERDVAN'))

WebUI.click(findTestObject('Signup2/Page_Kointra/input'))

WebUI.closeBrowser()

