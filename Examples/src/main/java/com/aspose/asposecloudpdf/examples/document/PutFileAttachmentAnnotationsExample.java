package com.aspose.asposecloudpdf.examples.document;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.FileAttachmentAnnotationsResponse;

public class PutFileAttachmentAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "PdfWithAnnotations.pdf";
		Common.uploadFile(pdfApi,name);

        FileAttachmentAnnotationsResponse responseAnnotations = pdfApi.getDocumentFileAttachmentAnnotations(name, null, "");

        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = pdfApi.putFileAttachmentAnnotationDataExtract(name, annotationId,  null, null, "");
        System.out.println(response);

	}

}
