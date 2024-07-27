import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

public class TestCases {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(TestCases.class);    Controller controller =new Controller();
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
        controller.GetBookingDetails("454","Meric","Bacak","123","true","2024-08-01",
                "2024-08-08","Towels");
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
        controller.ReqresinGetUserIdResponse("1","george.bluth@reqres.in","George","Bluth","https://reqres.in/img/faces/1-image.jpg");
        logger.info("ReqResinGetUseridResponseTest FINISHED");
    }

    @Test(priority = 7)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest2() {
        logger.info("ReqResinGetUseridResponseTest2 STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("3","emma.wong@reqres.in","Emma","Wong","https://reqres.in/img/faces/3-image.jpg");
        logger.info("ReqResinGetUseridResponseTest2 FINISHED");
    }

    @Test(priority = 8)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest3() {
        logger.info("ReqResinGetUseridResponseTest3 STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("4","eve.holt@reqres.in","Eve","Holt","https://reqres.in/img/faces/4-image.jpg");
        logger.info("ReqResinGetUseridResponseTest3 FINISHED");
    }

    @Test(priority = 9)
    @Description("send request https://reqres.in/api/users/{id} and assert response code 200, and verify response body fields")
    public void ReqResinGetUseridResponseTest4() {
        logger.info("ReqResinGetUseridResponseTest4 STARTED");
        /*for(int i=1;i<=10;i++){
            controller.ReqresinGetDelayResponse();
        }*/
        controller.ReqresinGetUserIdResponse("5","charles.morris@reqres.in","Charles","Morris","https://reqres.in/img/faces/5-image.jpg");
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
        controller.ReqresinGetUserIdResponse("6","tracey.ramos@reqres.in","Tracey","Ramos","https://reqres.in/img/faces/6-image.jpg");
        logger.info("ReqResinGetUseridResponseTest4 FINISHED");
    }
}