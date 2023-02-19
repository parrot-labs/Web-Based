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

TestData input =findTestData('Data Files/OrangeHRM/OrangeHRM')

for (int baris = 1; baris <= input.getRowNumbers(); baris++) {
	WebUI.click(findTestObject('Object Repository/OrangeHRM/Dashboard/My-Info'))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-FirstName'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-FirstName'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Object Repository/OrangeHRM/My-Info/Input-FirstName'), input.getValue('FirstName', baris))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-MiddleName'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-MiddleName'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Object Repository/OrangeHRM/My-Info/Input-MiddleName'), input.getValue('MiddleName', baris))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-LastName'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-LastName'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Object Repository/OrangeHRM/My-Info/Input-LastName'), input.getValue('LastName', baris))
	WebUI.delay(1)
	WebUI.takeScreenshot()
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-Nickname'), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject('Object Repository/OrangeHRM/My-Info/Input-Nickname'), Keys.chord(Keys.BACK_SPACE))
	WebUI.setText(findTestObject('Object Repository/OrangeHRM/My-Info/Input-Nickname'), input.getValue('NickName', baris))
	WebUI.delay(1)
	WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM/My-Info/Button-Save'), 0)
	WebUI.click(findTestObject('Object Repository/OrangeHRM/My-Info/Button-Save'))
	WebUI.verifyTextPresent('Successfully Updated', false, FailureHandling.OPTIONAL)
	WebUI.takeScreenshot()
	WebUI.refresh()
	WebUI.delay(3)
	WebUI.verifyTextPresent(input.getValue('FirstName', baris), false, FailureHandling.OPTIONAL)
	WebUI.verifyTextPresent(input.getValue('MiddleName', baris), false, FailureHandling.OPTIONAL)
	WebUI.verifyTextPresent(input.getValue('LastName', baris), false, FailureHandling.OPTIONAL)
	WebUI.verifyTextPresent(input.getValue('NickName', baris), false, FailureHandling.OPTIONAL)
}


