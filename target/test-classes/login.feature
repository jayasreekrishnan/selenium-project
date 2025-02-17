Feature: Login with invalid credentials

  Scenario: Succesful login with Valid Credentials
  Given the user naviagtes to the login page
  When the launch url and user enters a valid username "Inmakesinfotech"
  And enter the password "Inmakes@123"
  And clicks on Login button
  Then the user get warning message
  
  
  

 
  
  


