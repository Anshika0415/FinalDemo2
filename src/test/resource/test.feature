Feature : Test Lets code it site
@test
Scenario Outline: Login in the site
Given agent enters password and username
When agent clicks on submit button
Then agent should be able to login