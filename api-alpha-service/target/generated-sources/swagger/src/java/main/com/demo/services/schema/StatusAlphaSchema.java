package com.demo.services.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusAlphaSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-19T13:59:14.106+01:00")

public class StatusAlphaSchema   {
  @JsonProperty("inStatusValue")
  private String inStatusValue = null;

  public StatusAlphaSchema inStatusValue(String inStatusValue) {
    this.inStatusValue = inStatusValue;
    return this;
  }

  /**
   * Get inStatusValue
   * @return inStatusValue
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getInStatusValue() {
    return inStatusValue;
  }

  public void setInStatusValue(String inStatusValue) {
    this.inStatusValue = inStatusValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusAlphaSchema statusAlphaSchema = (StatusAlphaSchema) o;
    return Objects.equals(this.inStatusValue, statusAlphaSchema.inStatusValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inStatusValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusAlphaSchema {\n");
    
    sb.append("    inStatusValue: ").append(toIndentedString(inStatusValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

