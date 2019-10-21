#Feature: ToolsQA contact form Feature

#Scenario: ToolsQA contact form Test Scenario

#Given User is on Create Form Page
#When User enters Firstname and Lastname and Country
#When Click on Submit button
#Then Message displayed Creation Successfully

#===========================================================

#Feature: ToolsQA contact form Feature

#Scenario: ToolsQA contact form Test Scenario

#Given User is on Create Form Page
#When User enters "Lavanya" and "Ranganathan" and "India"
#When Click on Submit button
#Then Message displayed Creation Successfully

#===========================================================

Feature: ToolsQA contact form Feature

Scenario Outline: ToolsQA contact form Test Scenario

Given User is on Create Form Page
When User enters "<Firstname>" and "<Lastname>" and "<Country>"
When Click on Submit button
Then Message displayed Creation Successfully

Examples:
	| Firstname | Lastname | Country  |
	| lavanya   | R        | India    |
	|  tom      | test456  | Indonesia|
