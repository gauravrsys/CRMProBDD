Feature: Contact page module
Scenario: To verify add new contact functionality

Given user is on add new contact page
When user enters firstname and lastname and clicks on save button
Then new user should get added