package com.aspose.asposecloudpdf.examples.images;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class GetImageExtarctAsTiffExample {

	public static void main(String[] args) throws ApiException {
		int pageNumber = 1;

		String name = "PdfWithImages2.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
        ImagesResponse imagesResponse = pdfApi.getImages(name, pageNumber, null, "");
        String imageId = imagesResponse.getImages().getList().get(0).getId();


        File response = pdfApi.getImageExtractAsTiff(name, imageId, null, null, null,
               "");
        
        

	}

}
