package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AttachmentsResponse;

public class GetDocumentAttachments {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "PdfWithEmbeddedFiles.pdf";
		Common.uploadFile(pdfApi, name);
		AttachmentsResponse response = pdfApi.getDocumentAttachments(name, null, "");
		System.out.println(response.getCode());
	}
}
