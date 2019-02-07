package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetPSStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		String name = "Typography.PS";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		String srcPath = name;
		File response = pdfApi.getPsInStorageToPdf(srcPath, null);

	}

}
