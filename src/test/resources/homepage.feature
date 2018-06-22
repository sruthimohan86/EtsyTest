Feature:Etsy Homepage

  @homepage
  Scenario: Sports Shoes

    Given I enter homepage "https://www.etsy.com/"
    And I accept settings
    When I click on search box
    And I enter "sports shoes" in search
    And I click on search
    And I click on sort by
    And I sort by lowest price
    Then I should see the results as price from low to high