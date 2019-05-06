/**
 *
 *   Copyright (c) 2019 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdf.model;

import java.util.Objects;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Link;
import com.aspose.asposecloudpdf.model.Rotation;
import com.aspose.asposecloudpdf.model.StampBase;
import com.aspose.asposecloudpdf.model.TextState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Represents Pdf text header.
 */
@ApiModel(description = "Represents Pdf text header.")

public class TextHeader extends StampBase {
  @SerializedName("TextAlignment")
  private HorizontalAlignment textAlignment = null;

  @SerializedName("Value")
  private String value = null;

  @SerializedName("TextState")
  private TextState textState = null;

  @SerializedName("LeftMargin")
  private Double leftMargin = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  public TextHeader textAlignment(HorizontalAlignment textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

   /**
   * Alignment of the text inside the stamp.
   * @return textAlignment
  **/
  @ApiModelProperty(value = "Alignment of the text inside the stamp.")
  public HorizontalAlignment getTextAlignment() {
    return textAlignment;
  }

  public void setTextAlignment(HorizontalAlignment textAlignment) {
    this.textAlignment = textAlignment;
  }

  public TextHeader value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Gets or sets string value which is used as stamp on the page.
   * @return value
  **/
  @ApiModelProperty(value = "Gets or sets string value which is used as stamp on the page.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TextHeader textState(TextState textState) {
    this.textState = textState;
    return this;
  }

   /**
   * Gets text properties of the stamp. See  for details.
   * @return textState
  **/
  @ApiModelProperty(value = "Gets text properties of the stamp. See  for details.")
  public TextState getTextState() {
    return textState;
  }

  public void setTextState(TextState textState) {
    this.textState = textState;
  }

  public TextHeader leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Gets or sets left margin of stamp.
   * @return leftMargin
  **/
  @ApiModelProperty(value = "Gets or sets left margin of stamp.")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public TextHeader topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Gets or sets top margin of stamp.
   * @return topMargin
  **/
  @ApiModelProperty(value = "Gets or sets top margin of stamp.")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public TextHeader rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Gets or sets right margin of stamp.
   * @return rightMargin
  **/
  @ApiModelProperty(value = "Gets or sets right margin of stamp.")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextHeader textHeader = (TextHeader) o;
    return Objects.equals(this.textAlignment, textHeader.textAlignment) &&
        Objects.equals(this.value, textHeader.value) &&
        Objects.equals(this.textState, textHeader.textState) &&
        Objects.equals(this.leftMargin, textHeader.leftMargin) &&
        Objects.equals(this.topMargin, textHeader.topMargin) &&
        Objects.equals(this.rightMargin, textHeader.rightMargin) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textAlignment, value, textState, leftMargin, topMargin, rightMargin, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextHeader {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    textState: ").append(toIndentedString(textState)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
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

