package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetHTMLStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9");

		String name = "HtmlWithImage.zip";
		Common.uploadFile(pdfApi, name);

		String htmlFileName = "HtmlWithImage.html";
		double height = 650;
		double width = 250;
		String srcPath = name;

		File response = pdfApi.getHtmlInStorageToPdf(srcPath, htmlFileName, height, width, null, null, null, null, null,
				null);

	}

}
