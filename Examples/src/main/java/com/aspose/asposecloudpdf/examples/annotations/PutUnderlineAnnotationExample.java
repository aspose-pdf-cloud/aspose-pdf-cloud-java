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
import com.aspose.asposecloudpdf.model.RectanglePdf;
import com.aspose.asposecloudpdf.model.UnderlineAnnotation;
import com.aspose.asposecloudpdf.model.UnderlineAnnotationsResponse;

public class PutUnderlineAnnotationExample {

	public static void main(String[] args) throws ApiException {
		
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

        UnderlineAnnotation annotation = new UnderlineAnnotation();
        annotation.setName("Name Updated");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text Updated");
        annotation.setSubject("Subj Updated");
        annotation.setZindex(1);
        annotation.setTitle("Title Updated");
        annotation.setQuadPoints(points);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        UnderlineAnnotationsResponse responseAnnotations = pdfApi.getDocumentUnderlineAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = pdfApi.putUnderlineAnnotation(name, annotationId, annotation, null, "");
		System.out.println(response.getCode());


	}

}
