package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.CircleAnnotationResponse;
import com.aspose.asposecloudpdf.model.CircleAnnotationsResponse;

public class GetCircleAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

        CircleAnnotationsResponse responseAnnotations = pdfApi.getDocumentCircleAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        CircleAnnotationResponse response = pdfApi.getCircleAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());


	}

}
