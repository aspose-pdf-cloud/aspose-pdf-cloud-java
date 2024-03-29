/**
 *
 * Copyright (c) 2024 Aspose.PDF Cloud
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
import com.aspose.asposecloudpdf.model.Position;
import com.aspose.asposecloudpdf.model.Rectangle;
import com.aspose.asposecloudpdf.model.TextState;
import com.aspose.asposecloudpdf.model.VerticalAlignment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents text occurrence.
 */
@ApiModel(description = "Represents text occurrence.")

public class TextRect {
  @SerializedName("Text")
  private String text = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("Rect")
  private Rectangle rect = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("Position")
  private Position position = null;

  @SerializedName("BaselinePosition")
  private Position baselinePosition = null;

  @SerializedName("TextState")
  private TextState textState = null;

  public TextRect text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of the occurrence.
   * @return text
  **/
  @ApiModelProperty(value = "Text of the occurrence.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TextRect page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page on which the occurrence is found.
   * @return page
  **/
  @ApiModelProperty(value = "Page on which the occurrence is found.")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TextRect rect(Rectangle rect) {
    this.rect = rect;
    return this;
  }

   /**
   * Rectangle of the occurrence.
   * @return rect
  **/
  @ApiModelProperty(value = "Rectangle of the occurrence.")
  public Rectangle getRect() {
    return rect;
  }

  public void setRect(Rectangle rect) {
    this.rect = rect;
  }

  public TextRect horizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets or sets a horizontal alignment of text fragment. 
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets a horizontal alignment of text fragment. ")
  public HorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public TextRect verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets or sets a vertical alignment of text fragment. 
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets a vertical alignment of text fragment. ")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public TextRect position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * Gets or sets text position for text, represented with TextRect object.
   * @return position
  **/
  @ApiModelProperty(value = "Gets or sets text position for text, represented with TextRect object.")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public TextRect baselinePosition(Position baselinePosition) {
    this.baselinePosition = baselinePosition;
    return this;
  }

   /**
   * Gets text position for text, represented with TextRect object. The YIndent of the Position structure represents baseline coordinate of the text fragment.
   * @return baselinePosition
  **/
  @ApiModelProperty(value = "Gets text position for text, represented with TextRect object. The YIndent of the Position structure represents baseline coordinate of the text fragment.")
  public Position getBaselinePosition() {
    return baselinePosition;
  }

  public void setBaselinePosition(Position baselinePosition) {
    this.baselinePosition = baselinePosition;
  }

  public TextRect textState(TextState textState) {
    this.textState = textState;
    return this;
  }

   /**
   * Gets or sets text state for the text that TextRect object represents.
   * @return textState
  **/
  @ApiModelProperty(value = "Gets or sets text state for the text that TextRect object represents.")
  public TextState getTextState() {
    return textState;
  }

  public void setTextState(TextState textState) {
    this.textState = textState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextRect textRect = (TextRect) o;
    return Objects.equals(this.text, textRect.text) &&
        Objects.equals(this.page, textRect.page) &&
        Objects.equals(this.rect, textRect.rect) &&
        Objects.equals(this.horizontalAlignment, textRect.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, textRect.verticalAlignment) &&
        Objects.equals(this.position, textRect.position) &&
        Objects.equals(this.baselinePosition, textRect.baselinePosition) &&
        Objects.equals(this.textState, textRect.textState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, page, rect, horizontalAlignment, verticalAlignment, position, baselinePosition, textState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextRect {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    baselinePosition: ").append(toIndentedString(baselinePosition)).append("\n");
    sb.append("    textState: ").append(toIndentedString(textState)).append("\n");
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

