
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `basicAuthUserName` | `String` | The username to use with basic authentication |
| `basicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
MundiAPIClient client = new MundiAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials("BasicAuthUserName", "BasicAuthPassword")
    .build();
```

## MundiAPIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getCustomersController()` | Provides access to Customers controller. | `CustomersController` |
| `getChargesController()` | Provides access to Charges controller. | `ChargesController` |
| `getRecipientsController()` | Provides access to Recipients controller. | `RecipientsController` |
| `getSubscriptionsController()` | Provides access to Subscriptions controller. | `SubscriptionsController` |
| `getInvoicesController()` | Provides access to Invoices controller. | `InvoicesController` |
| `getOrdersController()` | Provides access to Orders controller. | `OrdersController` |
| `getTokensController()` | Provides access to Tokens controller. | `TokensController` |
| `getPlansController()` | Provides access to Plans controller. | `PlansController` |
| `getTransactionsController()` | Provides access to Transactions controller. | `TransactionsController` |
| `getTransfersController()` | Provides access to Transfers controller. | `TransfersController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

