package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.ImageResponse;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class PutReplaceImageExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";
		String imageFileName = "Koala.jpg";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		int pageNumber = 1;
		String folder = "";
		String imageFile = folder + '/' + imageFileName;

		ImagesResponse imagesResponse = pdfApi.getImages(name, pageNumber, null, folder);
		String imageId = imagesResponse.getImages().getList().get(0).getId();

		ImageResponse response = pdfApi.putReplaceImage(name, imageId, imageFile, null, folder, null);
		System.out.println(response.getCode());


	}

}
