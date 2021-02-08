package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.PolygonAnnotationResponse;
import com.aspose.asposecloudpdf.model.PolygonAnnotationsResponse;

public class GetPolygonAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		PolygonAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolygonAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();
        PolygonAnnotationResponse response = pdfApi.getPolygonAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());


	}

}
