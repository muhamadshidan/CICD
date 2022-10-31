package starter.User;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.BDDAssumptions;

public class Get {

    public static String url = "https://demoqa.com/swagger/#/";
    private BDDAssumptions SerenityRest;

    @Step("I set GET api endpoints")
    public String setGetApiEndpoints() {
        return url + "https://demoqa.com/swagger/#/Account/AccountV1UserByUserIdGet";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setGetApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        restAssuresThat(response -> response.body(s: "'data'.id'", equalTo(operand; "2")));
        restAssuresThat(response -> response.body(s: "'data'.id'", equalTo(operand: "2")));
    }
}
