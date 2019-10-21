Feature: ToolsQA contact form Feature

Scenario: ToolsQA contact form Test Scenario

Given User is on Create Form Page
When User enters Firstname and Lastname and Country
| Firstname| Lastname       | Country  |
| vijaya   | lakshmi        | India    |
| Lavanya  | Ranganathan    | Swiz     |
| Sirisha  | K              | canada   |
Then Message displayed Creation Successfully
