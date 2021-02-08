package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetPageConvertToPNGExample {

	public static void main(String[] args) throws ApiException {
		
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		final String name = "4pages.pdf";
		Common.uploadFile(pdfApi, name);
		int pageNumber = 2;

        File response =pdfApi.getPageConvertToPng(name, pageNumber, null, null, "", null);
	}

}
