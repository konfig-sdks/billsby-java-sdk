

# SubscriptionChangePlanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planId** | **Integer** | The unique identifier of the plan that you want to change the subscription to in the Billsby platform |  |
|**cycleId** | **Integer** | The unique identifier of the cycle that you want to change the subscription to in the Billsby platform |  |
|**customerUniqueId** | **String** | The unique identifier of the subscription in the Billsby platform |  |
|**planChangeType** | **Integer** | Immediate &#x3D; 1 OnRenewal &#x3D; 2 |  [optional] |
|**units** | **Integer** | The number of units required (for cycles with mulitple units allowed) |  [optional] |
|**addOns** | [**List&lt;CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner&gt;**](CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner.md) |  |  [optional] |
|**allowances** | **List&lt;Integer&gt;** |  |  [optional] |
|**issueRefund** | **Boolean** | In case of immediate change, this will apply a refund into the first invoice of the new plan based on the prorated amount of the current plan |  [optional] |



