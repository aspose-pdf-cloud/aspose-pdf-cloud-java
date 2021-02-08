package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class DeletePageAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		int pageNumber = 2;

		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
        AsposeResponse response = pdfApi.deletePageAnnotations(name, pageNumber, null, "");
        System.out.println(response.getCode());

	}

}
