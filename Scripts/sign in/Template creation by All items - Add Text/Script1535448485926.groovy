import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.URL)

String url = WebUI.getUrl()

WebUI.maximizeWindow()

url.contentEquals('https://www.fashmates.com00/')

println('success')

WebUI.waitForElementVisible(findTestObject('landing page/landing page cover image'), 10)

WebUI.click(findTestObject('landing page/li_Sign In'))

WebUI.setText(findTestObject('landing page/Click on Email'), 'casmeena25@gmail.com')

WebUI.setText(findTestObject('landing page/Click on password'), 'casperon')

WebUI.click(findTestObject('landing page/Click on sign button'))

WebUI.delay(5)

WebUI.click(findTestObject('landing page/Click on create'))

WebUI.delay(5)

WebUI.click(findTestObject('landing page/a_Create a Template'))

WebUI.delay(5)

WebUI.click(findTestObject('landing page/a_All Items'))

WebUI.delay(5)

WebUI.click(findTestObject('All Items/To Click on Add Text'))

WebUI.delay(5)

WebUI.click(findTestObject('All Items/Click on first element abcd'))

WebUI.delay(5)

WebUI.click(findTestObject('All Items/Click on Publish - to publish temp'))

WebUI.delay(5)

WebUI.click(findTestObject('All Items/button_Publish - popup'))

WebUI.delay(5)

WebUI.setText(findTestObject('All Items/Enter Title - On Publish Template'), 'Fashion ')

WebUI.delay(3)

WebUI.setText(findTestObject('All Items/Enter Instruction - On Publish Template popup'), 'Summer trends ')

WebUI.delay(5)

WebUI.click(findTestObject('All Items/button- Publish Template'))

