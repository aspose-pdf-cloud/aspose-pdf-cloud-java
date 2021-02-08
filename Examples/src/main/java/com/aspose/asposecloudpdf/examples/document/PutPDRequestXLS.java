package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDRequestXLS {

	public static void main(String[] args) throws ApiException {
        String name = "4pages.pdf";
        File file = new File("testData" + "/" + name);
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String resFileName = "result.xls";
        AsposeResponse response =pdfApi.putPdfInRequestToXls(""+ '/' + resFileName, null, null, null, null, null , file);
	}
}
