'''
Created on 25-May-2019

@author: Veer
'''
from unittest import TestLoader, TestSuite
from pyunitreport import HTMLTestRunner

from demo.unit_test import UnitTestDemoss
from demo.Unit_tests02 import UnitTestDemos


tc1 = TestLoader().loadTestsFromTestCase(UnitTestDemoss)
tc2 = TestLoader().loadTestsFromTestCase(UnitTestDemos)


smoke_test = TestSuite([tc1,tc2])


runner = HTMLTestRunner("C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report/")
runner.run(smoke_test)

# unittest.TextTestRunner(verbosity=2).run(smoke_test)
