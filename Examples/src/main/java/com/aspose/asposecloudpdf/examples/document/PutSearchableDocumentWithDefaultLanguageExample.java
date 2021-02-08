package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutSearchableDocumentWithDefaultLanguageExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "rusdoc.pdf";
		String folder = "";
		AsposeResponse response = pdfApi.putSearchableDocument(name, null, folder, null);
		System.out.println(response.getCode());
	}
}
