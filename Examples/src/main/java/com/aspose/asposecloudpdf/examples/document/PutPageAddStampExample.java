package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.Stamp;
import com.aspose.asposecloudpdf.model.StampType;

public class PutPageAddStampExample {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXX", "XXXXXXXXXX");
		Common.uploadFile(pdfApi, name);

		String stampFileName = "Penguins.jpg";
		Common.uploadFile(pdfApi, stampFileName);

		int pageNumber = 1;
		String folder = "";

		Stamp stamp = new Stamp();
		stamp.setType(StampType.IMAGE);
		stamp.setFileName(folder + '/' + stampFileName);
		stamp.setBackground(true);
		stamp.setWidth(200.);
		stamp.setHeight(200.);
		stamp.setXindent(100.);
		stamp.setYindent(100.);

		AsposeResponse response = pdfApi.putPageAddStamp(name, pageNumber, stamp, null, folder);
		System.out.println(response.getCode());

	}

}
