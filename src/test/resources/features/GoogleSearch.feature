Feature: Verify google search functionality
  Scenario: Check the google page opening
    Given enter the link in search box
    Then open the google

    Scenario: Check number of results present on the page
      Given open google
      When Enter a text "computer"
      And press enter
      Then show the results in the list

      Scenario: Check nothing appears
        Given open google
        When press enter
        Then nothing happens

        Scenario: Check irrelevant search
          Given Opengoogle
          When Enter a text "comupter"
          Then Display the text "did you mean"