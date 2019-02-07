package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.SquareAnnotationsResponse;

public class GetDocumentSquareAnnotationsTest {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
        SquareAnnotationsResponse response = pdfApi.getDocumentSquareAnnotations(name, null, "");
        System.out.println(response.getCode());

	}

}
