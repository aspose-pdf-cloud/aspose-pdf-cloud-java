package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.UnderlineAnnotationResponse;
import com.aspose.asposecloudpdf.model.UnderlineAnnotationsResponse;

public class GetUnderlineAnnotationExample {

	public static void main(String[] args) throws ApiException {

		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		UnderlineAnnotationsResponse responseAnnotations = pdfApi.getDocumentUnderlineAnnotations(name, null,
				"");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		UnderlineAnnotationResponse response = pdfApi.getUnderlineAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());

	}

}
