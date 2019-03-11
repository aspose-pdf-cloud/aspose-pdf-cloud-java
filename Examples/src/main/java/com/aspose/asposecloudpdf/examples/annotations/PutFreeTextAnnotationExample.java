package com.aspose.asposecloudpdf.examples.annotations;

import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AnnotationFlags;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.Color;
import com.aspose.asposecloudpdf.model.FreeTextAnnotation;
import com.aspose.asposecloudpdf.model.FreeTextAnnotationsResponse;
import com.aspose.asposecloudpdf.model.FreeTextIntent;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Justification;
import com.aspose.asposecloudpdf.model.Rectangle;
import com.aspose.asposecloudpdf.model.TextStyle;

public class PutFreeTextAnnotationExample {

	public static void main(String[] args) throws ApiException {

		String name = "PdfWithAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);

		Color foregroundColor = new Color();
		foregroundColor.setA(0x00);
		foregroundColor.setR(0x00);
		foregroundColor.setG(0xFF);
		foregroundColor.setB(0x00);

		Color backgroundColor = new Color();
		backgroundColor.setA(0x00);
		backgroundColor.setR(0xFF);
		backgroundColor.setG(0x00);
		backgroundColor.setB(0x00);

		TextStyle textStyle = new TextStyle();
		textStyle.setFont("Arial");
		textStyle.setFontSize(12.);
		textStyle.setForegroundColor(foregroundColor);
		textStyle.setBackgroundColor(backgroundColor);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		FreeTextAnnotation freeTextAnnotation = new FreeTextAnnotation();
		freeTextAnnotation.setName("Test Free Text");
		freeTextAnnotation.setTextStyle(textStyle);
		freeTextAnnotation.rect(rect);
		freeTextAnnotation.setFlags(flags);
		freeTextAnnotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		freeTextAnnotation.setIntent(FreeTextIntent.FREETEXTTYPEWRITER);
		freeTextAnnotation.setRichText("Rich Text");
		freeTextAnnotation.setSubject("Text Box Subj");
		freeTextAnnotation.setZindex(1);
		freeTextAnnotation.setJustification(Justification.CENTER);
		freeTextAnnotation.setTitle("Title");

		FreeTextAnnotationsResponse responseAnnotations = pdfApi.getDocumentFreeTextAnnotations(name, null, "");
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putFreeTextAnnotation(name, annotationId, freeTextAnnotation, null,
				"");
		System.out.println(response.getCode());

	}

}
