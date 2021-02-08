package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetPageConvertToGIFExample {

	public static void main(String[] args) throws ApiException {
		String name = "template.pcl";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
        int pageNumber = 2;
        File response = pdfApi.getPageConvertToGif(name, pageNumber, null, null, "", null);
	}
}
