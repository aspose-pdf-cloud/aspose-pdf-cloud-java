package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.StampAnnotationsResponse;

public class GetStampAnnotationDataExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "PdfWithAnnotations.pdf";
        Common.uploadFile(pdfApi,name);

        StampAnnotationsResponse responseAnnotations = pdfApi.getDocumentStampAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        File response = pdfApi.getStampAnnotationData(name, annotationId, null, "");

	}

}
