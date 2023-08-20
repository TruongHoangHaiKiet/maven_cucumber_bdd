@data_table
Feature: Data table feature

@datatable_step
Scenario Outline: Create new customer with username <username>
Given Open facebook application
When Input to username and username
    # Data table (every step)
| username   | password   | address   |
| <username> | <password> | <address> |
And Click on login button
Then Verify submitted infor displayed
| username   | address   |
| <username> | <address> |
When Open Customer page
And Input to Customer name textbox <customer name>
And Input to City textbox <city>
And Input to other required fields
| phone      | email                  |
| 0999888777 | automationFC@gmail.com |
And Close application
    # Data table ( Both all steps and Scenario)
Examples:
| username                      | customer name | city | password | address |
| automationtestingUI@gmail.com | automationFC  | HCM  | 123123   | le loi  |

@datatable_scenario @data_driven_testing
Scenario Outline: Data table in Scenario
Given Open facebook application
When Input to username textbox with "<username>"
And Input to password textbox with "<password>"
And Click on login button
And Close application
Examples:
| username                        | password |
| automationtestingUI01@gmail.com | 123123   |
| automationtestingUI02@gmail.com | 123123   |
| automationtestingUI03@gmail.com | 123123   |

@datatable_step_non_param
Scenario Outline: Create new customer with username <username>
Given Open facebook application
When Input to username and password
    # Data table (every step)
| username                        | password |
| automationtestingUI01@gmail.com | 123123   |
| automationtestingUI02@gmail.com | 123123   |
| automationtestingUI03@gmail.com | 123123   |
And Click on login button
And Close application
Examples:
| username                      | password |
| automationtestingUI@gmail.com | 123123   |