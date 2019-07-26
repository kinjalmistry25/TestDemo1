import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://classic.listingprowp.com/')

WebUI.setText(findTestObject('Object Repository/HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_What_select'), 'restaurant')

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/li_Restaurant'))

WebUI.setText(findTestObject('Object Repository/HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_What_select'), 'Restaurant')

WebUI.click(findTestObject('Object Repository/HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_Where_lp-search-btn'))

WebUI.click(findTestObject('Object Repository/HOMEPAGE_SEARCH_ELEMENTS/Search_Elements_2/div_Save'))

not_run: WebUI.closeBrowser()

