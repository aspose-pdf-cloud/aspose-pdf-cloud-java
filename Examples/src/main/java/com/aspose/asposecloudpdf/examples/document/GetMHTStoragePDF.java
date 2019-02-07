package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetMHTStoragePDF {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		String name = "MhtExample.mht";
		Common.uploadFile(pdfApi, name);
        String srcPath = name;
        File response =pdfApi.getMhtInStorageToPdf(srcPath, null);
	}
}
