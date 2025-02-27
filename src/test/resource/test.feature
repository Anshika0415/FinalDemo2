Feature: Login Functionality

@test
Scenario Outline: Login in the site
  Given agent enters "<username>" and "<password>"
  When agent clicks on submit button
  Then agent should be able to login

Examples:
  | username | password |
  | test@email.com   | abcabc   |
  
