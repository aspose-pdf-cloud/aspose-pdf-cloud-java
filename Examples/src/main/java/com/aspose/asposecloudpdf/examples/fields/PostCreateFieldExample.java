package com.aspose.asposecloudpdf.examples.fields;

import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.Field;
import com.aspose.asposecloudpdf.model.FieldType;
import com.aspose.asposecloudpdf.model.Rectangle;

public class PostCreateFieldExample {

	public static void main(String[] args) throws ApiException {

		String name = "PdfWithAcroForm.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		Rectangle rect = new Rectangle().LLX(50.).LLY(200.).URX(200.).URY(400.);

		Field field = new Field();
		field.setName("checkboxfield");
		field.setValues(new ArrayList<String>() {
			{
				add("1");
			}
		});
		field.setType(FieldType.BOOLEAN);
		field.setRect(rect);

		int pageNumber = 1;
		String folder = "";

		AsposeResponse response = pdfApi.postCreateField(name, pageNumber, field, null, folder);
		System.out.println(response.getCode());

	}

}
