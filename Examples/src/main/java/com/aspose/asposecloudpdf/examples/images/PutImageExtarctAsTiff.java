package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class PutImageExtarctAsTiff {

	public static void main(String[] args) throws ApiException {

		String name = "PdfWithImages2.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		ImagesResponse imagesResponse = pdfApi.getImages(name, 1, null, "");
		String imageId = imagesResponse.getImages().getList().get(0).getId();
		final String destFolder = "extract_tiff";
		AsposeResponse response = pdfApi.putImageExtractAsTiff(name, imageId, null, null, null, "", destFolder);

	}
}
