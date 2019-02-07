package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PostMovePageTestExample {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		int pageNumber = 1;
		int newIndex = 1;

		AsposeResponse response = pdfApi.postMovePage(name, pageNumber, newIndex, null, "");
		System.out.println(response.getCode());

	}

}
