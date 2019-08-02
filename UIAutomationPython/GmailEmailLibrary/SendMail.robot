*** Settings ***
Library           GmailEmailLibrary
# Resource    ../test/GmailEmailLibrary

*** Test Cases ***
Send Email Has Attachment Test
    Send Mail With Attachment    
    services@seleniummaster.com    **********    
    test@test.com    Python Email Test    This is python test    test.txt

Send Email No Attachment Test
     Send Mail No Attachment    
     services@seleniummaster.com    **********    
     test@test.com    This is a test, this is a test    Test is in progress