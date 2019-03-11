package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.ScreenAnnotationResponse;
import com.aspose.asposecloudpdf.model.ScreenAnnotationsResponse;

public class GetScreenAnnotationExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "PdfWithScreenAnnotations.pdf";
		Common.uploadFile(pdfApi,name);

        ScreenAnnotationsResponse responseAnnotations = pdfApi.getDocumentScreenAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        ScreenAnnotationResponse response = pdfApi.getScreenAnnotation(name, annotationId, null, "");
        System.out.println(response);

	}

}
