Feature: redRail HomePage
@scenario1
  Scenario: redRail homepage 
  Given the user is on redRail booking app homepage
  When user enters departure city
  And user enters destination city 
  And user wants to select date
  And clicks on the search Trains button
  Then the user should see a list of available trains
  @scenario2
   Scenario: User checks the train status
   Given the user wants to check the status of a train
   When the user enters the train number or name in the search bar
   And user click on the check status 
   Then the system displays the schedule and current status of the train
    @scenario3
   Scenario: redRail homepage
   Given the user is on redRail booking app homepage
   When user enters both source and destination city same
   And user click on search button
   Then the user should get alert message
    @scenario4
   Scenario: redRail homepage
   Given the user is on redRail booking app homepage
   When user clicks on Help 
   Then It shows the Help Topic options 
   
   
   
  
   