package com.aspose.asposecloudpdf.examples.bookmarks;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetDocumentBookmarsExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithBookmarks.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		File response = pdfApi.getDocumentBookmarks(name, null, null, "");
	}
}
