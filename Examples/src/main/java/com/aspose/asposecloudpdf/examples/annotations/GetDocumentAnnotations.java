package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationsInfoResponse;

public class GetDocumentAnnotations {

	public static void main(String[] argv) throws ApiException {
		
		PdfApi pdfApi=new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "PdfWithAnnotations.pdf";
        Common.uploadFile(pdfApi,name);
        AnnotationsInfoResponse response = pdfApi.getDocumentAnnotations(name, null, "");
        System.out.println(response.getCode());
	}
}
