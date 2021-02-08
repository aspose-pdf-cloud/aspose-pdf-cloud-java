package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetXMLStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		String name = "template.xml";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		String srcPath = name;
		File response = pdfApi.getXmlInStorageToPdf(srcPath, null, null);
	}
}
