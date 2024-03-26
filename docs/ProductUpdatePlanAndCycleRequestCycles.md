

# ProductUpdatePlanAndCycleRequestCycles

Define your cycles

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cycleId** | **Integer** | The unique identifier of the cycle in the Billsby platform |  [optional] |
|**frequency** | **Integer** | A number with the update frequency (for example: 5 to renew every five of frequencyType) |  [optional] |
|**frequencyType** | **Integer** | Daily &#x3D; 1, Weekly &#x3D; 2, Monthly &#x3D; 3, Yearly &#x3D; 4 |  [optional] |
|**price** | **Integer** | The price amount of this cycle (unused in tiered based cycles) |  [optional] |
|**freeTrial** | **Integer** | A number with the amount of free trial (for example: 5 for five of frequencyType of free trial) |  [optional] |
|**freeTrialFrequencyType** | **Integer** | Daily &#x3D; 1, Weekly &#x3D; 2, Monthly &#x3D; 3, Yearly &#x3D; 4 |  [optional] |
|**setupFeePrice** | **Integer** | The price amount of setup fee (charged only on first invoice of new subscriptions) |  [optional] |
|**freeQuantity** | **Integer** | The amount of free units in tiered based cycles |  [optional] |
|**billingDateType** | **Integer** | Anniversary &#x3D; 1, FixedDayEachMonth &#x3D; 2, FixedDayOfTheWeek &#x3D; 3 |  [optional] |
|**fixedBillingDateDay** | **Integer** | The fixed billing date if there is one (from 1 to 28) |  [optional] |
|**proRateOption** | **Integer** | DoNotProRate &#x3D; 1, DoNotChargeUntilNextCycle &#x3D; 2, ProRateBasedOnDaysRemaining &#x3D; 3 |  [optional] |
|**visibility** | **Integer** | The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public&#x3D;0, Hidden&#x3D;1, Internal&#x3D;2, OffSale&#x3D;3) |  [optional] |
|**tiers** | [**ProductUpdatePlanAndCycleRequestCyclesTiers**](ProductUpdatePlanAndCycleRequestCyclesTiers.md) |  |  [optional] |



