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

TestObject input_email = findTestObject('Object Repository/StoreFrontAccount/input_email')
TestObject input_password = findTestObject('Object Repository/StoreFrontAccount/input_password')
TestObject btn_login = findTestObject('Object Repository/StoreFrontAccount/btn_login')

def account = [acc1:[email:"huye",pass:"123"], acc2:[email:"yuh",pass:"987"]]


WebUI.openBrowser('https://auto2023.myshopify.com/account/login')

inputEmail(input_email,"xinchao")
inputPassword(input_password,"1234")

WebUI.click(btn_login)

WebUI.takeScreenshot("hinhttest.png")

def inputEmail(def input_email, def email) {
	for(int i=0;i<5;i++) {
		WebUI.sendKeys(input_email, email)	
		}
}

def inputPassword(def input_password, def pass) {
	try {
		WebUI.sendKeys(input_passwordklasdkfas, pass)
	} catch (Exception  e) {
		// Exception handling
		println("Exception occurred: ")
	}
	
}