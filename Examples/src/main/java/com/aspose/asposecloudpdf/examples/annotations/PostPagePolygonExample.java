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
import com.aspose.asposecloudpdf.model.PolygonAnnotation;
import com.aspose.asposecloudpdf.model.RectanglePdf;

public class PostPagePolygonExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		int pageNumber = 1;

		Common.uploadFile(pdfApi, name);
		RectanglePdf rect = new RectanglePdf().LLX(100.).LLY(100.).URX(200.).URY(200.);

		ArrayList<Point> vertices = new ArrayList();
		vertices.add(new Point().X(10.).Y(10.));
		vertices.add(new Point().X(20.).Y(10.));
		vertices.add(new Point().X(10.).Y(20.));
		vertices.add(new Point().X(10.).Y(10.));

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		PolygonAnnotation annotation = new PolygonAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setVertices(vertices);

		List<PolygonAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPagePolygonAnnotations(name, pageNumber, annotations, null, "");
		System.out.println(response.getCode());

	}

}
