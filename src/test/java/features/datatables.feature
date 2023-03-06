Feature: Data Tables
@ListofStrings 
Scenario: Bill Amount Generation
Given I placed an order for following items
| Cucumber Sandwich  | 2 | 20  |
When I generate the bill
Then A bill for $40 should be generated

@ListofListofStrings 
Scenario: Bill Amount Generation
Given I placed an order for following items
| Cucumber Sandwich  | 2 | 20  |
| Cucumber Salad  | 1 | 15  |
When I generate the bill
Then A bill for $55 should be generated

@ListofMaps
Scenario: Bill Amount Generation
Given I placed an order for following items
| ItemName  | Units | UnitPrice  |
| Cucumber Sandwich  | 2 | 20  |
| Cucumber Salad  | 1 | 15  |
When I generate the bill
Then A bill for $55 should be generated