

# ProductCreateCycleRequestCyclesInputModelInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**frequency** | **Integer** | A number with the update frequency (for example: 5 to renew every five of frequencyType) |  |
|**frequencyType** | **Integer** | Daily &#x3D; 1, Weekly &#x3D; 2, Monthly &#x3D; 3, Yearly &#x3D; 4 |  |
|**price** | **Integer** | The price amount of this cycle (unused in tiered based cycles) |  |
|**billingDateType** | **Integer** | Anniversary &#x3D; 1, FixedDayEachMonth &#x3D; 2, FixedDayOfTheWeek &#x3D; 3 |  |
|**visibility** | **Integer** | The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public&#x3D;0, Hidden&#x3D;1, Internal&#x3D;2, OffSale&#x3D;3) |  |
|**freeTrial** | **Integer** | A number with the amount of free trial (for example: 5 for five of frequencyType of free trial) |  [optional] |
|**freeTrialFrequencyType** | **Integer** | Daily &#x3D; 1, Weekly &#x3D; 2, Monthly &#x3D; 3, Yearly &#x3D; 4 |  [optional] |
|**contractTerm** | **Integer** | A number with the amount of minimum contract term (for example: 5 for five of frequencyType of minimum term) |  [optional] |
|**contractTermFrequencyType** | **Integer** | Daily &#x3D; 1, Weekly &#x3D; 2, Monthly &#x3D; 3, Yearly &#x3D; 4 |  [optional] |
|**setupFeePrice** | **Integer** | The price amount of setup fee (charged only on first invoice of new subscriptions) |  [optional] |
|**freeQuantity** | **Integer** | The amount of free units in tiered based cycles |  [optional] |
|**fixedBillingDateDay** | **Integer** | The fixed billing date if there is one (from 1 to 28) |  [optional] |
|**fixedBillingDateMonth** | **Integer** | The fixed billing month if there is one (from 1 to 12) |  [optional] |
|**proRateOption** | **Integer** | DoNotProRate &#x3D; 1, DoNotChargeUntilNextCycle &#x3D; 2, ProRateBasedOnDaysRemaining &#x3D; 3 |  [optional] |
|**tiers** | [**List&lt;ProductCreateCycleRequestCyclesInputModelInnerTiersInner&gt;**](ProductCreateCycleRequestCyclesInputModelInnerTiersInner.md) | Define your tiers |  [optional] |



