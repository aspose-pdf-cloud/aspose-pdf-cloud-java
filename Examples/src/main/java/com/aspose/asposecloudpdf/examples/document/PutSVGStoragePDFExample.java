package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutSVGStoragePDFExample {

	public static void main(String[] args) throws ApiException {
		String name = "Simple.svg";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		String srcPath = name;
		String resultName = "fromSvg.pdf";

		AsposeResponse response = pdfApi.putSvgInStorageToPdf(resultName, srcPath, null, null, null, null, null, null,
				null, null, "", null);

	}

}
