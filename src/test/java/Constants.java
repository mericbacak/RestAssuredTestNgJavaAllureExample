public class Constants {
    String requestPath1 = "https://restful-booker.herokuapp.com/";
    String requestPath2="https://reqres.in/api/";
    String ReqresInCreateUserReqBody="""
            {"name": "Meriç","job": "Manager","surname": "BACAK","city" : "IZMIR","CountyCode": 90}""";
    String ReqresInCreateUserReqBody2="""
            {"name": "Seçil","job": "Manager","surname": "BACAK","city" : "ISTANBUL","CountyCode": 95}""";
    String ReqresInPutUserRequestBody= """
            {"name": "meric","job": "GroupManager","surname": "BACAK2","city" : "ISTANBUL","CountyCode": 95}""";
    String ReqresInPatchUserRequestBody= """
            {"name": "meric","job": "director","surname": "BACAK3","city" : "Dusseldorf","CountyCode": 44}""";

    String ReqresInRegisterLoginUnSuccesful ="""
            {"email": "mericbacak@gmail.com","password": "pistol"}""";

    String ReqresInRegisterLogin2UnSuccesful ="""
            {"email": "mericbacak@gmail.com"}""";

    String ReqresInRegisterLoginSuccesful ="""
            { "email": "eve.holt@reqres.in","password": "pistol"}""";
}