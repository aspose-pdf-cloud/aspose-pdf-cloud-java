package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.RectanglePdf;
import com.aspose.asposecloudpdf.model.SquareAnnotation;

public class PostSquareAnnotationsExample {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		Common.uploadFile(pdfApi, name);
		int pageNumber = 1;

        RectanglePdf rect = new RectanglePdf()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        ArrayList<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        SquareAnnotation annotation = new SquareAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");

        List<SquareAnnotation> annotations = new ArrayList<>();
        annotations.add(annotation);

        AsposeResponse response = pdfApi.postPageSquareAnnotations(name, pageNumber, annotations, null, "");
		System.out.println(response.getCode());
        

	}

}
