package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPageConvertToJPEG {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		final String name = "4pages.pdf";
		Common.uploadFile(pdfApi, name);
		int pageNumber = 2;
		final String resultFile = "page.jpeg";
		final String outPath = resultFile;
		AsposeResponse response = pdfApi.putPageConvertToJpeg(name, pageNumber, outPath, null, null, "", null);
		System.out.print(response.getCode());

	}

}
