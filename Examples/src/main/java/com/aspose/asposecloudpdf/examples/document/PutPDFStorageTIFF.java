package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDFStorageTIFF {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		String resFileName = "result.tiff";

		AsposeResponse response = pdfApi.putPdfInStorageToTiff(name, "" + '/' + resFileName, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, "", null);

	}

}
