package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.PdfAType;

public class GetPDFStoragePDFA {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";
		
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

        String type = PdfAType.PDFA1A.toString();
        String folder = "";


        File response =pdfApi.getPdfInStorageToPdfA(name, type, folder, null);

	}

}
