package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.ScreenAnnotationsResponse;

public class GetDocumentScreenAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		   String name = "PdfWithScreenAnnotations.pdf";
			PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
	        Common.uploadFile(pdfApi,name);
	        ScreenAnnotationsResponse response = pdfApi.getDocumentScreenAnnotations(name, null, "");
	        System.out.println(response);
	}
}
