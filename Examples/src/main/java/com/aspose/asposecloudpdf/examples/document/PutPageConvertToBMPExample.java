package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPageConvertToBMPExample {

	public static void main(String[] args) throws ApiException {
		String name = "template.pcl";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		int pageNumber = 2;
		final String resultFile = "page.bmp";
		final String outPath = resultFile;
		AsposeResponse response = pdfApi.putPageConvertToBmp(name, pageNumber, outPath, null, null, "", null);
		System.out.println(response.getCode());
	}
}
