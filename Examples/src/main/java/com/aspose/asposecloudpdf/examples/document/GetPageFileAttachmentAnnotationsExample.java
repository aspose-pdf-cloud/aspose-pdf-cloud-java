package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.FileAttachmentAnnotationsResponse;

public class GetPageFileAttachmentAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		 String name = "PdfWithAnnotations.pdf";
		 Common.uploadFile(pdfApi, name);

	        int pageNumber = 2;
	        FileAttachmentAnnotationsResponse response = pdfApi.getPageFileAttachmentAnnotations(name, pageNumber, null, "");
	        System.out.println(response);
	}
}
