package com.aspose.asposecloudpdf.examples.screen;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.ScreenAnnotationsResponse;

public class getScreenAnnotationData {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithScreenAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		ScreenAnnotationsResponse responseAnnotations = pdfApi.getDocumentScreenAnnotations(name, null, null);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		File response = pdfApi.getScreenAnnotationData(name, annotationId, null, null);

	}

}
