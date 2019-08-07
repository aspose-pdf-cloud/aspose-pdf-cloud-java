package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetEPUBStoragePDF {

	public static void main(String[] args) throws ApiException {
        String name = "4pages.epub";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
        File response = pdfApi.getEpubInStorageToPdf(name, null);


	}

}