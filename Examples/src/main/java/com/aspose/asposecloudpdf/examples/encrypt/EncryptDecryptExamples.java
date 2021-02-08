package com.aspose.asposecloudpdf.examples.encrypt;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.CryptoAlgorithm;

public class EncryptDecryptExamples {


    public void putEncryptDocumentExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);

        String outPath = name;
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        String ownerPasswordBase64encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&

        AsposeResponse response  =pdfApi.putEncryptDocument(outPath, userPasswordBase64encoded, ownerPasswordBase64encoded,
                CryptoAlgorithm.AESX128.getValue(), null, null, null, file);
        System.out.println(response);
    }


    public void postEncryptDocumentInStorageExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&
        String ownerPasswordBase64encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&

        AsposeResponse response  = pdfApi.postEncryptDocumentInStorage(name, userPasswordBase64encoded, ownerPasswordBase64encoded,
                CryptoAlgorithm.AESX128.getValue(), null, null, null, null);
        System.out.println(response);
    }

    public void putDecryptDocumentExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pagesEncrypted.pdf";
        File file = new File( name);

        String outPath =  name;
        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&

        AsposeResponse response  = pdfApi.putDecryptDocument(outPath, userPasswordBase64encoded, null, file);
        System.out.println(response);
    }

    public void posttDencryptDocumentInStorageExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pagesEncrypted.pdf";
        Common.uploadFile(pdfApi,name);

        String userPasswordBase64encoded = "dXNlciAkXlBhc3N3b3JkISY="; //user $^Password!&

        AsposeResponse response  = pdfApi.postDecryptDocumentInStorage(name, userPasswordBase64encoded, null,null);
        System.out.println(response);
    }


    public void putChangePasswordDocumentExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pagesEncrypted.pdf";
        File file = new File(name);

        String outPath =  name;
        String ownerPasswordBase64Encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&
        String newUserPasswordBase64Encoded = "dXNlciBuZXcvLz8gJDEyXlBhc3N3b3JkISY="; //user new\//? $12^Password!&
        String newOwnerPasswordBase64Encoded = "b3duZXIgbmV3Ly8/ICQxMl5QYXNzd29yZCEm"; //owner new\//? $12^Password!&

        AsposeResponse response  = pdfApi.putChangePasswordDocument(outPath, ownerPasswordBase64Encoded,
                newUserPasswordBase64Encoded, newOwnerPasswordBase64Encoded, null, file);
        System.out.println(response);
    }


    public void postChangePasswordDocumentInStorageExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pagesEncrypted.pdf";
        Common.uploadFile(pdfApi,name);

        String ownerPasswordBase64Encoded = "b3duZXJcLy8/ICQxMl5QYXNzd29yZCEm"; //owner\//? $12^Password!&
        String newUserPasswordBase64Encoded = "dXNlciBuZXcvLz8gJDEyXlBhc3N3b3JkISY="; //user new\//? $12^Password!&
        String newOwnerPasswordBase64Encoded = "b3duZXIgbmV3Ly8/ICQxMl5QYXNzd29yZCEm"; //owner new\//? $12^Password!&

        AsposeResponse response  = pdfApi.postChangePasswordDocumentInStorage(name, ownerPasswordBase64Encoded,
                newUserPasswordBase64Encoded, newOwnerPasswordBase64Encoded, null, null);
        System.out.println(response);
    }
}