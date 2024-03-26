

# ProductUpdateProductRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the product you want to update |  [optional] |
|**visibility** | **Integer** | The type of visibility of each product; public, hidden and on-sale. Available values: 0, 1, 2, 3 (Public&#x3D;0, Hidden&#x3D;1, Internal&#x3D;2, OffSale&#x3D;3) |  [optional] |
|**billingCurrency** | **String** | The currency you want to the product to be billed in. This must be an ISO3 currency code with maximum three characters. For example: GBP, USD, etc |  [optional] |
|**displayName** | **String** | The display name of the product you want to create |  [optional] |
|**decription** | **String** | A short description of the product |  [optional] |
|**isShippingAddressRequired** | **Boolean** | Do you need to collect a shipping address from your customers for this product; true or false |  [optional] |
|**isShippingAddressValidationRequired** | **Boolean** | Do you want to validate the shipping address using our tool; true or false |  [optional] |
|**isBillingAddressValidationRequired** | **Boolean** | Do you want to validate the billing address using our tool; true or false |  [optional] |
|**isAdditionalEmailRequired** | **Boolean** | Do you want to collect an additional email address from your customers at checkout; true or false |  [optional] |
|**isPhoneNumberRequired** | **Boolean** | Do you need to collect a phone number from your customers at checkout; true or flase |  [optional] |
|**isMarketingConsentRequired** | **Boolean** | Do you need to get marketing consent from your customers at checkout; true or false |  [optional] |
|**alertEmail** | **String** | Set an email to be alerted when a customer signs up for this product |  [optional] |
|**orderedCustomFields** | [**ProductUpdateProductRequestOrderedCustomFields**](ProductUpdateProductRequestOrderedCustomFields.md) |  |  [optional] |
|**typeOfProduct** | **Integer** | The type of product you want to create; 1 is tiered |  [optional] |
|**productCountryLimitations** | [**ProductUpdateProductRequestProductCountryLimitations**](ProductUpdateProductRequestProductCountryLimitations.md) |  |  [optional] |



