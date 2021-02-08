package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.SquareAnnotationResponse;
import com.aspose.asposecloudpdf.model.SquareAnnotationsResponse;

public class GetSquareAnnotationExample {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		SquareAnnotationsResponse responseAnnotations = pdfApi.getDocumentSquareAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        SquareAnnotationResponse response = pdfApi.getSquareAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());


	}

}
