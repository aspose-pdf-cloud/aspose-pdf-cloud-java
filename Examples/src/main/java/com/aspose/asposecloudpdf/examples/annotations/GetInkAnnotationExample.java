package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.InkAnnotationResponse;
import com.aspose.asposecloudpdf.model.InkAnnotationsResponse;

public class GetInkAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		InkAnnotationsResponse responseAnnotations = pdfApi.getDocumentInkAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		InkAnnotationResponse response = pdfApi.getInkAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());

	}

}
