package com.aspose.asposecloudpdf.examples.document;

import java.io.File;
import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;

public class GetSVGStorgePDFExample {

	public static void main(String[] args) throws ApiException {

        String name = "Simple.svg";
        PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9");
		Common.uploadFile(pdfApi, name);
        String srcPath =  name;
        File response =pdfApi.getSvgInStorageToPdf(srcPath, null, null, null,
                null, null, null, null, null, null);
	}
}
