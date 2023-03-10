Feature: BMI Calculations
   Calculating BMI for five different users
   
   #Feature/Scenario Outline/Scenario/Datatable/Background
 
  @Regression
  Scenario Outline: Calculate BMI
    Given Open Calculator url
    Then verify Calculator page
    When user click on BMI Calculator link
    Then verify BMI Calculator page
    When enter '<age>', '<height>' and '<weight>'
    And user click on Calculate button
    Then user verify the result

    Examples: 
      | age | height | weight |
      |  10 |    127 |     40 |
      
      
  
   
