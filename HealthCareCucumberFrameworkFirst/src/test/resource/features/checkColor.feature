Feature: Verify  link  color change with mosueHover

  Scenario: verify color
    Given I started application
    Then Validate register  link color is  black before moseHover
    When I mouseHover on the link
    Then Validate register  link color is  red after moseHover
