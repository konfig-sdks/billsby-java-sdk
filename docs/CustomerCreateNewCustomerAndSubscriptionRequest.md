

# CustomerCreateNewCustomerAndSubscriptionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The customer&#39;s first name |  |
|**lastName** | **String** | The customer&#39;s last name |  |
|**email** | **String** | The customer&#39;s email address |  |
|**cycleId** | **Integer** | The unique identifier of the cycle in Billsby |  |
|**units** | **Integer** | The number of units included in the subscription (min. 1) |  |
|**address** | [**CustomerCreateNewCustomerAndSubscriptionRequestAddress**](CustomerCreateNewCustomerAndSubscriptionRequestAddress.md) |  |  |
|**shippingAddress** | [**CustomerCreateNewCustomerAndSubscriptionRequestShippingAddress**](CustomerCreateNewCustomerAndSubscriptionRequestShippingAddress.md) |  |  [optional] |
|**additionalEmail** | **String** | Any additional email address provided by the customer |  [optional] |
|**phoneNumberDialCountry** | **String** | The country associated with their phone number |  [optional] |
|**phoneNumberDialCode** | **Integer** | The country code associated with their phone number |  [optional] |
|**phoneNumber** | **Integer** | The customer&#39;s phone number. If phoneNumber is provided, then phoneNumberDialCountry and phoneNumberDialCode are required. |  [optional] |
|**marketingConsent** | **Boolean** | Has the customer given marketing consent; true or false |  [optional] |
|**customFieldResponse** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner.md) | Response to any custom field questions you want to add to the subscription |  [optional] |
|**addOns** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner.md) | The add-ons that you want to include in the subscription |  [optional] |
|**allowances** | **List&lt;Integer&gt;** | The IDs of any allowances you want to include in the subscription. For multiple allowances you can add the IDs separated by a comma |  [optional] |
|**couponCodes** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner.md) | The codes of any coupons you want to apply to the subscription |  [optional] |
|**cardDetails** | [**CustomerCreateNewCustomerAndSubscriptionRequestCardDetails**](CustomerCreateNewCustomerAndSubscriptionRequestCardDetails.md) |  |  |



