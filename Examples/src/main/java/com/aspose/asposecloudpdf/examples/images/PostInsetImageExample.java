package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PostInsetImageExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";
		String imageFileName = "Koala.jpg";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		int pageNumber = 1;
		String folder = "";
		String imageFile = folder + '/' + imageFileName;

		double llx = 10;
		double lly = 10;
		double urx = 100;
		double ury = 100;

		AsposeResponse response = pdfApi.postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFile, null, folder,
				null);
		System.out.println(response.getCode());

	}

}
