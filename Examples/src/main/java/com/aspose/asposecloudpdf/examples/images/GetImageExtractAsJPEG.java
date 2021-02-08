package com.aspose.asposecloudpdf.examples.images;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class GetImageExtractAsJPEG {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";

		int pageNumber = 1;

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		ImagesResponse imagesResponse = pdfApi.getImages(name, pageNumber, null, "");
		String imageId = imagesResponse.getImages().getList().get(0).getId();

		File response = pdfApi.getImageExtractAsJpeg(name, imageId, null, null, null,"");
	}

}
