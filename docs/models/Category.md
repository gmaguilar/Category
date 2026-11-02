# Org.OpenAPITools.Model.Category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | **Guid** | The unique identifier of the category. | [optional] 
**Name** | **string** | The name of the category. | [optional] 
**CreatedAt** | **DateTime** | The timestamp when the category was created. | [optional] 
**UserId** | **Guid** | The unique identifier of the user who owns the category. It is required when creating a new category. It is related to the microservice User. | [optional] 
**IsActive** | **bool** | Indicates whether the category is active. If false, the category is considered inactive or deleted. | [optional] 
**IsMain** | **bool** | Indicates whether the category is a main category. If true, the category is considered a main category. By default, it is set to true. | [optional] 
**CategoryMainId** | **Guid** | The unique identifier of the main category to which this category belongs. it is required if the category is not a main category. It is related to the categoryId in the system. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

