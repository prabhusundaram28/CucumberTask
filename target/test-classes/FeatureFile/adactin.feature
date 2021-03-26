Feature: Verifying the adactin webpage

  @smoke
  Scenario Outline: Verifying the adactin webpage with all valid credentails
    Given user is on the adactin webpage
    When user should enter "<username>" and "<password>"
    Then user should click login button
    Then user should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkInDate>","<checkOutDate>","<adultsperroom>"and"<childperroom>"
    Then user should click search button
    Then user should verfiy navigates to select hotel
    Then user should select the hotel and click the continue button
    Then user should enter the "<fname>","<lname>","<address>","<ccnum>","<ccType>","<expMonth>","<expyaer>" and "<cvvNum>"
    Then user should click the book now button
    And user should print the orderId num

    Examples: 
      | username  | password | location | hotels         | roomtype | noofrooms | checkInDate | checkOutDate | adultsperroom | childperroom | fname  | lname | address | ccnum            | ccType | expMonth | expyaer | cvvNum |
      | dinu00007 | 7DZCF3   | Sydney   | Hotel Sunshine | Standard | 1 - One   | 25/03/2021  | 26/03/2021   | 1 - One       | 1 - One      | dinesh | k     | ngl     | 1234567890123456 | VISA   | July     |    2022 |    123 |

  @smoke
  Scenario Outline: Verifying mandatory functions only
    Given user is on the adactin webpage
    When user should enter "<username>" and "<password>"
    Then user should click login button
    Then user should enter "<location>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsperroom>"and"<childperroom>"
    Then user should click search button
    Then user should verfiy navigates to select hotel
    Then user should select the hotel and click the continue button
    Then user should enter the "<fname>","<lname>","<address>","<ccnum>","<ccType>","<expMonth>","<expyaer>" and "<cvvNum>"
    Then user should click the book now button
    And user should print the orderId num

    Examples: 
      | username  | password | location | noOfRooms | checkInDate | checkOutDate | adultsperroom | childperroom | fname  | lname | address | ccnum            | ccType | expMonth | expyaer | cvvNum |
      | dinu00007 | 7DZCF3   | Sydney   | 1 - One   | 25/03/2021  | 26/03/2021   | 1 - One       | 1 - One      | dinesh | krish | ngl     | 1234567890123456 | VISA   | July     |    2022 |    123 |

  @smoke
  Scenario Outline: Verifying checkIn date and checkOut date
    Given user is on the adactin webpage
    When user should enter "<username>" and "<password>"
    Then user should click login button
    Then user should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkInDate>","<checkOutDate>","<adultsperroom>"and"<childperroom>"
    Then user should click search button
    Then user should verify the error message

    Examples: 
      | username  | password | location | hotels         | roomtype | noofrooms | checkInDate | checkOutDate | adultsperroom | childperroom |
      | dinu00007 | 7DZCF3   | Sydney   | Hotel Sunshine | Standard | 1 - One   | 20/03/2021  | 18/02/2021   | 1 - One       | 1 - One      |

  @smoke
  Scenario Outline: Verifying without enter any fields to click search hotel button
    Given user is on the adactin webpage
    When user should enter "<username>" and "<password>"
    Then user should click login button
    Then user should click search button
    Then user should verify empty error message

    Examples: 
      | username  | password |
      | dinu00007 | 7DZCF3   |
