'''
Created on 25-May-2019

@author: Veer
'''
from unittest import TestLoader, TestSuite
from pyunitreport import HTMLTestRunner
from tests.home.login_tests import LoginTests

tc1 = TestLoader().loadTestsFromTestCase(LoginTests)

smoke_test = TestSuite([tc1])


runner = HTMLTestRunner("C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report/")
runner.run(smoke_test)