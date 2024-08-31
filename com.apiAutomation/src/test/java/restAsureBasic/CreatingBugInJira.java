package restAsureBasic;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.io.File;

import static io.restassured.RestAssured.*;

public class CreatingBugInJira {

    public static void main(String[] args){

        RestAssured.baseURI="https://chityrichu.atlassian.net/";
       String CreateIssuseResponse = given().header("Content-Type","application/json").header("Authorization","Basic Y2hpdHlyaWNodUBnbWFpbC5jb206QVRBVFQzeEZmR0YwTWdqM2syam5wQ2taYTYxMEppXzRONkNQSmdTOXp2UmJsV2s2WkNHeXJvcVBCODVEOEplQUVxTVJOc1NGUUtYSTRsZl9pYmRTZEhyNHdaUzRtZXVYZHpLSWpRZ21LcS1VV2JrTEVmdWlJZFoxNkx6NnVnd3loVmF2LUtmUTJ3Z2RiaXJBbUVPSVdleGhDQTd6WEVmMVJCMk9hSjhvNmtHZ3l0Q1p5aVVkb1lRPTcxOTdFNjI0")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "       \"project\":\n" +
                        "       {\n" +
                        "          \"key\": \"SCRUM\"\n" +
                        "       },\n" +
                        "       \"summary\": \"Menu not working_Automation_RestAssure\",\n" +
                        "       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\n" +
                        "       \"issuetype\": {\n" +
                        "          \"name\": \"Bug\"\n" +
                        "       }\n" +
                        "   }\n" +
                        "}").log().all().when().post("rest/api/2/issue").then().log().all().assertThat().statusCode(201)
                .extract().response().asString();
        JsonPath js = new JsonPath(CreateIssuseResponse);
        String IssuseID = js.getString("id");
        System.out.println(IssuseID);
        //Assert.assertEquals("10005",IssuseID);

        String Attachment = given().pathParam("key",IssuseID)
                .header("X-Atlassian-Token","no-check")
                .header("Authorization","Basic Y2hpdHlyaWNodUBnbWFpbC5jb206QVRBVFQzeEZmR0YwTWdqM2syam5wQ2taYTYxMEppXzRONkNQSmdTOXp2UmJsV2s2WkNHeXJvcVBCODVEOEplQUVxTVJOc1NGUUtYSTRsZl9pYmRTZEhyNHdaUzRtZXVYZHpLSWpRZ21LcS1VV2JrTEVmdWlJZFoxNkx6NnVnd3loVmF2LUtmUTJ3Z2RiaXJBbUVPSVdleGhDQTd6WEVmMVJCMk9hSjhvNmtHZ3l0Q1p5aVVkb1lRPTcxOTdFNjI0")
                .multiPart("file",new File("D:\\RestAPI\\accenture job 15_03_2024.PNG")).log().all()
                .when().post("rest/api/3/issue/{key}/attachments").then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        System.out.println(Attachment);
        JsonPath  js1 = new JsonPath(Attachment);
        String FileName = js1.getString("filename");

    }
}
