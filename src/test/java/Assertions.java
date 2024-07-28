import io.restassured.response.Response;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assertions {
    Constants constants = new Constants();

    public void SendPingRequestAssertion(@NotNull Response response) {
        Assert.assertTrue(response.asString().contains("Created"));
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    public void GetAllBookingsAssertion(@NotNull Response response) {
        Assert.assertTrue(response.asString().contains("bookingid"));
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void GetBookingDetailsAssertions(@NotNull Response response, String firstname, String lastname, String totalprice, String depositpaid
            , String checkin, String checkout, String additionalneeds) {
        Assert.assertEquals(response.jsonPath().getJsonObject("firstname"), firstname);
        Assert.assertEquals(response.jsonPath().getJsonObject("lastname"), lastname);
        Assert.assertEquals(response.jsonPath().getJsonObject("totalprice").toString(), totalprice);
        Assert.assertEquals(response.jsonPath().getJsonObject("depositpaid").toString(), depositpaid);
        Assert.assertEquals(response.jsonPath().getJsonObject("bookingdates.checkin"), checkin);
        Assert.assertEquals(response.jsonPath().getJsonObject("bookingdates.checkout"), checkout);
        Assert.assertEquals(response.jsonPath().getJsonObject("additionalneeds"), additionalneeds);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void ReqresInGetDelayResponse(@NotNull Response response) {
        Assert.assertEquals(response.jsonPath().getJsonObject("page").toString(), "1");
        Assert.assertEquals(response.jsonPath().getJsonObject("per_page").toString(), "6");
        Assert.assertEquals(response.jsonPath().getJsonObject("total").toString(), "12");
        Assert.assertEquals(response.jsonPath().getJsonObject("total_pages").toString(), "2");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[0].id").toString(), "1");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[0].email"), "george.bluth@reqres.in");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[0].first_name"), "George");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[0].last_name"), "Bluth");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[0].avatar"), "https://reqres.in/img/faces/1-image.jpg");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[1].id").toString(), "2");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[1].email"), "janet.weaver@reqres.in");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[1].first_name"), "Janet");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[1].last_name"), "Weaver");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[1].avatar"), "https://reqres.in/img/faces/2-image.jpg");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[2].id").toString(), "3");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[2].email"), "emma.wong@reqres.in");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[2].first_name"), "Emma");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[2].last_name"), "Wong");
        Assert.assertEquals(response.jsonPath().getJsonObject("data[2].avatar"), "https://reqres.in/img/faces/3-image.jpg");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void ReqresInGetListUsers4Response(@NotNull Response response) {
        Assert.assertEquals(response.jsonPath().getJsonObject("page").toString(), "4");
        Assert.assertEquals(response.jsonPath().getJsonObject("per_page").toString(), "6");
        Assert.assertEquals(response.jsonPath().getJsonObject("total").toString(), "12");
        Assert.assertEquals(response.jsonPath().getJsonObject("total_pages").toString(), "2");
        Assert.assertEquals(response.jsonPath().getJsonObject("support.url").toString(), "https://reqres.in/#support-heading");
        Assert.assertEquals(response.jsonPath().getJsonObject("support.text").toString(), "To keep ReqRes free, contributions towards server costs are appreciated!");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    public void ReqresInGetUserIDResponse(@NotNull Response response, String id, String email, String first_name,
                                          String last_name, String avatar) {
        Assert.assertEquals(response.jsonPath().getJsonObject("data.id").toString(), id);
        Assert.assertEquals(response.jsonPath().getJsonObject("data.email").toString(), email);
        Assert.assertEquals(response.jsonPath().getJsonObject("data.first_name").toString(), first_name);
        Assert.assertEquals(response.jsonPath().getJsonObject("data.last_name").toString(), last_name);
        Assert.assertEquals(response.jsonPath().getJsonObject("data.avatar").toString(), avatar);
        Assert.assertEquals(response.jsonPath().getJsonObject("support.url").toString(), "https://reqres.in/#support-heading");
        Assert.assertEquals(response.jsonPath().getJsonObject("support.text").toString(), "To keep ReqRes free, contributions towards server costs are appreciated!");
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    public void ReqresInCreateUserResponse(@NotNull Response response,String Path,String name, String job,
                                           String surname,String CountryCode,int Responsecode ){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(date);
        Assert.assertEquals(response.jsonPath().getJsonObject("name").toString(),name);
        Assert.assertEquals(response.jsonPath().getJsonObject("job").toString(),job);
        Assert.assertEquals(response.jsonPath().getJsonObject("surname").toString(),surname);
        Assert.assertEquals(response.jsonPath().getJsonObject("CountyCode").toString(),CountryCode);
        //System.out.println(strDate);
        Assert.assertTrue(response.jsonPath().getJsonObject(Path).toString().contains(strDate));
        Assert.assertEquals(response.getStatusCode(),Responsecode);
    }
    public void ReqresInDeleteUserResponse(@NotNull Response response){
        Assert.assertEquals(response.getStatusCode(),204);
    }

    public void ReqresInRegisterLoginUnSuccessfulUserResponse(@NotNull Response response, String Path, String ErrorMessage, int ResponseCode){
        Assert.assertEquals(response.jsonPath().getJsonObject(Path).toString(),ErrorMessage);
        Assert.assertEquals(response.getStatusCode(),ResponseCode);
    }
}