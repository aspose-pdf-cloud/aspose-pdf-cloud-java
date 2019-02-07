package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.DocumentResponse;

public class PostAppendDocumentExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";
		String appendFileName = "4pages.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9");

		Common.uploadFile(pdfApi, name);
		Common.uploadFile(pdfApi, appendFileName);

		int startPage = 2;
		int endPage = 4;

		DocumentResponse response = pdfApi.postAppendDocument(name, null, "" + '/' + appendFileName,
				startPage, endPage, null,"");
		
		System.out.println(response.getCode());


	}

}
