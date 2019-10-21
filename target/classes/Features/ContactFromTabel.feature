Feature: ToolsQA contact form Feature

Scenario: ToolsQA contact form Test Scenario

Given User is on Create Form Page
When User enters Firstname and Lastname and Country
| vijaya   | lakshmi        | India    |
When Click on Submit button
Then Message displayed Creation Successfully
