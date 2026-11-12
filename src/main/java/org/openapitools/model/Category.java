package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Category
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:06:48.248741+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class Category {

  private @Nullable UUID categoryid;

  private @Nullable String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable UUID userId;

  private @Nullable Boolean isActive;

  private @Nullable Boolean isMain;

  private @Nullable UUID categoryMainId;

  public Category categoryid(@Nullable UUID categoryid) {
    this.categoryid = categoryid;
    return this;
  }

  /**
   * The unique identifier of the category.
   * @return categoryid
   */
  @Valid 
  @Schema(name = "categoryid", description = "The unique identifier of the category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryid")
  public @Nullable UUID getCategoryid() {
    return categoryid;
  }

  @JsonProperty("categoryid")
  public void setCategoryid(@Nullable UUID categoryid) {
    this.categoryid = categoryid;
  }

  public Category name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the category.
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Category createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the category was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "createdAt", description = "The timestamp when the category was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("createdAt")
  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Category userId(@Nullable UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The unique identifier of the user who owns the category. It is required when creating a new category. It is related to the microservice User.
   * @return userId
   */
  @Valid 
  @Schema(name = "userId", description = "The unique identifier of the user who owns the category. It is required when creating a new category. It is related to the microservice User.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public @Nullable UUID getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(@Nullable UUID userId) {
    this.userId = userId;
  }

  public Category isActive(@Nullable Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates whether the category is active. If false, the category is considered inactive or deleted.
   * @return isActive
   */
  
  @Schema(name = "isActive", description = "Indicates whether the category is active. If false, the category is considered inactive or deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isActive")
  public @Nullable Boolean getIsActive() {
    return isActive;
  }

  @JsonProperty("isActive")
  public void setIsActive(@Nullable Boolean isActive) {
    this.isActive = isActive;
  }

  public Category isMain(@Nullable Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

  /**
   * Indicates whether the category is a main category. If true, the category is considered a main category. By default, it is set to true.
   * @return isMain
   */
  
  @Schema(name = "isMain", description = "Indicates whether the category is a main category. If true, the category is considered a main category. By default, it is set to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMain")
  public @Nullable Boolean getIsMain() {
    return isMain;
  }

  @JsonProperty("isMain")
  public void setIsMain(@Nullable Boolean isMain) {
    this.isMain = isMain;
  }

  public Category categoryMainId(@Nullable UUID categoryMainId) {
    this.categoryMainId = categoryMainId;
    return this;
  }

  /**
   * The unique identifier of the main category to which this category belongs. it is required if the category is not a main category. It is related to the categoryId in the system.
   * @return categoryMainId
   */
  @Valid 
  @Schema(name = "categoryMainId", description = "The unique identifier of the main category to which this category belongs. it is required if the category is not a main category. It is related to the categoryId in the system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryMainId")
  public @Nullable UUID getCategoryMainId() {
    return categoryMainId;
  }

  @JsonProperty("categoryMainId")
  public void setCategoryMainId(@Nullable UUID categoryMainId) {
    this.categoryMainId = categoryMainId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryid, category.categoryid) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.createdAt, category.createdAt) &&
        Objects.equals(this.userId, category.userId) &&
        Objects.equals(this.isActive, category.isActive) &&
        Objects.equals(this.isMain, category.isMain) &&
        Objects.equals(this.categoryMainId, category.categoryMainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryid, name, createdAt, userId, isActive, isMain, categoryMainId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    categoryid: ").append(toIndentedString(categoryid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    categoryMainId: ").append(toIndentedString(categoryMainId)).append("\n");
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

