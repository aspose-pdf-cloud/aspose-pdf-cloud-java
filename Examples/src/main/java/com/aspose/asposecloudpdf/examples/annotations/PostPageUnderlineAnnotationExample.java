package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Point;
import com.aspose.asposecloudpdf.model.Rectangle;
import com.aspose.asposecloudpdf.model.UnderlineAnnotation;

public class PostPageUnderlineAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);
        int pageNumber = 1;

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		List<Point> points = new ArrayList<>();
		points.add(new Point().X(10.).Y(10.));
		points.add(new Point().X(20.).Y(10.));
		points.add(new Point().X(10.).Y(20.));
		points.add(new Point().X(10.).Y(10.));

		UnderlineAnnotation annotation = new UnderlineAnnotation();
		annotation.setName("Name");
		annotation.rect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setQuadPoints(points);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		List<UnderlineAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageUnderlineAnnotations(name, pageNumber, annotations, null, "");
		System.out.println(response.getCode());

	}

}
