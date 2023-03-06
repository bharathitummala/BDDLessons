@Menu
Feature: Menu Management

Background:
Given I setup the test data
And I setup more test data

@Smoketest
Scenario: Add first menu item
Given I have a menu item with name "Cucumber Sandwich" and price 20
When I add that menu item
Then Menu Item with name "Cucumber Sandwich" should be added

@Perf
Scenario: Add second menu item
Given I have a menu item with name "Chicken Sandwich" and price 30
When I add that menu item
Then Menu Item with name "Chicken Sandwich" should be added

@Smoketest @Perf
Scenario: Add third menu item
Given I have a menu item with name "Beef Sandwich" and price 34
When I add that menu item
Then Menu Item with name "Beef Sandwich" should be added
















  