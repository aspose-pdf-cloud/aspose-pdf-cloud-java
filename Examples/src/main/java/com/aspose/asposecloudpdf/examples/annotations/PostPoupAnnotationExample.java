package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.PopupAnnotation;
import com.aspose.asposecloudpdf.model.RectanglePdf;

public class PostPoupAnnotationExample {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		 String parentId = "GI5TCMR3GE2TQLBSGM3CYMJYGUWDENRV";

	        RectanglePdf rect = new RectanglePdf()
	                .LLX(100.)
	                .LLY(100.)
	                .URX(200.)
	                .URY(200.);

	        List<AnnotationFlags> flags = new ArrayList<>();
	        flags.add(AnnotationFlags.DEFAULT);

	        PopupAnnotation annotation = new PopupAnnotation();
	        annotation.setName("Name");
	        annotation.setRect(rect);
	        annotation.setFlags(flags);
	        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
	        annotation.setZindex(1);
	        annotation.setModified("02/02/2018 00:00:00.000 AM");


	        AsposeResponse response = pdfApi.postPopupAnnotation(name, parentId, annotation, null, "");
			System.out.println(response.getCode());

	}
}
