Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given the page under test is 'https://the-internet.herokuapp.com'
    And show the list of expected links
    Then the list should contain expected items

  @TEST_TI_0001
  Scenario: Basic Auth allows validated access
    Given the page under test is 'https://the-internet.herokuapp.com'
    When the 'Basic Auth' example is opened
    And valid credentials are supplied
    Then Congratulations should be displayed

  @TEST_TI_0001
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    Given the page under test is 'https://the-internet.herokuapp.com'
    When the 'Sortable Data Tables' is opened
    Then Data table should be displayed the following

      |LastName  	|FirstName	|Emailadd               |Duedate  	|WebSite                  |
      |Smith    	|John      	|jsmith@gmail.com     	|$50.00 	|http://www.jsmith.com    |
      |Bach     	|Frank     	|fbach@yahoo.com      	|$51.00 	|http://www.frank.com     |
      |Doe      	|Jason     	|jdoe@hotmail.com     	|$100.00	|http://www.jdoe.com      |
      |Conway   	|Tim       	|tconway@earthlink.net	|$50.00 	|http://www.timconway.com |
