$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/workspaceSprint13/CucumerAutomation/src/main/java/Features/ContactFrom.feature");
formatter.feature({
  "line": 1,
  "name": "ToolsQA contact form Feature",
  "description": "",
  "id": "toolsqa-contact-form-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "ToolsQA contact form Test Scenario",
  "description": "",
  "id": "toolsqa-contact-form-feature;toolsqa-contact-form-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Create Form Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Firstname and Lastname and Country",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Creation Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactFormStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 4219555722,
  "status": "passed"
});
formatter.match({
  "location": "ContactFormStepDefinition.user_enters_Firstname_and_Lastname_and_Country()"
});
formatter.result({
  "duration": 18727787518,
  "status": "passed"
});
formatter.match({
  "location": "ContactFormStepDefinition.user_Click_submit_button()"
});
formatter.result({
  "duration": 2362332733,
  "status": "passed"
});
formatter.match({
  "location": "ContactFormStepDefinition.message_displayed_Logout_Successfully()"
});
formatter.result({
  "duration": 769102376,
  "status": "passed"
});
});