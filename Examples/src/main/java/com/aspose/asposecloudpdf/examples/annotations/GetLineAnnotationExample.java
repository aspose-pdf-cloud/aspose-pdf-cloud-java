package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.LineAnnotationResponse;
import com.aspose.asposecloudpdf.model.LineAnnotationsResponse;

public class GetLineAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		LineAnnotationsResponse responseAnnotations = pdfApi.getDocumentLineAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();
		LineAnnotationResponse response = pdfApi.getLineAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());

	}

}
