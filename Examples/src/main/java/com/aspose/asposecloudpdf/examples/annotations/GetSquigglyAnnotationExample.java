package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.SquigglyAnnotationResponse;
import com.aspose.asposecloudpdf.model.SquigglyAnnotationsResponse;

public class GetSquigglyAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

        SquigglyAnnotationsResponse responseAnnotations = pdfApi.getDocumentSquigglyAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        SquigglyAnnotationResponse response = pdfApi.getSquigglyAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());


	}

}
