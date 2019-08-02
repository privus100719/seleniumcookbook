'''
Created on 25-May-2019

@author: Veer
'''

from unittest import TestLoader, TestSuite
from pyunitreport import HTMLTestRunner

from UnitTestdemo.ExampleTests import TestStringMethods
from UnitTestdemo.Example2Tests import TestStringMethodss

example_tests = TestLoader().loadTestsFromTestCase(TestStringMethods)
example2_tests = TestLoader().loadTestsFromTestCase(TestStringMethodss)

suite = TestSuite([example_tests, example2_tests])

# kwargs = {
#     "output": "C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report/report/",
#     "report_name": "report",
#     "failfast": True
# }
runner = HTMLTestRunner("C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report/")
runner.run(suite)