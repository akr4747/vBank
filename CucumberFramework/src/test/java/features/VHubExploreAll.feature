Feature: Verify Explore All functionality on vHub

  Background:
    Given the user is logged in and lands on the vHub Home page

  @vHub
  Scenario: Verify the Trending Explore All Assets
    When the user performs Trending Explore All
    Then the system should apply the Trending filter

  @vHub
  Scenario: Verify the Featured Explore All Assets
    When the user performs Featured Explore All
    Then the system should apply the Featured filter

  @vHub
  Scenario: Verify the Most Popular Explore All Assets
    When the user performs Most Popular Explore All
    Then the system should apply the Most Popular filter

  @vHub
  Scenario: Verify the Top Use Cases Explore All Assets
    When the user performs Top Use Cases Explore All
    Then the system should apply the Top Use Cases filter

  @vHub
  Scenario: Verify the Top Partners Explore All Assets
    When the user performs Top Partners Explore All
    Then the system should apply the Top Partners filter
