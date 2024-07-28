##  Rest Assured API Automation Example
* API doc: https://reqres.in/

# Tech Stack
* allure
* Java
* rest-assured
* testng

# Test Cases
* HerokuAppPingTest
* HerokuAppGetAllBookingTest
* HerokuAppGetBookingDetailsTest
* ReqResinGetDelayResponseTest
* ReqResinGetListUsers4ResponseTest
* ReqResinGetUseridResponseTest
* ReqResinGetUseridResponseTest2
* ReqResinGetUseridResponseTest3
* ReqResinGetUseridResponseTest4
* ReqResinGetUseridResponseTest5
* ReqResinCreateUserResponseTest
* ReqResinCreateUserResponseTest2
* ReqResinPutUserResponseTest1
* ReqResinPatchUserResponseTest1
* ReqResinDeleteUserResponseTest1
* ReqResinRegisterFailResponseTest1
* ReqResinLoginFailResponseTest1
* ReqResinLoginFailResponseTest2
* ReqResinRegisterFailResponseTest2
* ReqResinRegisterSuccessResponseTest
* ReqResinLoginSuccessResponseTest

## How To Test
* open terminal and send mvn clean test command
* open TestCases class run all cases
* If you got pipeline set the gitlab-ci.yml and manage emailing service with .sh file
* if you want to see allure result graphic send command allure serve /.foldername/
* if want to clear target package just send command in terminal which is mvn clean