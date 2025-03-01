Feature: Login Functionality

@test
Scenario Outline: Login in the site
  Given agent enters "<username>" and "<password>" and logins
  Then agent performs tasks on practice page

Examples:
  | username | password |
  | test@email.com   | abcabc   |
  
