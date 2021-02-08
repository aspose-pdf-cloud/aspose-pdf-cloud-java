package com.aspose.asposecloudpdf.examples.document;

import java.io.File;
import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDFSVG {
	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "4pages.pdf";
		File file = new File("testData" + "/" + name);
		String resFileName = "result.svg";

		AsposeResponse response = pdfApi.putPdfInRequestToSvg("" + '/' + resFileName, null, file);
	}
}
