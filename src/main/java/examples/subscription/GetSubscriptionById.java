package examples.subscription;

import com.mundipagg.api.MundiAPIClient;
import com.mundipagg.api.controllers.SubscriptionsController;
import com.mundipagg.api.http.client.*;
import com.mundipagg.api.models.GetSubscriptionResponse;

public class GetSubscriptionById {

    public static void main(String[] args) {

        String basicAuthUserName = "sk_test"; // The username to use with basic authentication
        String basicAuthPassword = ""; // The password to use with basic authentication

        MundiAPIClient client = new MundiAPIClient(basicAuthUserName, basicAuthPassword);

        SubscriptionsController subscriptions_controller = new SubscriptionsController();

        String subscriptionId = "sub_vJZV7aef35tQXndo";

        subscriptions_controller.getSubscriptionAsync(subscriptionId, new APICallBack<GetSubscriptionResponse>() {
            public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
                System.out.println("Subscription found !");
                System.out.println("Status response: " + context.getResponse().getStatusCode());
                System.out.println("Subscription id: " + response.getId());
            }

            public void onFailure(HttpContext context, Throwable error) {

                System.out.println("Status response: " + context.getResponse().getStatusCode());
                System.out.println(error.getMessage());
                error.printStackTrace();
            }
        });
    }

}
