package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Point;
import com.aspose.asposecloudpdf.model.PolygonAnnotation;
import com.aspose.asposecloudpdf.model.PolygonAnnotationsResponse;
import com.aspose.asposecloudpdf.model.Rectangle;

public class PutPolygoAnnotationExample {

	public static void main(String[] args) throws ApiException {

		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9");
		Common.uploadFile(pdfApi, name);
		int pageNumber = 1;
		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		ArrayList<Point> vertices = new ArrayList();
		vertices.add(new Point().X(10.).Y(10.));
		vertices.add(new Point().X(20.).Y(10.));
		vertices.add(new Point().X(10.).Y(20.));
		vertices.add(new Point().X(10.).Y(10.));

		ArrayList<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		PolygonAnnotation annotation = new PolygonAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setVertices(vertices);

		PolygonAnnotationsResponse responseAnnotations = pdfApi.getDocumentPolygonAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putPolygonAnnotation(name, annotationId, annotation, null, "");
		System.out.println(response.getCode());

	}

}
