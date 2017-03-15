package io.swagger.models.parameters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.Content;
import io.swagger.models.Example;
import io.swagger.models.Schema;

import java.util.List;
import java.util.Objects;

/**
 * Parameter
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-15T10:33:02.362-07:00")
public class Parameter {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets in
   */
  public enum InEnum {
    PATH("path"),
    
    QUERY("query"),
    
    HEADER("header"),
    
    COOKIE("cookie");

    private String value;

    InEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InEnum fromValue(String text) {
      for (InEnum b : InEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("in")
  private InEnum in = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("deprecated")
  private Boolean deprecated = null;

  @JsonProperty("allowEmptyValue")
  private Boolean allowEmptyValue = null;

  /**
   * Gets or Sets style
   */
  public enum StyleEnum {
    MATRIX("matrix"),
    
    LABEL("label"),
    
    FORM("form"),
    
    SIMPLE("simple"),
    
    SPACEDELIMITED("spaceDelimited"),
    
    PIPEDELIMITED("pipeDelimited"),
    
    DEEPOBJECT("deepObject");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("style")
  private StyleEnum style = null;

  @JsonProperty("explode")
  private Boolean explode = null;

  @JsonProperty("allowReserved")
  private Boolean allowReserved = null;

  @JsonProperty("schema")
  private Schema schema = null;

  @JsonProperty("examples")
  private List<Example> examples = null;

  @JsonProperty("example")
  private Example example = null;

  @JsonProperty("content")
  private Content content = null;

  public Parameter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parameter in(InEnum in) {
    this.in = in;
    return this;
  }

   /**
   * Get in
   * @return in
  **/
  @ApiModelProperty(required = true, value = "")
  public InEnum getIn() {
    return in;
  }

  public void setIn(InEnum in) {
    this.in = in;
  }

  public Parameter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Parameter required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public Parameter deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Get deprecated
   * @return deprecated
  **/
  @ApiModelProperty(value = "")
  public Boolean getDeprecated() {
    return deprecated;
  }

  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }

  public Parameter allowEmptyValue(Boolean allowEmptyValue) {
    this.allowEmptyValue = allowEmptyValue;
    return this;
  }

   /**
   * Get allowEmptyValue
   * @return allowEmptyValue
  **/
  @ApiModelProperty(value = "")
  public Boolean getAllowEmptyValue() {
    return allowEmptyValue;
  }

  public void setAllowEmptyValue(Boolean allowEmptyValue) {
    this.allowEmptyValue = allowEmptyValue;
  }

  public Parameter style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(value = "")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Parameter explode(Boolean explode) {
    this.explode = explode;
    return this;
  }

   /**
   * Get explode
   * @return explode
  **/
  @ApiModelProperty(value = "")
  public Boolean getExplode() {
    return explode;
  }

  public void setExplode(Boolean explode) {
    this.explode = explode;
  }

  public Parameter allowReserved(Boolean allowReserved) {
    this.allowReserved = allowReserved;
    return this;
  }

   /**
   * Get allowReserved
   * @return allowReserved
  **/
  @ApiModelProperty(value = "")
  public Boolean getAllowReserved() {
    return allowReserved;
  }

  public void setAllowReserved(Boolean allowReserved) {
    this.allowReserved = allowReserved;
  }

  public Parameter schema(Schema schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(value = "")
  public Schema getSchema() {
    return schema;
  }

  public void setSchema(Schema schema) {
    this.schema = schema;
  }

  public Parameter examples(List<Example> examples) {
    this.examples = examples;
    return this;
  }

  public Parameter addExamplesItem(Example examplesItem) {
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * Get examples
   * @return examples
  **/
  @ApiModelProperty(value = "")
  public List<Example> getExamples() {
    return examples;
  }

  public void setExamples(List<Example> examples) {
    this.examples = examples;
  }

  public Parameter example(Example example) {
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @ApiModelProperty(value = "")
  public Example getExample() {
    return example;
  }

  public void setExample(Example example) {
    this.example = example;
  }

  public Parameter content(Content content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public Content getContent() {
    return content;
  }

  public void setContent(Content content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(this.name, parameter.name) &&
        Objects.equals(this.in, parameter.in) &&
        Objects.equals(this.description, parameter.description) &&
        Objects.equals(this.required, parameter.required) &&
        Objects.equals(this.deprecated, parameter.deprecated) &&
        Objects.equals(this.allowEmptyValue, parameter.allowEmptyValue) &&
        Objects.equals(this.style, parameter.style) &&
        Objects.equals(this.explode, parameter.explode) &&
        Objects.equals(this.allowReserved, parameter.allowReserved) &&
        Objects.equals(this.schema, parameter.schema) &&
        Objects.equals(this.examples, parameter.examples) &&
        Objects.equals(this.example, parameter.example) &&
        Objects.equals(this.content, parameter.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, in, description, required, deprecated, allowEmptyValue, style, explode, allowReserved, schema, examples, example, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    allowEmptyValue: ").append(toIndentedString(allowEmptyValue)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    explode: ").append(toIndentedString(explode)).append("\n");
    sb.append("    allowReserved: ").append(toIndentedString(allowReserved)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

