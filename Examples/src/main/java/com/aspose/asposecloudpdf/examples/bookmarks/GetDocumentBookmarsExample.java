package com.aspose.asposecloudpdf.examples.bookmarks;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.BookmarksResponse;

public class GetDocumentBookmarsExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithBookmarks.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		BookmarksResponse response = pdfApi.getDocumentBookmarks(name, null, null);
	}
}
