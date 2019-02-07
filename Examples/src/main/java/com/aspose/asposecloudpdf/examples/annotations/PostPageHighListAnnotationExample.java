package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HighlightAnnotation;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Point;
import com.aspose.asposecloudpdf.model.RectanglePdf;

public class PostPageHighListAnnotationExample {

	public static void main(String[] args) throws ApiException {
		  int pageNumber = 1;
		  String name = "PdfWithAnnotations.pdf";

			PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
			Common.uploadFile(pdfApi, name);
	        RectanglePdf rect = new RectanglePdf()
	                .LLX(100.)
	                .LLY(100.)
	                .URX(200.)
	                .URY(200.);

	        List<AnnotationFlags> flags = new ArrayList<>();
	        flags.add(AnnotationFlags.DEFAULT);

	        List<Point> points = new ArrayList<>();
	        points.add(new Point().X(10.).Y(10.));
	        points.add(new Point().X(20.).Y(10.));
	        points.add(new Point().X(10.).Y(20.));
	        points.add(new Point().X(10.).Y(10.));

	        HighlightAnnotation annotation = new HighlightAnnotation();
	        annotation.setName("Name");
	        annotation.setRect(rect);
	        annotation.setFlags(flags);
	        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
	        annotation.setRichText("Rich Text");
	        annotation.setSubject("Subj");
	        annotation.setZindex(1);
	        annotation.setTitle("Title");
	        annotation.setQuadPoints(points);
	        annotation.setModified("02/02/2018 00:00:00.000 AM");

	        List<HighlightAnnotation> annotations = new ArrayList<>();
	        annotations.add(annotation);

	        AsposeResponse response = pdfApi.postPageHighlightAnnotations(name, pageNumber, annotations, null, "");
			System.out.println(response.getCode());

	}

}
