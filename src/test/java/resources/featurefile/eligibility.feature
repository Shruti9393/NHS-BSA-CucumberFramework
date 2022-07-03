Feature: Eligibility Checker
  As user i like to check to know what help I can get with my NHS costs

  Scenario: Wales Test Ticket - Acceptance Criteria
    Given I am on home page of NHS
    When  I click on accpet cookies
    And   I click on start button
    And   I select my country
    And   I click on nextbutton for country
    And   I select my GP Practice
    And   I click on next button for Gp Practice
    And   I select my Dental Practice
    And   I click on next button for dental practice
    And   I enter my Date Of Birth
    And   I enter my month Of Birth
    And   I enter my year Of Birth
    And   I click on next button for date of birth
    And   I select live with a partner
    And   I click on next button for live with a partner
    And   I select me or my partner is not claim any benefits or tax credits
    And   I click on next button for benefits or tax credits
    And   I select option no for my pregnant or have you given birth in the last 12 months
    And   I click on next button for pregnaice
    And   I select i dont have any injury or illness caused by serving in the armed forces
    And   I click on next button for injury
    And   I select i dont have diabetes
    And   I click on next button for diabetes
    And   I select i dont have glaucoma
    And   I click on next button for glaucoma
    And   I select my and my partner have not more than £16,000 in savings, investments or property
    And   I click on next button for savings and investments
    Then  I should get a result of whether I will get help or not
