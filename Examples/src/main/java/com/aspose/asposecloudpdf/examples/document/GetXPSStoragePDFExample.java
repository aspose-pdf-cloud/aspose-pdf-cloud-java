package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetXPSStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "Simple.xps";
		Common.uploadFile(pdfApi, name);
		String srcPath = name;
		File response = pdfApi.getXpsInStorageToPdf(srcPath, null);

	}

}
