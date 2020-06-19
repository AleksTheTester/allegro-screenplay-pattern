Feature: Allegro login

  Background:
    Given User open allegro home page

  Scenario Outline: Login with wrong credentials
    When User open allegro login page
    And User type "<login>" and "<password>"
    And User click login button
    Then User should see validation message

    Examples:
      | login    | password |
      | qw@er.ty | qwerty   |
      | qw@er.ty |          |
      |          | qwerty   |

  Scenario Outline: Login with proper credentials
    When User open allegro login page
    And User type "<login>" and "<password>"
    And User click login button
    Then User should not see validation message

    Examples:
      | login                | password   |
      | mbforskype@gmail.com | testPass1! |



