package com.aspose.asposecloudpdf.examples.document;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.FileAttachmentAnnotation;
import com.aspose.asposecloudpdf.model.FileAttachmentAnnotationsResponse;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Rectangle;

public class PutFileAttachmentAnnotationExample {

	public static void main(String[] args) throws ApiException {
		  PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		String name = "PdfWithAnnotations.pdf";
		Common.uploadFile(pdfApi,name);

        String attachmentFile = "4pages.pdf";
        Common.uploadFile(pdfApi,attachmentFile);

        Rectangle rect = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(200.)
                .URY(200.);

        List<AnnotationFlags> flags = new ArrayList<>();
        flags.add(AnnotationFlags.DEFAULT);

        FileAttachmentAnnotation annotation = new FileAttachmentAnnotation();
        annotation.setName("Name");
        annotation.setRect(rect);
        annotation.setFlags(flags);
        annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
        annotation.setRichText("Rich Text");
        annotation.setSubject("Subj");
        annotation.setZindex(1);
        annotation.setTitle("Title");
        annotation.setModified("01/01/2018 12:00:00.000 AM");
        annotation.setFilePath("" + '/' + attachmentFile);
        annotation.setFileName(attachmentFile);

        FileAttachmentAnnotationsResponse responseAnnotations = pdfApi.getDocumentFileAttachmentAnnotations(name, null, "");
        String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

        AsposeResponse response = pdfApi.putFileAttachmentAnnotation(name, annotationId, annotation, null, "");
        System.out.println(response);

	}

}
