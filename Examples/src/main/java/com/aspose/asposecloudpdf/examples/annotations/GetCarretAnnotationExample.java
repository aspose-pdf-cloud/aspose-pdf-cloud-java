package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.CaretAnnotationResponse;
import com.aspose.asposecloudpdf.model.CaretAnnotationsResponse;

public class GetCarretAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		
		CaretAnnotationsResponse responseAnnotations = pdfApi.getDocumentCaretAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        CaretAnnotationResponse response = pdfApi.getCaretAnnotation(name, annotationId, null, "");
		System.out.println(response);


	}

}
