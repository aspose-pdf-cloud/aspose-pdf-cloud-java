package com.aspose.asposecloudpdf.examples.convert;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.PdfAType;

public class ConvertExamples {

    public void getPdfInStorageToDocExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);
        String folder = null;

        File response =pdfApi.getPdfInStorageToDoc(name, null, null, null, null, null, null, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToDocExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);
        String folder = null;
        String resFileName = "result.doc";

        AsposeResponse response = pdfApi.putPdfInStorageToDoc(name, resFileName, null, null, null, null, null, null, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToDocExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.doc";

        AsposeResponse response = pdfApi.putPdfInRequestToDoc(resFileName, null, null, null, null, null, null, null, null, null, file);
        System.out.println(response);
    }

    public void getPdfInStorageToPdfAExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String type = PdfAType.PDFA1A.toString();
        String folder = null;


        File response = pdfApi.getPdfInStorageToPdfA(name, type, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToPdfAExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String type = PdfAType.PDFA1A.toString();
        String folder = null;
        String resFileName = "result.pdf";

        AsposeResponse response = pdfApi.putPdfInStorageToPdfA(name, resFileName, type, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToPdfAExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File(name);
        String type = PdfAType.PDFA1A.toString();
        String resFileName = "result.pdf";

        AsposeResponse response = pdfApi.putPdfInRequestToPdfA(resFileName, type, null, file);
        System.out.println(response);
    }


    public void getPdfInStorageToTiffExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToTiff(name, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        System.out.println(response);
    }

    public void putPdfInStorageToTiffExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.tiff";

        AsposeResponse response = pdfApi.putPdfInStorageToTiff(name, resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToTiffExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.tiff";

        AsposeResponse response = pdfApi.putPdfInRequestToTiff(resFileName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, file);
        System.out.println(response);
    }


    public void getPdfInStorageToSvgExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToSvg(name, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToSvgExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.svg";

        AsposeResponse response = pdfApi.putPdfInStorageToSvg(name, resFileName, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToSvgExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.svg";

        AsposeResponse response =pdfApi.putPdfInRequestToSvg(resFileName, null, file);
        System.out.println(response);
    }

    public void getPdfInStorageToXpsExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToXps(name, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToXpsExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.xps";

        AsposeResponse response = pdfApi.putPdfInStorageToXps(name, resFileName, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToXpsExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.xps";

        AsposeResponse response = pdfApi.putPdfInRequestToXps(resFileName, null , file);
        System.out.println(response);
    }


    public void getPdfInStorageToXlsExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToXls(name, null, null, null, null, folder, null);
        System.out.println(response);
    }

    public void putPdfInStorageToXlsExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.xls";

        AsposeResponse response = pdfApi.putPdfInStorageToXls(name, resFileName, null, null, null, null, folder, null);
        System.out.println(response);
    }

    public void putPdfInRequestToXlsExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.xls";

        AsposeResponse response = pdfApi.putPdfInRequestToXls(resFileName, null, null, null, null, null , file);
        System.out.println(response);
    }


    public void getPdfInStorageToXlsxExample() throws ApiException
    {
    	
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToXlsx(name, null, null, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToXlsxExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.xlsx";

        AsposeResponse response = pdfApi.putPdfInStorageToXlsx(name, resFileName, null, null, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToXlsxExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.xlsx";

        AsposeResponse response = pdfApi.putPdfInRequestToXlsx(resFileName, null, null, null, null, null , file);
        System.out.println(response);
    }


    public void getPdfInStorageToHtmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToHtml(name, null, null, null, null, null,  null,  null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToHtmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result_html.zip";

        AsposeResponse response = pdfApi.putPdfInStorageToHtml(
                name,
                resFileName,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                folder,
                null);
        System.out.println(response);
    }


    public void putPdfInRequestToHtmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File(name);
        String resFileName = "result.zip";

        AsposeResponse response = pdfApi.putPdfInRequestToHtml(
                resFileName,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                file);
        System.out.println(response);
    }


    public void getPdfInStorageToEpubExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToEpub(name, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToEpubExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.epub";

        AsposeResponse response =pdfApi.putPdfInStorageToEpub(name, resFileName, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToEpubExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File(name);
        String resFileName = "result.epub";

        AsposeResponse response = pdfApi.putPdfInRequestToEpub(resFileName, null, null, file);
        System.out.println(response);
    }


    public void getPdfInStorageToPptxExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToPptx(name, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToPptxExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.pptx";

        AsposeResponse response = pdfApi.putPdfInStorageToPptx(name, resFileName, null, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToPptxExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File( name);
        String resFileName = "result.pptx";

        AsposeResponse response = pdfApi.putPdfInRequestToPptx(resFileName, null, null, null, file);
        System.out.println(response);
    }



    public void getPdfInStorageToLaTeXExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToLaTeX(name, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToLaTeXExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.latex";

        AsposeResponse response = pdfApi.putPdfInStorageToLaTeX(name, resFileName, null, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToLaTeXExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File(name);
        String resFileName = "result.latex";

        AsposeResponse response = pdfApi.putPdfInRequestToLaTeX(resFileName, null, null, file);
        System.out.println(response);
    }


    public void getPdfInStorageToMobiXmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToMobiXml(name, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToMobiXmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.mobi";

        AsposeResponse response =pdfApi.putPdfInStorageToMobiXml(name, resFileName, folder, null);
        System.out.println(response);
    }


    public void putPdfInRequestToMobiXmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File(name);
        String resFileName = "result.mobi";

        AsposeResponse response = pdfApi.putPdfInRequestToMobiXml(resFileName, null, file);
        System.out.println(response);
    }

    public void getXfaPdfInStorageToAcroFormExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "PdfWithXfaForm.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response =pdfApi.getXfaPdfInStorageToAcroForm(name, folder, null);
        System.out.println(response);
    }

    public void putXfaPdfInStorageToAcroFormExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "PdfWithXfaForm.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.pdf";

        AsposeResponse response =pdfApi.putXfaPdfInStorageToAcroForm(name, resFileName, folder, null);
        System.out.println(response);
    }


    public void putXfaPdfInRequestToAcroFormExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "PdfWithXfaForm.pdf";
        File file = new File(name);
        String resFileName = "result.pdf";

        AsposeResponse response = pdfApi.putXfaPdfInRequestToAcroForm(resFileName, null, file);
        System.out.println(response);
    }



    public void getPdfInStorageToXmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;


        File response = pdfApi.getPdfInStorageToXml(name, folder, null);
        System.out.println(response);
    }


    public void putPdfInStorageToXmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        Common.uploadFile(pdfApi,name);

        String folder = null;
        String resFileName = "result.xml";

        AsposeResponse response = pdfApi.putPdfInStorageToXml(name, resFileName, folder, null);
        System.out.println(response);
    }

    public void putPdfInRequestToXmlExample() throws ApiException
    {
    	PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
        String name = "4pages.pdf";
        File file = new File(name);
        String resFileName = "result.xml";

        AsposeResponse response = pdfApi.putPdfInRequestToXml(resFileName, null, file);
        System.out.println(response);
    }
}
