import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

public class TestCases {
    Constants cons = new Constants();
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TestCases.class);
    Controller controller = new Controller();

    @Test(priority = 1)
    @Description("send request https://restful-booker.herokuapp.com/ping and assert response code 201, and verify response body has Created")
    public void HerokuAppPingTest() {
        logger.info("HerokuAppPingTest STARTED");
        controller.SendPingRequest();
        logger.info("HerokuAppPingTest FINISHED");
    }

    @Test(priority = 2)
    @Description("send request https://restful-booker.herokuapp.com/booking and assert response code 200, and verify response body has Created")
    public void HerokuAppGetAllBookingTest() {
        logger.info("HerokuAppGetAllBookingTest STARTED");
        /*for(int i=1;i<=100;i++){
            controller.SendRequestGetAllBooking();
            logger.info(i+". run completed for getAllBookingRequest");
        }*/
        controller.SendRequestGetAllBooking();
        logger.info("HerokuAppGetAllBookingTest FINISHED");
    }

    @Test(priority = 3)
    @Description("send request https://restful-booker.herokuapp.com/booking and assert response code 200, and verify response body has Created")
    public void HerokuAppGetBookingDetailsTest() {
        logger.info("HerokuAppGetBookingDetailsTest STARTED");
        /*for(int i=1;i<=100;i++){
            controller.GetBookingDetails("454","Meric","Bacak","123","true","2024-08-01",
                "2024-08-08","Towels");
        }*/
        controller.GetBookingDetails("454", "Meric", "Bacak", "123", "true", "2024-08-01",
                "2024-08-08", "Towels");
        logger.info("HerokuAppGetBookingDetailsTest FINISHED");
    }

    @Test(priority = 4)
    @Description("send request https://reqres.in/api/users?delay=0.5 and assert response code 200, and verify response body fields")
    public void ReqResinGetDelayResponseTest() {
        logger.info("ReqResinGetDelayResponseTest STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetDelayResponse();
        logger.info("ReqResinGetDelayResponseTest FINISHED");
    }

    @Test(priority = 5)
    @Description("send request https://reqres.in/api/users?page=4 and assert response code 200, and verify response body fields")
    public void ReqResinGetListUsers4ResponseTest() {
        logger.info("ReqResinGetListUsers4ResponseTest STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetListUsers4Response();
        logger.info("ReqResinGetListUsers4ResponseTest FINISHED");
    }

    @Test(priority = 6)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest() {
        logger.info("ReqResinGetUseridResponseTest STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("1", "george.bluth@reqres.in", "George", "Bluth", "https://reqres.in/img/faces/1-image.jpg");
        logger.info("ReqResinGetUseridResponseTest FINISHED");
    }

    @Test(priority = 7)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest2() {
        logger.info("ReqResinGetUseridResponseTest2 STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("3", "emma.wong@reqres.in", "Emma", "Wong", "https://reqres.in/img/faces/3-image.jpg");
        logger.info("ReqResinGetUseridResponseTest2 FINISHED");
    }

    @Test(priority = 8)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest3() {
        logger.info("ReqResinGetUseridResponseTest3 STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("4", "eve.holt@reqres.in", "Eve", "Holt", "https://reqres.in/img/faces/4-image.jpg");
        logger.info("ReqResinGetUseridResponseTest3 FINISHED");
    }

    @Test(priority = 9)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest4() {
        logger.info("ReqResinGetUseridResponseTest4 STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("5", "charles.morris@reqres.in", "Charles", "Morris", "https://reqres.in/img/faces/5-image.jpg");
        logger.info("ReqResinGetUseridResponseTest4 FINISHED");
    }

    @Test(priority = 10)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest5() {
        logger.info("ReqResinGetUseridResponseTest5 STARTED");
        /*for(int i=1;i<=500;i++){
            controller.ReqresinGetUserIdResponse("6","tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg");
            logger.info(i+". run completed for ReqresinGetUserIdResponse");
        }*/
        controller.ReqresinGetUserIdResponse("6", "tracey.ramos@reqres.in", "Tracey", "Ramos", "https://reqres.in/img/faces/6-image.jpg");
        logger.info("ReqResinGetUseridResponseTest4 FINISHED");
    }

    @Test(priority = 11)
    @Description("send create request https://reqres.in/api/users/ and assert response code 200, and verify response body fields")
    public void ReqResinCreateUserResponseTest() {
        logger.info("ReqResinCreateUserResponseTest STARTED");
        /*for(int i=1;i<=500;i++){
            controller.ReqresinGetUserIdResponse("6","tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg");
            logger.info(i+". run completed for ReqresinGetUserIdResponse");
        }*/
        controller.ReqresinCreateUserResponse("createdAt",cons.ReqresInCreateUserReqBody, "Meriç", "Manager", "BACAK", "90", 201);
        logger.info("ReqResinCreateUserResponseTest FINISHED");
    }

    @Test(priority = 12)
    @Description("send create request https://reqres.in/api/users/ and assert response code 200, and verify response body fields")
    public void ReqResinCreateUserResponseTest2() {
        logger.info("ReqResinCreateUserResponseTest2 STARTED");
        /*for(int i=1;i<=500;i++){
            controller.ReqresinGetUserIdResponse("6","tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg");
            logger.info(i+". run completed for ReqresinGetUserIdResponse");
        }*/
        controller.ReqresinCreateUserResponse("createdAt",cons.ReqresInCreateUserReqBody2, "Seçil", "Manager", "BACAK", "95", 201);
        logger.info("ReqResinCreateUserResponseTest2 FINISHED");
    }

    @Test(priority = 13)
    @Description("send put request https://reqres.in/api/users/252 and assert response code 200, and verify response body fields")
    public void ReqResinPutUserResponseTest1() {
        logger.info("ReqResinPutUserResponseTest1 STARTED");
        /*for(int i=1;i<=500;i++){
            controller.ReqresinGetUserIdResponse("6","tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg");
            logger.info(i+". run completed for ReqresinGetUserIdResponse");
        }*/
        controller.ReqresinPutUserResponse("updatedAt",cons.ReqresInPutUserRequestBody, "meric", "GroupManager", "BACAK2", "95", 200);
        logger.info("ReqResinPutUserResponseTest1 FINISHED");
    }
    @Test(priority = 14)
    @Description("send patch request https://reqres.in/api/users/252 and assert response code 200, and verify response body fields")
    public void ReqResinPatchUserResponseTest1() {
        logger.info("ReqResinPutUserResponseTest1 STARTED");
        /*for(int i=1;i<=500;i++){
            controller.ReqresinGetUserIdResponse("6","tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg");
            logger.info(i+". run completed for ReqresinGetUserIdResponse");
        }*/
        controller.ReqresinPatchUserResponse("updatedAt",cons.ReqresInPatchUserRequestBody, "meric", "director", "BACAK3", "44", 200);
        logger.info("ReqResinPutUserResponseTest1 FINISHED");
    }

    @Test(priority = 15)
    @Description("send delete request https://reqres.in/api/users/7 and assert response code 204, and verify response body fields")
    public void ReqResinDeleteUserResponseTest1() {
        logger.info("ReqResinDeleteUserResponseTest1 STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinDeleteUserResponse();
        logger.info("ReqResinDeleteUserResponseTest1 FINISHED");
    }
    @Test(priority = 16)
    @Description("send post request https://reqres.in/api/register and assert response code 400, and verify response body fields")
    public void ReqResinRegisterFailResponseTest1() {
        logger.info("ReqResinRegisterFailResponseTest1 STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinRegisterFailResponse("error","Note: Only defined users succeed registration",400);
        logger.info("ReqResinRegisterFailResponseTest1 FINISHED");
    }
    @Test(priority = 17)
    @Description("send post request https://reqres.in/api/login and assert response code 400, and verify response body fields")
    public void ReqResinLoginFailResponseTest1() {
        logger.info("ReqResinLoginFailResponseTest1 STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinLoginFailResponse("error","user not found",400);
        logger.info("ReqResinLoginFailResponseTest1 FINISHED");
    }
    @Test(priority = 18)
    @Description("send post request https://reqres.in/api/login and assert response code 400, and verify response body fields")
    public void ReqResinLoginFailResponseTest2() {
        logger.info("ReqResinLoginFailResponseTest2 STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinLoginFail2Response("error","Missing password",400);
        logger.info("ReqResinLoginFailResponseTest2 FINISHED");
    }
    @Test(priority = 19)
    @Description("send post request https://reqres.in/api/register and assert response code 400, and verify response body fields")
    public void ReqResinRegisterFailResponseTest2() {
        logger.info("ReqResinRegisterFailResponseTest2 STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinRegisterFail2Response("error","Missing password",400);
        logger.info("ReqResinRegisterFailResponseTest2 FINISHED");
    }

    @Test(priority = 20)
    @Description("send post request https://reqres.in/api/register and assert response code 200, and verify response body fields")
    public void ReqResinRegisterSuccessResponseTest() {
        logger.info("ReqResinRegisterSuccessResponseTest STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinRegisterSuccessResponse("token","QpwL5tke4Pnpja7X4",200);
        logger.info("ReqResinRegisterSuccessResponseTest FINISHED");
    }

    @Test(priority = 21)
    @Description("send post request https://reqres.in/api/login and assert response code 200, and verify response body fields")
    public void ReqResinLoginSuccessResponseTest() {
        logger.info("ReqResinLoginSuccessResponseTest STARTED");
        /*for(int i=1;i<=500;i++){
             controller.ReqresinDeleteUserResponse();
            logger.info(i+". run completed for ReqresinDeleteUserResponse");
        }*/
        controller.ReqresinLoginSuccessResponse("token","QpwL5tke4Pnpja7X4",200);
        logger.info("ReqResinLoginSuccessResponseTest FINISHED");
    }
}