'''
Created on 25-May-2019

@author: Veer
'''
import inspect
import logging


def customlogger(loglevel=logging.DEBUG):
    
    loggerName = inspect.stack()[1][3]
    logger = logging.getLogger(loggerName)
    logger.setLevel(logging.DEBUG)
    
    fileHandler = logging.FileHandler("automation.log",mode='w')
    fileHandler.setLevel(loglevel)
    
    formatter = logging.Formatter('%(asctime)s -%(name)s - %(levelname)s: %(message)s',datefmt='%d %m %Y %I:%M:%S %p')
    fileHandler.setFormatter(formatter)
    logger.addHandler(fileHandler)
    return logger