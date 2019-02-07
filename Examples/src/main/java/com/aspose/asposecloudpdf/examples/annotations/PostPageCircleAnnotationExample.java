package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.CircleAnnotation;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.RectanglePdf;

public class PostPageCircleAnnotationExample {

	public static void main(String[] args) throws ApiException {
		int pageNumber = 1;
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);

		RectanglePdf rect = new RectanglePdf().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		CircleAnnotation annotation = new CircleAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");

		List<CircleAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageCircleAnnotations(name, pageNumber, annotations, null, "");
		System.out.println(response.getCode());

	}

}
