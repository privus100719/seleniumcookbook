'''
Created on 25-May-2019

@author: Veer
'''
import unittest
from pages.home.login_page import LoginPage
import utilities.custom_logger as cl
import logging
from base.testStatus import TestStatus
from base.genericlibrary import GenericLibrary
import HtmlTestRunner
from HtmlTestRunner.runner import HTMLTestRunner

class LoginTestChrome(unittest.TestCase):
    
    log= cl.customlogger(logging.DEBUG)
    
    
    def Test01_reachSignIn_form_homepage(self):
        driver = None
        baseurl = "https://bsf:cloud9@uat.mybsf.org"
        lp = LoginPage(driver)
        lp.launchBrowser("chrome")
        lp.getUrl(baseurl)            
        lp.maxWindow()
        lp.clickloginlink()
        print('Test01_reachSignIn_form_homepage')
    
    def Test02_SignIn_form_homepage(self):
        driver = None
        baseurl = "https://bsf:cloud9@uat.mybsf.org"
        lp = LoginPage(driver)
        lp.launchBrowser("chrome")
        lp.getUrl(baseurl)            
        lp.maxWindow()
        lp.clickloginlink()
        lp.sleepTime(2)
        lp.cancelpopup()
        lp.login("rajveer.it91+2019@gmail.com", "123456")
        lp.takeScreenshot("Test01_SignIn_form_homepage")
        print("Test02_SignIn_form_homepage")  

                 
lt = LoginTestChrome()
lt.Test01_reachSignIn_form_homepage()
lt.Test02_SignIn_form_homepage()
         
# if __name__ == '__main__':
#         unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner())
     

