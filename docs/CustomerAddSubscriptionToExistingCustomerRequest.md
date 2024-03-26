

# CustomerAddSubscriptionToExistingCustomerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cycleId** | **Integer** | The unique identifier of the cycle in the Billsby platform |  |
|**units** | **Integer** | The number of units for unit based plans |  [optional] |
|**address** | [**CustomerAddSubscriptionToExistingCustomerRequestAddress**](CustomerAddSubscriptionToExistingCustomerRequestAddress.md) |  |  [optional] |
|**shippingAddress** | **Object** | The shipping address of the customer |  [optional] |
|**additionalEmail** | **String** | Any additional email addresses given by the customer |  [optional] |
|**phoneNumberDialCountry** | **String** | The country associated with the phone number |  [optional] |
|**phoneNumberDialCode** | **Integer** | The country dial code for the customer phone number |  [optional] |
|**phoneNumber** | **Integer** | The customer&#39;s phone number |  [optional] |
|**marketingConsent** | **Boolean** | Gas the customer given marketing consent: true or false |  [optional] |
|**taxRegNumber** | **String** | Tax registration number |  [optional] |
|**ipAddress** | **String** |  |  [optional] |
|**customFieldResponse** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestCustomFieldResponseInner.md) | Any responses to custom fields |  [optional] |
|**addOns** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner.md) | Any add-ons to be included in the plan, along with the quantity of each add-on if unit based |  [optional] |
|**allowances** | **Integer** | Any allowances to be included with the plan |  [optional] |
|**couponCodes** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestCouponCodesInner.md) | The coupon code to be used for the plan |  [optional] |



