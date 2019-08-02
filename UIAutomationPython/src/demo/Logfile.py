'''
Created on 25-May-2019

@author: Veer
'''

import logging

class logfile():
    
 def test_log(self):
    
    logging.basicConfig(filename='C:/Users/rajve/workspace/Oxygen Workspace/MyBSFUIAutomationPython/log_report/test.log', level=logging.DEBUG)
    
    logging.warning("warning")
    logging.info("info")
    logging.debug("debug")
    print("log done")

l= logfile()
l.test_log()