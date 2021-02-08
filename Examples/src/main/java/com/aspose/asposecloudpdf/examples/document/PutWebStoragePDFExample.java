package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutWebStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		String sourceUrl = "http://google.com";
        String resultName = "fromWeb.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

        AsposeResponse response = pdfApi.putWebInStorageToPdf(resultName, sourceUrl, null,
                null, null, null, null, null,
                null, "", null);
	}

}
