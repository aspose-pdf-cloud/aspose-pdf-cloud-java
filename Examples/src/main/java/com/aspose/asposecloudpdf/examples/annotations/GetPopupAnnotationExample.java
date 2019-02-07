package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.PopupAnnotationResponse;
import com.aspose.asposecloudpdf.model.PopupAnnotationsResponse;

public class GetPopupAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		PopupAnnotationsResponse responseAnnotations = pdfApi.getDocumentPopupAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		PopupAnnotationResponse response = pdfApi.getPopupAnnotation(name, annotationId, null, "");
		System.out.println(response.getCode());

	}

}
