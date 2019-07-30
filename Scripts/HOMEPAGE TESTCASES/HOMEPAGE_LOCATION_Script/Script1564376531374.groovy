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

not_run: if (false) {
    WebUI.comment('I am true')
} else {
    not_run: WebUI.comment('I am false')
}

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.APP_URL)

not_run: if (WebUI.verifyElementVisible(findTestObject('HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_What_select'))) {
    not_run: WebUI.comment('Test Case For search box is visible')

    not_run: WebUI.closeBrowser()
}

WebUI.setText(findTestObject('HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_What_select'), 'hotel')

WebUI.delay(3)

not_run: if (WebUI.verifyElementVisible(findTestObject('HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_What_select'))) {
    not_run: WebUI.comment('Test case for search box is visible or not')

    not_run: WebUI.closeBrowser()
}

if (WebUI.getText(findTestObject('HOMEPAGE_SEARCH_ELEMENTS/Search_Elements/input_What_select')) == ' ') {
    WebUI.comment('box is blank')
} else {
    WebUI.comment('box is filled')
}

