package com.aspose.asposecloudpdf.examples.fields;

import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.Field;
import com.aspose.asposecloudpdf.model.FieldType;
import com.aspose.asposecloudpdf.model.Fields;

public class PutUpdateFieldsExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAcroForm.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		Field field = new Field();
		field.setName("textField");
		field.setValues(new ArrayList<String>() {
			{
				add("1");
			}
		});
		field.setType(FieldType.TEXT);

		ArrayList<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(field);

		Fields fields = new Fields().list(fieldsList);

		String folder = "";

		AsposeResponse response = pdfApi.putUpdateFields(name, fields, null, folder);

		System.out.println(response.getCode());

	}

}
