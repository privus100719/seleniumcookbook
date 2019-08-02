'''
Created on 26-May-2019

@author: Veer
'''
from coverage import results
from traceback import print_stack
from base.genericlibrary import GenericLibrary
from selenium import webdriver
from pages.home.login_page import LoginPage

class TestStatus(LoginPage):
    
#     log= cl.customlogger(logging.DEBUG)
    
    def __init__(self, driver):
        #self.driver=driver
        
        super(TestStatus, self).__init__(driver)
        self.resultList=[]
        
    def setResult(self, result, resultMessage):
        try:
            if result is not None:
                if result:
                    self.resultList.append("PASS")
                    self.log.info("### VERIFICATION SUCCESSFULL :: +" + resultMessage)
                else:
                    self.resultList.append("FAIL")
                    self.log.error("### VERIFICATION FAILED :: +" + resultMessage)
                    self.takeScreenshot(resultMessage)
            else:
                self.resultList.append("FAIL")
                self.log.error("### VERIFICATION FAILED :: +" + resultMessage)
                self.takeScreenshot(resultMessage)
                
        except:
            self.resultList.append("FAIL")
            self.log.error("### Exception occurred !!!")
            self.takeScreenshot(resultMessage)
            print_stack()
            
    def mark(self,result, resultMessage):
        
        self.setResult(result, resultMessage)
        
        
    def markFinal(self,testName,result, resultMessage):    
        
        self.setResult(result, resultMessage)
        if "FAIL" in self.resultList:
            self.log.error(testName + " ### TEST FAILED")
            self.resultList.clear()
            assert True == False
            
        else:
            self.log.info(testName + "### TEST SUCCESSFUL")
            self.resultList.clear()
            assert True == True
    
        
        
        
        
        
        
        
        
        
        
        
        