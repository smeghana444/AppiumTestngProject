Feature: Navigate to USGA Articles Section
  @NavigateArticleSection
  Scenario Outline: USGA Articles section under Latest
   
    Given Verify the app title
    Then Navigate to championships
    Then select championship "<championshipname>"
    Then click on latest tab
    Then Navigate to Articles section
    Then Verify left and right navigation in articles 
    Then verify publish dates available for all articles cards
    


    Examples:
      | championshipname | 
      | U.S. Senior Open | 
  