package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutSearchableDocumentExample {

	public static void main(String[] args) throws ApiException {

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "rusdoc.pdf";
		String lang = "rus,eng";
		String folder = "";
		Common.uploadFile(pdfApi, name);
		AsposeResponse response = pdfApi.putSearchableDocument(name, null, folder, lang);
		System.out.println(response.getCode());
	}

}
