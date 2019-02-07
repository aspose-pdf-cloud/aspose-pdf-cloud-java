package com.aspose.asposecloudpdf.examples.annotations;

import java.awt.List;
import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.LineAnnotation;
import com.aspose.asposecloudpdf.model.LineAnnotationsResponse;
import com.aspose.asposecloudpdf.model.Point;
import com.aspose.asposecloudpdf.model.RectanglePdf;

public class PutLineAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		RectanglePdf rect = new RectanglePdf().LLX(100.).LLY(100.).URX(200.).URY(200.);

		ArrayList<AnnotationFlags> flags = new ArrayList<AnnotationFlags>();
		flags.add(AnnotationFlags.DEFAULT);

		LineAnnotation annotation = new LineAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setStarting(new Point().X(10.).Y(10.));
		annotation.setEnding(new Point().X(100.).Y(100.));

		LineAnnotationsResponse responseAnnotations = pdfApi.getDocumentLineAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putLineAnnotation(name, annotationId, annotation, null, "");
		System.out.println(response.getCode());


	}

}
