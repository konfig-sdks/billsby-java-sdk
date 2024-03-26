

# ProductCreatePlanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the plan |  [optional] |
|**name** | **String** | The name of the plan you want to add |  [optional] |
|**displayName** | **String** | The display name of the plan |  [optional] |
|**pricingModel** | **Integer** | The type of pricing model for the plan; FlatFee &#x3D; 1, PerUnit &#x3D; 2, Reserved &#x3D; 3, Tiered &#x3D; 4, Volume &#x3D; 5, Ranged &#x3D; 6 |  [optional] |
|**featureTags** | **String** | Any feature tags you want to add to the plan |  [optional] |
|**visibility** | **Integer** | The type of visibility of each plan; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public&#x3D;0, Hidden&#x3D;1, Internal&#x3D;2, OffSale&#x3D;3) |  [optional] |
|**redirectUrl** | **String** | The URL you want to redirect your customers to when they have completed the checkout flow |  [optional] |
|**alertEmail** | **String** | The email you would like to receive an alert when a customer signs up for this plan |  [optional] |



