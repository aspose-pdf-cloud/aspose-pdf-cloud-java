package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.PolyLineAnnotationResponse;
import com.aspose.asposecloudpdf.model.PolyLineAnnotationsResponse;

public class GetPolyLineAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

        PolyLineAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolyLineAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        PolyLineAnnotationResponse response = pdfApi.getPolyLineAnnotation(name, annotationId, null, "");
        
		System.out.println(response.getCode());


	}

}
