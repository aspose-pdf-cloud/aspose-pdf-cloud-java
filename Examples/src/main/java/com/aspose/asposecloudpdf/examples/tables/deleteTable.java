package com.aspose.asposecloudpdf.examples.tables;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.TablesRecognizedResponse;

public class deleteTable {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithTable.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		TablesRecognizedResponse tablesResponse = pdfApi.getDocumentTables(name, null, null);
		String tableId = tablesResponse.getTables().getList().get(0).getId();

		AsposeResponse response = pdfApi.deleteTable(name, tableId, null, null);
		System.out.println(response);

	}
}
