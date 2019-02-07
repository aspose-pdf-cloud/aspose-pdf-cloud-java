package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.HighlightAnnotationResponse;
import com.aspose.asposecloudpdf.model.HighlightAnnotationsResponse;

public class GetHighLightAnnotationExample {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		HighlightAnnotationsResponse responseAnnotations = pdfApi.getDocumentHighlightAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        HighlightAnnotationResponse response = pdfApi.getHighlightAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());

	}

}
