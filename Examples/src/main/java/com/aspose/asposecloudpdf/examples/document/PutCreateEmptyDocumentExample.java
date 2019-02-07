package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.DocumentResponse;

public class PutCreateEmptyDocumentExample {

	public static void main(String[] args) throws ApiException {
		String name = "empty.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		DocumentResponse response = pdfApi.putCreateDocument(name, null, "");
		System.out.println(response.getCode());
	}
}
