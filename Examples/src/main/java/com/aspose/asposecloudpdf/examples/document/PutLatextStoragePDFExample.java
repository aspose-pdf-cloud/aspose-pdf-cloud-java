package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutLatextStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		String name = "TexExample.tex";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		String srcPath = name;
		String resultName = "fromTex.pdf";
		AsposeResponse response = pdfApi.putLaTeXInStorageToPdf(resultName, srcPath, "", null);
	}

}
