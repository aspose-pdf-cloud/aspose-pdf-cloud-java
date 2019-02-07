package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AnnotationState;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.RectanglePdf;
import com.aspose.asposecloudpdf.model.TextAnnotation;
import com.aspose.asposecloudpdf.model.TextAnnotationsResponse;

public class PutTextAnnotationExample {

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

        TextAnnotation textAnnotation = new TextAnnotation();
        textAnnotation.setName("Test Free Text");
        textAnnotation.setRect(rect);
        textAnnotation.setFlags(flags);
        textAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        textAnnotation.setRichText("Rich Text");
        textAnnotation.setSubject("Text Box Subj");
        textAnnotation.setZindex(1);
        textAnnotation.setState(AnnotationState.UNDEFINED);

        TextAnnotationsResponse responseAnnotations = pdfApi.getDocumentTextAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = pdfApi.putTextAnnotation(name, annotationId, textAnnotation, null, "");
		System.out.println(response.getCode());


	}

}
