package com.aspose.asposecloudpdf.examples.document;

import java.util.ArrayList;
import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.ImageSrcType;
import com.aspose.asposecloudpdf.model.ImageTemplate;
import com.aspose.asposecloudpdf.model.ImageTemplatesRequest;

public class PutImageStoragePDFExample {

	public static void main(String[] args) throws ApiException {

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		final String dataFile1 = "33539.jpg";
		Common.uploadFile(pdfApi, dataFile1);

		final String dataFile2 = "44781.jpg";
		Common.uploadFile(pdfApi, dataFile2);

		String resultName = "result.pdf";

		ImageTemplatesRequest imageTemplatesRequest = new ImageTemplatesRequest().isOCR(true).ocRLangs("eng")
				.imagesList(new ArrayList<ImageTemplate>() {
					{
						add(new ImageTemplate().imagePath(dataFile1).imageSrcType(ImageSrcType.COMMON));
						add(new ImageTemplate().imagePath(dataFile2).imageSrcType(ImageSrcType.COMMON));
					}
				});

		AsposeResponse response = pdfApi.putImageInStorageToPdf(resultName, imageTemplatesRequest, "", null);
	}

}
