# Org.OpenAPITools.Api.CategoryApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CategoryCategoryIdBillsGet**](CategoryApi.md#categorycategoryidbillsget) | **GET** /category/{categoryId}/bills | Get bills for a category by ID. |
| [**CategoryCategoryIdDelete**](CategoryApi.md#categorycategoryiddelete) | **DELETE** /category/{categoryId} | Delete a category by ID. |
| [**CreateCategory**](CategoryApi.md#createcategory) | **POST** /category | Create a category. |
| [**GetAllCategories**](CategoryApi.md#getallcategories) | **GET** /category | Retrieve all categories |
| [**GetCategoryById**](CategoryApi.md#getcategorybyid) | **GET** /category/{categoryId} | Retrieve a category by ID |
| [**UpdateCategoryById**](CategoryApi.md#updatecategorybyid) | **PUT** /category/{categoryId} | Update a category by ID |

<a id="categorycategoryidbillsget"></a>
# **CategoryCategoryIdBillsGet**
> List&lt;CategoryCategoryIdBillsGet200ResponseInner&gt; CategoryCategoryIdBillsGet (Guid categoryId)

Get bills for a category by ID.

Retrieve all bills associated with a specific category by its ID. Only an authenticated user with the necessary permissions can perform this action. The categoryId must correspond to an existing category in the system. The user must be authenticated to access this endpoint. An user cannot access bills for a category they do not own. The microservice conect with the Bills microservice to retrieve the relevant bills for the specified category.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **categoryId** | **Guid** | The ID of the category to retrieve bills for. |  |

### Return type

[**List&lt;CategoryCategoryIdBillsGet200ResponseInner&gt;**](CategoryCategoryIdBillsGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of bills associated with the category. |  -  |
| **401** | Unauthorized. The user is not authenticated. |  -  |
| **403** | Forbidden. The user is authenticated but does not have permission to access the requested resource. |  -  |
| **404** | Not Found. The category with the specified ID does not exist. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="categorycategoryiddelete"></a>
# **CategoryCategoryIdDelete**
> Category CategoryCategoryIdDelete (Guid categoryId, Guid id)

Delete a category by ID.

Delete a category by ID. Only an authenticated user with the necessary permissions can perform this action. An user cannot delete a category they do not own. The category will change isActive to false instead of being permanently deleted. If the category has associated bills, it cannot be deleted.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **categoryId** | **Guid** | The unique identifier of the category. |  |
| **id** | **Guid** | The ID of the category to delete. |  |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The category was successfully deleted. |  -  |
| **401** | Unauthorized. The user is not authenticated. |  -  |
| **403** | Forbidden. The user is authenticated but does not have permission to delete the requested resource. |  -  |
| **404** | Not Found. The category with the specified ID does not exist. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="createcategory"></a>
# **CreateCategory**
> Category CreateCategory (CategoryRequest categoryRequest)

Create a category.

Create a new category with the provided details. The request body must contain  the necessary information to create the category. Each category must have a unique name for each user. The user must be authenticated to access this endpoint. Only authenticated users can create categories.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **categoryRequest** | [**CategoryRequest**](CategoryRequest.md) |  |  |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. Category created |  -  |
| **400** | Unable to create category. The provided category data is invalid or incomplete. |  -  |
| **401** | Unauthorized. The user is not authenticated. |  -  |
| **403** | Forbidden. The user is authenticated but does not have permission to access the requested resource. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getallcategories"></a>
# **GetAllCategories**
> List&lt;Category&gt; GetAllCategories ()

Retrieve all categories

Retrieve a list of all categories available to the authenticated user.


### Parameters
This endpoint does not need any parameter.
### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of categories. |  -  |
| **401** | Unauthorized. The user is not authenticated. |  -  |
| **403** | Forbidden. The user is authenticated but does not have permission to access the requested resource. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getcategorybyid"></a>
# **GetCategoryById**
> Category GetCategoryById (Guid categoryId)

Retrieve a category by ID

Retrieve a single category by its unique identifier. The user must be authenticated to access this endpoint. The endpoint will return an error if the category does not exist. The category must belong to the authenticated user.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **categoryId** | **Guid** | The unique identifier of the category. |  |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested category. |  -  |
| **401** | Unauthorized. The user is not authenticated. |  -  |
| **403** | Forbidden. The user is authenticated but does not have permission to access the requested resource. |  -  |
| **404** | Not Found. The category with the specified ID does not exist. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="updatecategorybyid"></a>
# **UpdateCategoryById**
> Category UpdateCategoryById (Guid categoryId, CategoryUpdateRequest categoryUpdateRequest)

Update a category by ID

Update the details of a category by its unique identifier. The user must be authenticated and must own the category to perform this action. The endpoint will return an error if the category does not exist or if the user does not have permission to update it. The user can only update categories they own. The user can update the name of the category and its description.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **categoryId** | **Guid** | The unique identifier of the category. |  |
| **categoryUpdateRequest** | [**CategoryUpdateRequest**](CategoryUpdateRequest.md) |  |  |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated category. |  -  |
| **401** | Unauthorized. The user is not authenticated. |  -  |
| **403** | Forbidden. The user is authenticated but does not have permission to update the requested resource. |  -  |
| **404** | Not Found. The category with the specified ID does not exist. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

