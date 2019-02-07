package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPSStoragePDFExample {

	public static void main(String[] args) throws ApiException {

        String name = "Typography.PS";
        PdfApi pdfApi = new PdfApi("b125f13bf6b76ed81ee990142d841195", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

        String srcPath = name;
        String resultName = "fromPs.pdf";
        AsposeResponse response = pdfApi.putPsInStorageToPdf(resultName, srcPath,"", null);

	}
}
