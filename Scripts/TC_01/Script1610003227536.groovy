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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

mydata = findTestData('DATA1-1')

//String result_file = 'C://Users//PonG//Katalon Studio//FB_Demo//Data Files//Test_data.xlsx'
//String sheetname = 'Sheet1'

int totalRow = mydata.getRowNumbers()

for (int row = 101; row < totalRow; row++) {

//for (int row = 1; row < 5 ; row++) {
	
println("********** Row = "+row+" **********")

String Q1 = mydata.getValue('Q1', row)

String Q2 = mydata.getValue('Q2', row)

String Q3 = mydata.getValue('Q3', row)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://surveyconduct.feedback180.com/ly0nay7w?eventcode=E1')
//WebUI.navigateToUrl('https://surveyconduct.feedback180.com/jv6li6oq?eventcode=E1')

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('BT_Start'), 30)

WebUI.click(findTestObject('BT_Start'))

//WebUI.waitForElementPresent(findTestObject('sec_1_10'), 30)

WebUI.click(findTestObject('sec_1_10', [('num') : Q1 ]))

WebUI.click(findTestObject('sec_face_1_5', [('num') : Q2 ]))

WebUI.waitForElementPresent(findTestObject('Textarea'), 30)

WebUI.setText(findTestObject('Textarea'), Q3 )

WebUI.click(findTestObject('BT_Send'))

//WebUI.waitForElementPresent(findTestObject('Span_Thankyou'), 30)

WebUI.delay(5)

println("********** Row = "+row+" Completed **********")

WebUI.closeBrowser()

}
