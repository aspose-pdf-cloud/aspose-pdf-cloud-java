package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetPDFStorageSVG {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "4pages.pdf";
		Common.uploadFile(pdfApi, name);
		File response =pdfApi.getPdfInStorageToSvg(name, null, "", null);
		
		
		
	}

}
