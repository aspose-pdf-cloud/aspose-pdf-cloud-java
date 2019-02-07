package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutImageExtaractAsTiffExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		int pageNumber = 1;
		final String destFolder = "extract_tiff";
		AsposeResponse response = pdfApi.putImagesExtractAsTiff(name, pageNumber, null, null, null, "", destFolder);
		System.out.println(response.getCode());
	}

}
