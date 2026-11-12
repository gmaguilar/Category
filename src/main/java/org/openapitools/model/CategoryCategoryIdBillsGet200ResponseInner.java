package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CategoryCategoryIdBillsGet200ResponseInner
 */

@JsonTypeName("_category__categoryId__bills_get_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:06:48.248741+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
public class CategoryCategoryIdBillsGet200ResponseInner {

  private @Nullable UUID id;

  private @Nullable Double cantidad;

  private @Nullable String descripcion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime fechaCreacion;

  public CategoryCategoryIdBillsGet200ResponseInner id(@Nullable UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable UUID getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable UUID id) {
    this.id = id;
  }

  public CategoryCategoryIdBillsGet200ResponseInner cantidad(@Nullable Double cantidad) {
    this.cantidad = cantidad;
    return this;
  }

  /**
   * Get cantidad
   * @return cantidad
   */
  
  @Schema(name = "cantidad", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cantidad")
  public @Nullable Double getCantidad() {
    return cantidad;
  }

  @JsonProperty("cantidad")
  public void setCantidad(@Nullable Double cantidad) {
    this.cantidad = cantidad;
  }

  public CategoryCategoryIdBillsGet200ResponseInner descripcion(@Nullable String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  /**
   * Get descripcion
   * @return descripcion
   */
  
  @Schema(name = "descripcion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descripcion")
  public @Nullable String getDescripcion() {
    return descripcion;
  }

  @JsonProperty("descripcion")
  public void setDescripcion(@Nullable String descripcion) {
    this.descripcion = descripcion;
  }

  public CategoryCategoryIdBillsGet200ResponseInner fechaCreacion(@Nullable OffsetDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    return this;
  }

  /**
   * Get fechaCreacion
   * @return fechaCreacion
   */
  @Valid 
  @Schema(name = "fechaCreacion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fechaCreacion")
  public @Nullable OffsetDateTime getFechaCreacion() {
    return fechaCreacion;
  }

  @JsonProperty("fechaCreacion")
  public void setFechaCreacion(@Nullable OffsetDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryCategoryIdBillsGet200ResponseInner categoryCategoryIdBillsGet200ResponseInner = (CategoryCategoryIdBillsGet200ResponseInner) o;
    return Objects.equals(this.id, categoryCategoryIdBillsGet200ResponseInner.id) &&
        Objects.equals(this.cantidad, categoryCategoryIdBillsGet200ResponseInner.cantidad) &&
        Objects.equals(this.descripcion, categoryCategoryIdBillsGet200ResponseInner.descripcion) &&
        Objects.equals(this.fechaCreacion, categoryCategoryIdBillsGet200ResponseInner.fechaCreacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cantidad, descripcion, fechaCreacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryCategoryIdBillsGet200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    fechaCreacion: ").append(toIndentedString(fechaCreacion)).append("\n");
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

