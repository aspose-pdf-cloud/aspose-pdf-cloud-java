package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.StrikeOutAnnotationsResponse;

public class GetPageStrikeOutAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		int pageNumber = 2;

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		StrikeOutAnnotationsResponse response = pdfApi.getPageStrikeOutAnnotations(name, pageNumber, null, "");

		System.out.println(response.getCode());

	}

}
