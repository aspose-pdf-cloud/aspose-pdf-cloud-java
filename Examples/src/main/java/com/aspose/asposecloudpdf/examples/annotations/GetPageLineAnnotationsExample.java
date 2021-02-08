package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.LineAnnotationsResponse;

public class GetPageLineAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

        int pageNumber = 2;

        LineAnnotationsResponse response = pdfApi.getPageLineAnnotations(name, pageNumber, null, "");
        System.out.println(response.getCode());
	}

}
