package com.aspose.asposecloudpdf.examples.signs;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.DocMDPAccessPermissionType;
import com.aspose.asposecloudpdf.model.Rectangle;
import com.aspose.asposecloudpdf.model.Signature;
import com.aspose.asposecloudpdf.model.SignatureType;
import com.aspose.asposecloudpdf.model.SignatureVerifyResponse;

public class SignExamples {

    public void postSignDocumentExample() throws ApiException
    {
    	String name = "PdfWithScreenAnnotations.pdf";

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        Common.uploadFile(pdfApi, name);

        String signatureFileName = "Example1234.pfx";


        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);


        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("Example@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("Example1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = pdfApi.postSignDocument(name, signature, null, null);
        System.out.println(response.getStatus());
    }



    public void postSignPageExample() throws ApiException
    {


		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "BlankWithSignature.pdf";
        Common.uploadFile(pdfApi, name);


        String signatureFileName = "Example1234.pfx";


        int pageNumber = 1;

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);


        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("Example@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("Example1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response =pdfApi.postSignPage(name, pageNumber, signature, null, null);
        System.out.println(response.getStatus());
    }


    public void getVerifySignatureExample() throws ApiException
    {


		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "BlankWithSignature.pdf";

        String signatureFileName = "Example1234.pfx";


        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);


        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("Example@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("Example1234");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse responseSign = pdfApi.postSignDocument(name, signature, null, null);
        System.out.println(responseSign.getStatus());

        SignatureVerifyResponse response = pdfApi.getVerifySignature(name, signature.getFormFieldName(), null, null);
        System.out.println(response.getStatus());
    }


    public void postPageCertifyExample() throws ApiException
    {

		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";


        String signatureFileName = "33226.p12";


        int pageNumber = 1;
        DocMDPAccessPermissionType permissionType = DocMDPAccessPermissionType.NOCHANGES;

        Rectangle rectangle = new Rectangle()
                .LLX(100.)
                .LLY(100.)
                .URX(500.)
                .URY(200.);


        Signature signature = new Signature();
        signature.setAuthority("Sergey Smal");
        signature.setContact("Example@mail.ru");
        signature.setDate("08/01/2012 12:15:00.000 PM");
        signature.setFormFieldName("Signature1");
        signature.setLocation("Ukraine");
        signature.setPassword("sIikZSmz");
        signature.setRectangle(rectangle);
        signature.setSignaturePath(signatureFileName);
        signature.setSignatureType(SignatureType.PKCS7);
        signature.setVisible(true);

        AsposeResponse response = pdfApi.postPageCertify(name, pageNumber, signature, permissionType.toString(), null, null);
        System.out.println(response.getStatus());
       
    }

}