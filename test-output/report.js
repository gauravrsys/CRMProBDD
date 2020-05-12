$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contact.feature");
formatter.feature({
  "line": 1,
  "name": "Contact page module",
  "description": "",
  "id": "contact-page-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10959192663,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "To verify add new contact functionality",
  "description": "",
  "id": "contact-page-module;to-verify-add-new-contact-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on add new contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters firstname and lastname and clicks on save button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "new user should get added",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactStepDef.user_is_on_add_new_contact_page()"
});
formatter.result({
  "duration": 14248743777,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDef.user_enters_firstname_and_lastname_and_clicks_on_save_button()"
});
formatter.result({
  "duration": 540195638,
  "status": "passed"
});
formatter.match({
  "location": "ContactStepDef.new_user_should_get_added()"
});
formatter.result({
  "duration": 1353546615,
  "status": "passed"
});
formatter.after({
  "duration": 110290077,
  "status": "passed"
});
formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Home page module",
  "description": "",
  "id": "home-page-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8968442614,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "to verify contact list page",
  "description": "",
  "id": "home-page-module;to-verify-contact-list-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on contacts menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should navigated to contact list page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 10658667140,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.user_clicks_on_contacts_menu()"
});
formatter.result({
  "duration": 243595503,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.user_should_navigated_to_contact_list_page()"
});
formatter.result({
  "duration": 1321303805,
  "status": "passed"
});
formatter.after({
  "duration": 102487239,
  "status": "passed"
});
formatter.before({
  "duration": 12652702551,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "to verify add contact functionality",
  "description": "",
  "id": "home-page-module;to-verify-add-contact-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user clicks on new contact under contacts menu",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should navigated to add new contact page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 10345399953,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.user_clicks_on_new_contact_under_contacts_menu()"
});
formatter.result({
  "duration": 408660269,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDef.user_should_navigated_to_add_new_contact_page()"
});
formatter.result({
  "duration": 2733386196,
  "status": "passed"
});
formatter.after({
  "duration": 91572233,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Module",
  "description": "",
  "id": "login-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8183928874,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "To verify login functionality",
  "description": "",
  "id": "login-module;to-verify-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and enters password and clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 60692839,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_username_and_enters_password_and_clicks_on_login_button()"
});
formatter.result({
  "duration": 10265608788,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 116717637,
  "status": "passed"
});
formatter.after({
  "duration": 61195,
  "status": "passed"
});
});