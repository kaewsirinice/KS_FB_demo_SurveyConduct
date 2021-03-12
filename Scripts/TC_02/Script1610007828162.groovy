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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

mydata = findTestData('DATA2')

//row = 1 

int totalRow = mydata.getRowNumbers()

for (int row = 9; row < totalRow; row++) {

//for (int row = 1; row < 5 ; row++) {
	
println("******* TC2 Row = "+row+ " *******")

String Q1 = mydata.getValue('Q1', row)

String Q2 = mydata.getValue('Q2', row)

String Q3 = mydata.getValue('Q3', row)


WebUI.openBrowser('')

WebUI.navigateToUrl('https://app-cxvoicesurveyweb-uat.azurewebsites.net/E1/1')
//WebUI.navigateToUrl('https://cxv.feedback180.com/E1/1')

WebUI.waitForPageLoad(30)

//WebUI.waitForAlert(20)

//WebUI.acceptAlert()

WebUI.waitForElementPresent(findTestObject('BT_Start'), 30)

WebUI.click(findTestObject('BT_Start'))

//WebUI.waitForElementPresent(findTestObject('ClosePopup'), 30)

//WebUI.click(findTestObject('ClosePopup'))

WebUI.delay(1)

WebUI.setText(findTestObject('Textarea'), Q1)

WebUI.click(findTestObject('BT_Next'))

//WebUI.waitForElementPresent(findTestObject('ClosePopup'), 30)

//WebUI.click(findTestObject('ClosePopup'))

WebUI.delay(1)

WebUI.setText(findTestObject('Textarea'), Q2)

WebUI.click(findTestObject('BT_Next'))

//WebUI.waitForElementPresent(findTestObject('ClosePopup'), 30)

//WebUI.click(findTestObject('ClosePopup'))

WebUI.delay(1)

WebUI.setText(findTestObject('Textarea'), Q3)

WebUI.click(findTestObject('BT_Next'))

println("********** Row = "+row+" Completed **********")

WebUI.delay(10)

WebUI.closeBrowser()

}