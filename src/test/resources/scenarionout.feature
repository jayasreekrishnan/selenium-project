Feature: To validate the login functionality by using invalid credentials
  
  
  @Mytest
Scenario: Successful login for valid username and password
  
  Given to launch the chrome browser and maximize window
  When to launch the url of the facebook application
  When the user enters "Admin1" and "Admin123"
  And Click on the Login button

@Mytest
Scenario: Successful login for invalid username and password
  
  Given to launch the chrome browser and maximize window
  When to launch the url of the facebook application
  When the user enters "Inmakes" and "Inamkes123"
  And Click on the Login button