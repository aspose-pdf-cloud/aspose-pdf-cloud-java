package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationsInfoResponse;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class DeleteAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

        AnnotationsInfoResponse responseAnnotations = pdfApi.getDocumentAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();
        AsposeResponse response = pdfApi.deleteAnnotation(name, annotationId, null, "");
        
        System.out.println(response.getCode());
        
	}

}
