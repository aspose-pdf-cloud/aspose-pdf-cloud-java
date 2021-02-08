package com.aspose.asposecloudpdf.examples.fields;

import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.Field;
import com.aspose.asposecloudpdf.model.FieldResponse;
import com.aspose.asposecloudpdf.model.FieldType;

public class PutUpdateFieldExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		String fieldName = "textField";

		Field field = new Field();
		field.setName(fieldName);
		field.setValues(new ArrayList<String>() {
			{
				add("Text field updated value.");
			}
		});
		field.setType(FieldType.TEXT);

		String folder = "";

		FieldResponse response = pdfApi.putUpdateField(name, fieldName, field, null, folder);
		System.out.println(response.getCode());

	}

}
