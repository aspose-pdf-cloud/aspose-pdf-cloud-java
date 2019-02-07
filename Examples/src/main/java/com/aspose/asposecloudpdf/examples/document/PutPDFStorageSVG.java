package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDFStorageSVG {

	public static void main(String[] args) throws ApiException {

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "4pages.pdf";
		Common.uploadFile(pdfApi, name);
		String resFileName = "result.svg";
		AsposeResponse response = pdfApi.putPdfInStorageToSvg(name, "" + '/' + resFileName, "", null);
	}

}
