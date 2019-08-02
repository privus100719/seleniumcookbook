'''
Created on 25-May-2019

@author: Veer
'''
from unittest import TestLoader, TestSuite
from pyunitreport import HTMLTestRunner

from tests.home.test_chrome import LoginTestChrome
import unittest

tc1 = TestLoader().loadTestsFromTestCase(LoginTestChrome)
 
smoke_test = TestSuite([tc1])

runner= HTMLTestRunner("C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report/")
runner.run(smoke_test)


    
    
#     
# tc1 = unittest.TestLoader().loadTestsFromTestCase(LoginTestChrome)
# 
# smoke_test = unittest.TestSuite([tc1])
# 
# unittest.TextTestRunner(verbosity=0).run(smoke_test)
# 
# if __name__ == '__main__':
#     unittest.main()
# 
# # runner = HTMLTestRunner("C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report/")
# # runner.run(smoke_test)
