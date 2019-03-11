package com.aspose.asposecloudpdf.examples.document;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Rectangle;
import com.aspose.asposecloudpdf.model.StampAnnotation;

public class PostPageStampAnnotationExamples {

	public static void main(String[] args) throws ApiException {
		   String name = "PdfWithAnnotations.pdf";
		   PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
	        Common.uploadFile(pdfApi,name);

	        String attachmentFile = "4pages.pdf";
	        Common.uploadFile(pdfApi,attachmentFile);

	        int pageNumber = 1;

	        Rectangle rect = new Rectangle()
	                .LLX(100.)
	                .LLY(100.)
	                .URX(200.)
	                .URY(200.);

	        List<AnnotationFlags> flags = new ArrayList<>();
	        flags.add(AnnotationFlags.DEFAULT);

	        StampAnnotation annotation = new StampAnnotation();
	        annotation.setName("Name");
	        annotation.setRect(rect);
	        annotation.setFlags(flags);
	        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
	        annotation.setRichText("Rich Text");
	        annotation.setSubject("Subj");
	        annotation.setZindex(1);
	        annotation.setTitle("Title");
	        annotation.setModified("01/01/2018 12:00:00.000 AM");
	        annotation.setFilePath("" + '/' + attachmentFile);

	        List<StampAnnotation> annotations = new ArrayList<>();
	        annotations.add(annotation);

	        AsposeResponse response = pdfApi.postPageStampAnnotations(name, pageNumber, annotations, null, "");
	        System.out.println(response);

	}

}
