# '''
# Created on 26-May-2019
# 
# @author: Veer
# '''
# 
# from unittest import TestLoader, TestSuite
# from pyunitreport import HTMLTestRunner
# 
# from tests.home.test_chrome import LoginTestChrome
# import unittest
# 
# tc1 = unittest.TestLoader().loadTestsFromTestCase(LoginTestChrome)
# 
# smoke_test = TestSuite([tc1])
# 
# unittest.TextTestRunner(smoke_test)
