package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.CaretAnnotation;
import com.aspose.asposecloudpdf.model.CaretAnnotationsResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Rectangle;

public class PutCarretAnnotation {

	public static void main(String[] args) throws ApiException {
		
		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);


        CaretAnnotation annotation = new CaretAnnotation();
        annotation.setName("Name Updated");
        annotation.rect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text Updated");
        annotation.setSubject("Subj Updated");
        annotation.setZindex(1);
        annotation.setTitle("Title Updated");
        annotation.setFrame(rect);
        annotation.setModified("02/02/2018 00:00:00.000 AM");

        CaretAnnotationsResponse responseAnnotations = pdfApi.getDocumentCaretAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = pdfApi.putCaretAnnotation(name, annotationId, annotation, null, "");
		System.out.println(response.getCode());


	}

}
