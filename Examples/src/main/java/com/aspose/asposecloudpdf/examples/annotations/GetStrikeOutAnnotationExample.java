package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.StrikeOutAnnotationResponse;
import com.aspose.asposecloudpdf.model.StrikeOutAnnotationsResponse;

public class GetStrikeOutAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		StrikeOutAnnotationsResponse responseAnnotations = pdfApi.getDocumentStrikeOutAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        StrikeOutAnnotationResponse response = pdfApi.getStrikeOutAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());


	}

}
