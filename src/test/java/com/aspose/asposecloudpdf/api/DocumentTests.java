/**
 *
 * Copyright (c) 2023 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of TestHelper.getInstance() software and associated documentation files (the "Software"), to deal
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

package com.aspose.asposecloudpdf.api;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.model.*;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DocumentTests {
    private TestHelper th;

    public DocumentTests() throws ApiException {
        th = TestHelper.getInstance();
    }

    /**
     * GetDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);

        String folder = this.th.tempFolder;

        DocumentResponse response = this.th.pdfApi.getDocument(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }


    /**
     * PostOptimizeDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postOptimizeDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);

        OptimizeOptions optimizeOptions = new OptimizeOptions();
        optimizeOptions.setAllowReusePageContent(false);
        optimizeOptions.setCompressImages(true);
        optimizeOptions.setImageQuality(100);
        optimizeOptions.setLinkDuplcateStreams(true);
        optimizeOptions.setRemoveUnusedObjects(true);
        optimizeOptions.setRemoveUnusedStreams(true);
        optimizeOptions.setUnembedFonts(true);

        String folder = this.th.tempFolder;

        AsposeResponse response = this.th.pdfApi.postOptimizeDocument(name, optimizeOptions, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostOptimizeDocument with password Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postOptimizeDocumentTestWithPassword() throws ApiException
    {
        String name = "4pagesEncrypted.pdf";
        this.th.uploadFile(name);
        OptimizeOptions optimizeOptions = new OptimizeOptions();
        optimizeOptions.setPassword("dXNlciAkXlBhc3N3b3JkISY="); //user $^Password!&
        optimizeOptions.setAllowReusePageContent(false);
        optimizeOptions.setCompressImages(true);
        optimizeOptions.setImageQuality(100);
        optimizeOptions.setLinkDuplcateStreams(true);
        optimizeOptions.setRemoveUnusedObjects(true);
        optimizeOptions.setRemoveUnusedStreams(true);
        optimizeOptions.setUnembedFonts(true);
        String folder = this.th.tempFolder;
        AsposeResponse response = this.th.pdfApi.postOptimizeDocument(name, optimizeOptions, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostSplitDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSplitDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);
        String folder = this.th.tempFolder;
        SplitResultResponse response = this.th.pdfApi.postSplitDocument(name, null, null, null, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostSplitRangePdfDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postSplitRangePdfDocumentTest() throws ApiException
    {
        String name = "4pages.pdf";
        this.th.uploadFile(name);
        SplitRangePdfOptions rangeOptions = new SplitRangePdfOptions();
        PageRange pageRange1 = new PageRange();
        pageRange1.setTo(2);
        rangeOptions.addPageRangesItem(pageRange1);
        PageRange pageRange2 = new PageRange();
        pageRange2.setFrom(3);
        rangeOptions.addPageRangesItem(pageRange2);
        PageRange pageRange3 = new PageRange();
        pageRange3.setFrom(2);
        pageRange3.setTo(3);
        rangeOptions.addPageRangesItem(pageRange3);
        String folder = this.th.tempFolder;
        SplitResultResponse response = this.th.pdfApi.postSplitRangePdfDocument(name, rangeOptions, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutCreateEmptyDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putCreateEmptyDocumentTest() throws ApiException
    {
        String name = "empty.pdf";

        String folder = this.th.tempFolder;

        DocumentResponse response = this.th.pdfApi.putCreateDocument(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PostCreateEmptyDocument Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void postCreateEmptyDocumentTest() throws ApiException
    {
        String name = "empty_post.pdf";

        String folder = this.th.tempFolder;

        DocumentConfig config = new DocumentConfig()
                .pagesCount(2)
                .documentProperties(
                        new DocumentProperties()
                                .list(new ArrayList<>(
                                        Arrays.asList(
                                                new DocumentProperty()
                                                        .builtIn(false)
                                                        .name("prop1")
                                                        .value("Val1")
                                        )
                                ))
                )
                .displayProperties(
                        new DisplayProperties()
                                .centerWindow(true)
                                .hideMenuBar(true)
                )
                .defaultPageConfig(
                        new DefaultPageConfig()
                                .height(100.)
                                .width(100.)
                );

        DocumentResponse response = this.th.pdfApi.postCreateDocument(name, config, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * GetDocumentDisplayProperties Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void getDocumentDisplayPropertiesTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        DisplayPropertiesResponse response = th.pdfApi.getDocumentDisplayProperties(name, null, folder);
        assertEquals(200, (int)response.getCode());
    }

    /**
     * PutDocumentDisplayProperties Test
     * @throws ApiException
     *          if the Api call fails
     */

    @Test
    public void putDocumentDisplayPropertiesTest() throws ApiException
    {
        String name = "4pages.pdf";
        th.uploadFile(name);

        String folder = th.tempFolder;

        DisplayProperties displayProperties = new DisplayProperties()
                .centerWindow(true)
                .direction(Direction.L2R)
                .displayDocTitle(true)
                .hideMenuBar(true)
                .hideToolBar(true)
                .hideWindowUI(true)
                .nonFullScreenPageMode(PageMode.USENONE)
                .pageLayout(PageLayout.TWOPAGELEFT)
                .pageMode(PageMode.USEOC);


        DisplayPropertiesResponse response = th.pdfApi.putDocumentDisplayProperties(name, displayProperties, null, folder);
        assertEquals(200, (int)response.getCode());
    }
}
