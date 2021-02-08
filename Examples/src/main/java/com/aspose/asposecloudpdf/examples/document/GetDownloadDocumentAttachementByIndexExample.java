package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetDownloadDocumentAttachementByIndexExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithEmbeddedFiles.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		int attachmentIndex = 1;
		File response = pdfApi.getDownloadDocumentAttachmentByIndex(name, attachmentIndex, null,"");

	}

}
