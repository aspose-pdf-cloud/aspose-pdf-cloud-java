package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutConvetToTiffExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		final String name = "4pages.pdf";
		Common.uploadFile(pdfApi, name);
		int pageNumber = 2;
		final String resultFile = "page.tiff";
		final String outPath = resultFile;
		AsposeResponse response = pdfApi.putPageConvertToTiff(name, pageNumber, outPath, null, null,
				"", null);
		
		System.out.print(response.getCode());
	}
}
