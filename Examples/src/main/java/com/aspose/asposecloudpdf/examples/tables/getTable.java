package com.aspose.asposecloudpdf.examples.tables;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.TableRecognizedResponse;
import com.aspose.asposecloudpdf.model.TablesRecognizedResponse;

public class getTable {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithTable.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		TablesRecognizedResponse tablesResponse = pdfApi.getDocumentTables(name, null, null);
		String tableId = tablesResponse.getTables().getList().get(0).getId();

		TableRecognizedResponse response = pdfApi.getTable(name, tableId, null, null);

		System.out.println(response);

	}

}
