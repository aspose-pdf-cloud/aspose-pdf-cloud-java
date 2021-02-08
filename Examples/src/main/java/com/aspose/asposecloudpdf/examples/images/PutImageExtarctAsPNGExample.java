package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class PutImageExtarctAsPNGExample {

	public static void main(String[] args) throws ApiException {
		int pageNumber = 1;
		String name = "PdfWithImages2.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		ImagesResponse imagesResponse = pdfApi.getImages(name, pageNumber, null, "");
		String imageId = imagesResponse.getImages().getList().get(0).getId();

		final String destFolder = "extract_png";
		AsposeResponse response = pdfApi.putImageExtractAsPng(name, imageId, null, null, null, "", destFolder);
		System.out.println(response.getCode());
	}
}
