Feature: To validate search and menu button funtionanlity
Scenario: To check whether products can be enter in the searchbox or not
Given user should launch the chrome and load the url
When user should enter the valid product in the search box
And user should enter the click or enter 
Then user could be see searched product or not

Scenario: To check the search box can accept numbers
Given user should launch the chrome and load the url
When user should enter invalid product and numbers
Then user should check incorrect credential page

Scenario: To check whether Menu button clickable or not
Given user should launch the chrome and load the url
When user should click the menu button
Then user should see the dropdown list or not
