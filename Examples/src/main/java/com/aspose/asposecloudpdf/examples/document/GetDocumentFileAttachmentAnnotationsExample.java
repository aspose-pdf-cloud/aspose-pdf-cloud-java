package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.FileAttachmentAnnotationsResponse;

public class GetDocumentFileAttachmentAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "PdfWithAnnotations.pdf";
		Common.uploadFile(pdfApi, name);

        FileAttachmentAnnotationsResponse response = pdfApi.getDocumentFileAttachmentAnnotations(name, null, "");
        System.out.println(response);
	}

}
