package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.TextAnnotationResponse;
import com.aspose.asposecloudpdf.model.TextAnnotationsResponse;

public class GetTextAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		TextAnnotationsResponse responseAnnotations = pdfApi.getDocumentTextAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		TextAnnotationResponse response = pdfApi.getTextAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());

	}

}
