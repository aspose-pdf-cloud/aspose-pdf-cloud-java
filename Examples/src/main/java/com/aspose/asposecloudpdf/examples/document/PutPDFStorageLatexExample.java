package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDFStorageLatexExample {

	public static void main(String[] args) throws ApiException {
		String resFileName = "result.latex";
		String name = "4pages.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		AsposeResponse response = pdfApi.putPdfInStorageToLaTeX(name, "" + '/' + resFileName, null, "", null);

	}

}
