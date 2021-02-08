package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;

public class GetWebStoragePDF {

	public static void main(String[] args) throws ApiException {
		String sourceUrl = "http://google.com";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		File response = pdfApi.getWebInStorageToPdf(sourceUrl, null, null, null, null, null, null, null, null);
	}
}
