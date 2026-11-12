package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CategoryRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:06:48.248741+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class CategoryRequest {

  private String name;

  private @Nullable Boolean isActive;

  private String description;

  private @Nullable UUID categoryMainId;

  private @Nullable Boolean isMain;

  public CategoryRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoryRequest(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public CategoryRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the category.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "The name of the category.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public CategoryRequest isActive(@Nullable Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the category is active. If false, the category is considered inactive or deleted. By default, it is set to true.
   * @return isActive
   */
  
  @Schema(name = "isActive", description = "Indicates whether the category is active. If false, the category is considered inactive or deleted. By default, it is set to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public @Nullable Boolean getIsActive() {
    return isActive;
  }

  @JsonProperty("isActive")
  public void setIsActive(@Nullable Boolean isActive) {
    this.isActive = isActive;
  }

  public CategoryRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the category.
   * @return description
   */
  @NotNull 
  @Schema(name = "description", description = "The description of the category.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryRequest categoryMainId(@Nullable UUID categoryMainId) {
    this.categoryMainId = categoryMainId;
    return this;
  }

  /**
   * The unique identifier of the main category to which this category belongs.
   * @return categoryMainId
   */
  @Valid 
  @Schema(name = "categoryMainId", description = "The unique identifier of the main category to which this category belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryMainId")
  public @Nullable UUID getCategoryMainId() {
    return categoryMainId;
  }

  @JsonProperty("categoryMainId")
  public void setCategoryMainId(@Nullable UUID categoryMainId) {
    this.categoryMainId = categoryMainId;
  }

  public CategoryRequest isMain(@Nullable Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

  /**
   * Indicates whether the category is a main category. If true, the category is considered a main category. By default, it is set to false.
   * @return isMain
   */
  
  @Schema(name = "isMain", description = "Indicates whether the category is a main category. If true, the category is considered a main category. By default, it is set to false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMain")
  public @Nullable Boolean getIsMain() {
    return isMain;
  }

  @JsonProperty("isMain")
  public void setIsMain(@Nullable Boolean isMain) {
    this.isMain = isMain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryRequest categoryRequest = (CategoryRequest) o;
    return Objects.equals(this.name, categoryRequest.name) &&
        Objects.equals(this.isActive, categoryRequest.isActive) &&
        Objects.equals(this.description, categoryRequest.description) &&
        Objects.equals(this.categoryMainId, categoryRequest.categoryMainId) &&
        Objects.equals(this.isMain, categoryRequest.isMain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isActive, description, categoryMainId, isMain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryMainId: ").append(toIndentedString(categoryMainId)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

