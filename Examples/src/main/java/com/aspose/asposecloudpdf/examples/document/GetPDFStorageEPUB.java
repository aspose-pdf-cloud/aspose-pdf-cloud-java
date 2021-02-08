package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;

public class GetPDFStorageEPUB {

	public static void main(String[] args) throws ApiException {

		String name = "4pages.pdf";
		File file = new File("testData" + "/" + name);
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		File response = pdfApi.getPdfInStorageToEpub(name, null, "", null);

	}

}
