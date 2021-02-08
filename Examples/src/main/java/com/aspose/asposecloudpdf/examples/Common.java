package com.aspose.asposecloudpdf.examples;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;

public class Common {

	public static void uploadFile(PdfApi pdfApi, String name) throws ApiException {
		File file = new File("testData" + "/" + name);
		pdfApi.uploadFile(name, file, null);
	}
}
