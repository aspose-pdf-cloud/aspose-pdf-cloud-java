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
import com.aspose.asposecloudpdf.model.PageRange;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents Pdf split into ranges options.
 */
@ApiModel(description = "Represents Pdf split into ranges options.")

public class SplitRangePdfOptions {
  @SerializedName("PageRanges")
  private List<PageRange> pageRanges = null;

  public SplitRangePdfOptions pageRanges(List<PageRange> pageRanges) {
    this.pageRanges = pageRanges;
    return this;
  }

  public SplitRangePdfOptions addPageRangesItem(PageRange pageRangesItem) {
    if (this.pageRanges == null) {
      this.pageRanges = new ArrayList<PageRange>();
    }
    this.pageRanges.add(pageRangesItem);
    return this;
  }

   /**
   * Get pageRanges
   * @return pageRanges
  **/
  @ApiModelProperty(value = "")
  public List<PageRange> getPageRanges() {
    return pageRanges;
  }

  public void setPageRanges(List<PageRange> pageRanges) {
    this.pageRanges = pageRanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitRangePdfOptions splitRangePdfOptions = (SplitRangePdfOptions) o;
    return Objects.equals(this.pageRanges, splitRangePdfOptions.pageRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageRanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitRangePdfOptions {\n");
    
    sb.append("    pageRanges: ").append(toIndentedString(pageRanges)).append("\n");
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

