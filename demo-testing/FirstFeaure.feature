@tag
Feature: Evaluate Product Offering
  Evaluating the scenario of checking 
  the discounts on various items

  @tag1
  Scenario: Verify 20% offer
    Given Execute DiscountService Business
    When Customer purchase item worth 6000 
    Then Should get twenty percent discount

  @tag1
  Scenario: Verify 30% offer
    Given Execute DiscountService Business
    When Customer purchase item worth 11000 
    Then Should get thirty percent discount

   @tag1
  Scenario: Verify No offer
    Given Execute DiscountService Business
    When Customer purchase item worth 3000 
    Then Should get NA as discount
  
    