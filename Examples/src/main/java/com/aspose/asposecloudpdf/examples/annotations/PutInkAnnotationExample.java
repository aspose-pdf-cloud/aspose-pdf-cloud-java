package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.CapStyle;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.InkAnnotation;
import com.aspose.asposecloudpdf.model.InkAnnotationsResponse;
import com.aspose.asposecloudpdf.model.Point;
import com.aspose.asposecloudpdf.model.Rectangle;

public class PutInkAnnotationExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<List<Point>> inkList = new ArrayList<>();

		List<Point> inks1 = new ArrayList<>();
		inks1.add(new Point().X(10.).Y(40.));
		inks1.add(new Point().X(30.).Y(40.));

		List<Point> inks2 = new ArrayList<>();
		inks2.add(new Point().X(10.).Y(20.));
		inks2.add(new Point().X(20.).Y(20.));
		inks2.add(new Point().X(30.).Y(20.));

		inkList.add(inks1);
		inkList.add(inks2);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		InkAnnotation annotation = new InkAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setInkList(inkList);
		annotation.setCapStyle(CapStyle.ROUNDED);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		InkAnnotationsResponse responseAnnotations = pdfApi.getDocumentInkAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putInkAnnotation(name, annotationId, annotation, null, "");
		System.out.println(response.getCode());

	}

}
