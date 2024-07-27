import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;

import static io.restassured.RestAssured.given;
public class Controller {
    Constants cons = new Constants();
    Assertions assertions = new Assertions();
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Controller.class);

    public void SendPingRequest() {
        logger.info("RequestPath " + cons.requestPath1 + "ping");
        Response response = given().contentType(ContentType.JSON).when().get(cons.requestPath1 + "ping");
        //logger.info("Response: "+response.asString());
        assertions.SendPingRequestAssertion(response);
    }

    public void SendRequestGetAllBooking() {
        logger.info("RequestPath " + cons.requestPath1 + "booking");
        Response response = given().contentType(ContentType.JSON).when().get(cons.requestPath1 + "booking");
        //logger.info("Response: "+response.asString());
        assertions.GetAllBookingsAssertion(response);
    }

    public void GetBookingDetails(String BookingID, String firstname, String lastname, String totalprice, String depositpaid
            , String checkin, String checkout, String additionalneeds) {
        logger.info("RequestPath " + cons.requestPath1 + "booking/" + BookingID);
        Response response = given().contentType(ContentType.JSON).when().get(cons.requestPath1 + "booking/" + BookingID);
        //logger.info("Response: "+response.asString());
        assertions.GetBookingDetailsAssertions(response, firstname, lastname, totalprice, depositpaid, checkin, checkout, additionalneeds);
    }

    public void ReqresinGetDelayResponse() {
        logger.info("RequestPath " + cons.requestPath2 + "users?delay=0.5");
        Response response = given().contentType(ContentType.JSON).when().get(cons.requestPath2 + "users?delay=0.5");
        //logger.info("Response: "+response.asString());
        assertions.ReqresInGetDelayResponse(response);
    }

    public void ReqresinGetListUsers4Response() {
        logger.info("RequestPath " + cons.requestPath2 + "users?page=4");
        Response response = given().contentType(ContentType.JSON).when().get(cons.requestPath2 + "users?page=4");
        //logger.info("Response: "+response.asString());
        assertions.ReqresInGetListUsers4Response(response);
    }

    public void ReqresinGetUserIdResponse(String id,String email,String first_name,String last_name,String avatar) {
        logger.info("RequestPath " + cons.requestPath2 + "users/"+id);
        Response response = given().contentType(ContentType.JSON).when().get(cons.requestPath2 + "users/"+id);
        //logger.info("Response: "+response.asString());
        assertions.ReqresInGetUserIDResponse(response,id,email,first_name,last_name,avatar);
    }
}