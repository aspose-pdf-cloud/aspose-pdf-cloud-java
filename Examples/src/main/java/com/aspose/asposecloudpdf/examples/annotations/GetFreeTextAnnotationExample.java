package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.FreeTextAnnotationResponse;
import com.aspose.asposecloudpdf.model.FreeTextAnnotationsResponse;

public class GetFreeTextAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		
		PdfApi pdfApi = new PdfApi("b125f13bf6b76ed81ee990142d841195", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		FreeTextAnnotationsResponse responseAnnotations = pdfApi.getDocumentFreeTextAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        FreeTextAnnotationResponse response = pdfApi.getFreeTextAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());


	}

}
