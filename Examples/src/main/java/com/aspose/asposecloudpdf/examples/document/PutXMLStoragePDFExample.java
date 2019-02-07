package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutXMLStoragePDFExample {
	public static void main(String[] args) throws ApiException {
		String name = "template.xml";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		String srcPath = name;
        String resultName = "fromXml.pdf";

        AsposeResponse response = pdfApi.putXmlInStorageToPdf(resultName, srcPath, null, "", null);
	}
}
