# '''
# Created on 24-May-2019
# 
# @author: Veer
# '''
 
import logging
 
from base.genericlibrary import GenericLibrary
import utilities.custom_logger as cl
 
 
class LoginPage(GenericLibrary):
    
    log= cl.customlogger(logging.DEBUG)
     
    def __init__(self, driver):
        super().__init__(driver)
        self.driver=driver
         
    _login_link = "Already have a MyBSF account? Sign in."
    _cancel_popup = "//mat-icon[text()='clear']"
    _email_field = "mat-input-0"
    _pass_filed = "mat-input-1"
    _login_button = "//button[@alt='Sign in to my account button.']"
         
     
    def clickloginlink(self):
        self.elementClick(self._login_link, locatorType="link")
         
    def cancelpopup(self):
        self.elementClick(self._cancel_popup, locatorType="xpath")
         
    def enteremail(self, username):
        self.sendkeys(username, self._email_field)
         
         
    def enterpassword(self, password):
        self.sendkeys(password, self._pass_filed)
         
    def clickonLoginbutton(self):
        self.elementClick(self._login_button, locatorType="xpath")
         
         
         
    def login(self,username, password):
        #self.clickloginlink()
        self.enteremail(username)
        self.enterpassword(password)
        self.clickonLoginbutton()
         
# 
    def verifyLoginFailed(self):
        result = self.isElementPresent(self._cancel_popup, "xpath")
        return result
# 
# 
# #         
# #     def getloginlink(self):
# #         return self.driver.find_element_by_link_text(self._login_link)
# #     
# #     def getcancelpopup(self):
# #         return self.driver.find_element_by_xpath(self._cancel_popup)
# #     
# #     def getemailfield(self):
# #         return self.driver.find_element_by_id(self._email_field)
# #     
# #     def getpasswordfield(self):
# #         return self.driver.find_element_by_id(self._pass_filed)
# #     
# #     def getloginbutton(self):
# #         return self.driver.find_element_by_xpath(self._login_button)
# #     
#     
#          
# 
# #         
# #     def login(self, username, password):
# #         
# #         loginlink = self.driver.find_element_by_link_text("Already have a MyBSF account? Sign in.")
# #         loginlink.click()
# #         
# #         time.sleep(3)
# #         
# # #         wait = WebDriverWait(driver,10, poll_frequency=1, ignored_exceptions=[NoSuchElementException,ElementNotVisibleException, ElementNotSelectableException])
# #         
# # #         element = wait.until(EC.ELEMENT_CLICK_INTERCEPTED(By.))
# #         canclepopup = self.driver.find_element_by_xpath("//mat-icon[text()='clear']")
# #         canclepopup.click()
# #         
# #         usernamefield = self.driver.find_element_by_id("mat-input-0");
# #         usernamefield.send_keys(username)
# #         
# #         passwordfield = self.driver.find_element_by_id("mat-input-1")
# #         passwordfield.send_keys(password)
# #         
# #         loginbutton = self.driver.find_element_by_xpath("//button[@alt='Sign in to my account button.']")
# #         loginbutton.click()
# 
# 
# 
# 
# 
# 


