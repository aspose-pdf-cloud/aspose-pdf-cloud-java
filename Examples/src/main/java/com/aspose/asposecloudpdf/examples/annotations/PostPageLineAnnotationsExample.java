package com.aspose.asposecloudpdf.examples.annotations;


import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.*;

public class PostPageLineAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		 int pageNumber = 1;

	        Rectangle rect = new Rectangle()
	                .LLX(100.)
	                .LLY(100.)
	                .URX(200.)
	                .URY(200.);

	        List<AnnotationFlags> flags = new ArrayList<AnnotationFlags>();
	        flags.add(AnnotationFlags.DEFAULT);

	        LineAnnotation annotation = new LineAnnotation();
	        annotation.setName("Name");
	        annotation.rect(rect);
	        annotation.setFlags(flags);
	        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
	        annotation.setRichText("Rich Text");
	        annotation.setSubject("Subj");
	        annotation.setZindex(1);
	        annotation.setTitle("Title");
	        annotation.setStarting(new Point().X(10.).Y(10.));
	        annotation.setEnding(new Point().X(100.).Y(100.));

	        List<LineAnnotation> annotations = new ArrayList<LineAnnotation>();
	        annotations.add(annotation);

	        AsposeResponse response = pdfApi.postPageLineAnnotations(name, pageNumber, annotations, null, "");
			System.out.println(response.getCode());

	}

}
