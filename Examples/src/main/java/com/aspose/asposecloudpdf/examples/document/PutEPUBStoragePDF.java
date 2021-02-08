package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutEPUBStoragePDF {

	public static void main(String[] args) throws ApiException {
			
        String resultName = "fromEpub.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		
		String name = "4pages.epub";
		Common.uploadFile(pdfApi, name);
	
        AsposeResponse response = pdfApi.putEpubInStorageToPdf(resultName, name, null, "");
	}

}
