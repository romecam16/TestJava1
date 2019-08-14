package httpVerbs;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


public class VerifyGET {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }


    @Test
    public void requestARZipCode1601_checkPlaceNameinBodyResponse_expectedISLA_MARTIN_GARCIA(){

        given ().
        when ().
                get("http://api.zippopotam.us/ar/1601").
         then().
                assertThat().
                body("places[0].'place name'", equalTo("ISLA MARTIN GARCIA"));




    }

}