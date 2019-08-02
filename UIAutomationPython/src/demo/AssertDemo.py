

import unittest


class Assertdemo(unittest.TestCase):
    
    def Test_assertdemo01(self):
       a= True
       self.assertTrue(a, "i am not a")
       b= False
       self.assertEqual(b, False)
       
        
        
    def test_assertequals(self):
        
        a = "true"
        b= "false"
        
        self.assertTrue(a, "abc")
        self.assertEqual(a, "true", "equals")
        self.assertNotEqual(a, b,"not equals")
     
if __name__=='__main__':
    unittest.main(verbosity=2)
    
    
a1 = Assertdemo()
a1.Test_assertdemo01()
a1.test_assertequals()