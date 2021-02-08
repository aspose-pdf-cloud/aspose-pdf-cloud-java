package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutXSLFOStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		String name = "XslfoExample.xslfo";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		String srcPath = name;
		String resultName = "fromXlsFo.pdf";

		AsposeResponse response = pdfApi.putXslFoInStorageToPdf(resultName, srcPath, "", null);

	}

}
