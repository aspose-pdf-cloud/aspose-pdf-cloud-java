package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class PutImageExtractAsJPEG {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";

        int pageNumber = 1;

		PdfApi pdfApi = new PdfApi("b125f13bf6b76ed81ee990142d841195", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		ImagesResponse imagesResponse =pdfApi.getImages(name, pageNumber, null, "");
        String imageId = imagesResponse.getImages().getList().get(0).getId();

        final String destFolder = "extract_jpg";

        AsposeResponse response = pdfApi.putImageExtractAsJpeg(name, imageId, null, null, null,
                "", destFolder);
        
		System.out.println(response.getCode());


	}

}
