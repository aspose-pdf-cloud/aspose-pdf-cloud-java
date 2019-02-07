package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutHTMLStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "HtmlWithImage.zip";
		Common.uploadFile(pdfApi, name);

		String htmlFileName = "HtmlWithImage.html";
		double height = 650;
		double width = 250;
		String resultName = "fromHtml.pdf";
		String srcPath = name;

		AsposeResponse response = pdfApi.putHtmlInStorageToPdf(name, srcPath, htmlFileName, height, width, null,
				null, null, null, null, null, null);

	}

}
