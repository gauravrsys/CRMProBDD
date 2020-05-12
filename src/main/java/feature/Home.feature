Feature: Home page module

Scenario: to verify contact list page
Given user is on homepage
When user clicks on contacts menu
Then user should navigated to contact list page

Scenario: to verify add contact functionality

Given user is on homepage
When user clicks on new contact under contacts menu
Then user should navigated to add new contact page