'''
Created on 25-May-2019

@author: Veer
'''

'''
Created on 25-May-2019

@author: Veer
'''
import unittest
import HtmlTestRunner
import xmlrunner

class UnitTestDemos(unittest.TestCase):
    
    @classmethod
    def setUpClass(cls):  # i am like @beforetest
        super(UnitTestDemos, cls).setUpClass()
        print("#" * 30)
        print("i will run only once before all test")
        print("#" * 30)   
    def setUp(self):  # i am like @beforemethod
        print("i will run befre every test")
        
    def test_01(self):
        print("i am test 01")
        
    def test_02(self):
        print("i am test 02")
    
    def tearDown(self): # i am like @afetremethod
        print("i will run after every test")
        
    @classmethod
    def tearDownClass(cls): # i am like @afetretest
        super(UnitTestDemos, cls).tearDownClass()
        print("#" * 30)
        print("i will run only once after all test")
        print("#" * 30)  
        
#         
# if __name__ == '__main__':
#         unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(output="C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report"))
# # test_runner =HtmlTestRunner.HTMLTestRunner(output='./html_report')
# test_runner.run(test_suite)
#         
# if __name__ == '__main__':
#         unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(output="C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/html_report"))
#         unittest.main(test_runner = xmlrunner.XMLTestRunner(output="C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/xml_report"))
        


        
if __name__=='__main__':
    unittest.main(verbosity=2)
    
