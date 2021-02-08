package com.aspose.asposecloudpdf.examples.tables;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class deletePageTables {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithTable.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		AsposeResponse response = pdfApi.deletePageTables(name, 1, null, null);
		System.out.println(response);

	}

}
