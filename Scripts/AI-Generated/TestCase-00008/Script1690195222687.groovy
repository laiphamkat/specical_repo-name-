import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_thank-youd279fa-7410-4aff-b830-29d24b779e21'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/thank-you/23d279fa-7410-4aff-b830-29d24b779e21')

'step 2: Add visual checkpoint at Page_thank-youd279fa-7410-4aff-b830-29d24b779e21'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00008_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
