package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.StampAnnotationResponse;
import com.aspose.asposecloudpdf.model.StampAnnotationsResponse;

public class GetStampAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

		StampAnnotationsResponse responseAnnotations = pdfApi.getDocumentStampAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		StampAnnotationResponse response = pdfApi.getStampAnnotation(name, annotationId, null, "");
		System.out.println(response);

	}

}
