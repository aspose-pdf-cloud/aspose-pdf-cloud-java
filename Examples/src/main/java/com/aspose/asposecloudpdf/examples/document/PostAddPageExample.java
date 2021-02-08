package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.DocumentPagesResponse;

public class PostAddPageExample {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		DocumentPagesResponse response = pdfApi.putAddNewPage(name, null, "");
		System.out.println(response.getCode());

	}

}
