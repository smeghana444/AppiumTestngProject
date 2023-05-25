Feature: Navigate to USGA Articles Section
  @NavigateLatestSection
  Scenario Outline: USGA Latest Section
   
    Given Verify the app title
    Then Navigate to championships
    Then select championship "U.S. Open"
    Then click on latest tab
    Then Navigate to Articles section
    Then Total Article Cards and Dates
    Then Verify left and right navigation in articles "2"
    Then Naviagte to quickreads
    Then Total QuickReads Cards and Dates
    Then Verify left and right navigation in quickreads "2"
    Then Verify quickreads readmore and close card
    Then verify social shares in quick reads
    Then Navigate to Social Section
    Then Verify left and right navigation in social section "2"
    Then Navigate to Top CTA


  
  