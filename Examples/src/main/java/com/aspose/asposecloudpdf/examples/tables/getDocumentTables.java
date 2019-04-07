package com.aspose.asposecloudpdf.examples.tables;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.TablesRecognizedResponse;

public class getDocumentTables {

	public static void main(String[] args) throws ApiException {
        String name = "PdfWithTable.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		
		 TablesRecognizedResponse response = pdfApi.getDocumentTables(name, null, null);
		 System.out.println(response);
	}
}
