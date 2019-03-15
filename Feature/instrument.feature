#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given The "LME" Instrument "PB_03_2018" with these details
    |  lastTradingDate     | deliveryDate |  market           | label               |
    |  15-03-2018            | 17-03-2018    |  LME_PB           | Lead 13 March 2018  |
    
    When "LME" publishes instrument "PB_03_2018"
    Then The application publishes the following instrument internally
    |  lastTradingDate | deliveryDate  |  market           | label              | tradable           |
    |  15-03-2018        | 17-03-2018     |  PB               | Lead 13 March 2018 |  TRUE              |

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The "LME" instrument "PB_03_2018" with these details
    |  lastTradingDate  | deliveryDate |  market   | label              |
    |  15-03-2018         | 17-03-2018    |  LME_PB   | Lead 13 March 2018 |
    And a "PRIME" instrument "PRIME_PB_03_2018" with these details
    |  lastTradingDate | deliveryDate |  market      | label              | exchangeCode | tradable|
    |  14-03-2018        | 18-03-2018    |  LME_PB      | Lead 13 March 2018 | PB_03_2018    | FALSE   |
    When "LME" publishes instrument "PB_03_2018"
    Then the application publishes the following instrument internally
    |  lastTradingDate | deliveryDate |  market  | label                 |  tradable       |
    |  15-03-2018        | 17-03-2018    |  PB      | Lead 13 March 2018    |  TRUE           |

    When "PRIME" publishes instrument "PB_03_2018"
    Then the application publishes the following instrument internally
    |  lastTradingDate  | deliveryDate |  market | label              |  tradable      |
    |  15-03-2018         | 17-03-2018    |  PB     | Lead 13 March 2018 |  FALSE         |

