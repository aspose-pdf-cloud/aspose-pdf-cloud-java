package com.aspose.asposecloudpdf.examples.fields;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.FieldResponse;

public class GetFieldTestExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		String folder = "";
		String fieldName = "textField";
		FieldResponse response = pdfApi.getField(name, fieldName, null, folder);
		System.out.println(response.getCode());
	}

}
