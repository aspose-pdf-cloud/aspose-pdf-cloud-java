# aspose-cloud-pdf

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-cloud-pdf</artifactId>
    <version>18.6.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-cloud-pdf:18.6.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-cloud-pdf-18.6.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.aspose.asposecloudpdf.api.PdfApi;

public class PdfApiExample {

    public static void main(String[] args) {
        PdfApi apiInstance = new PdfApi();
        String name = "name_example"; // String | The document name.
        String fieldName = "fieldName_example"; // String | The field name/
        String storage = "storage_example"; // String | The document storage.
        String folder = "folder_example"; // String | The document folder.
        try {
            SaaSposeResponse result = apiInstance.deleteField(name, fieldName, storage, folder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PdfApi#deleteField");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.aspose.cloud/v1.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PdfApi* | [**deleteField**](docs/PdfApi.md#deleteField) | **DELETE** /pdf/{name}/fields/{fieldName} | Delete document field by name.
*PdfApi* | [**deletePage**](docs/PdfApi.md#deletePage) | **DELETE** /pdf/{name}/pages/{pageNumber} | Delete document page by its number.
*PdfApi* | [**deleteProperties**](docs/PdfApi.md#deleteProperties) | **DELETE** /pdf/{name}/documentproperties | Delete custom document properties.
*PdfApi* | [**deleteProperty**](docs/PdfApi.md#deleteProperty) | **DELETE** /pdf/{name}/documentproperties/{propertyName} | Delete document property.
*PdfApi* | [**getDocument**](docs/PdfApi.md#getDocument) | **GET** /pdf/{name} | Read common document info or convert to some format if the format specified.
*PdfApi* | [**getDocumentAttachmentByIndex**](docs/PdfApi.md#getDocumentAttachmentByIndex) | **GET** /pdf/{name}/attachments/{attachmentIndex} | Read document attachment info by its index.
*PdfApi* | [**getDocumentAttachments**](docs/PdfApi.md#getDocumentAttachments) | **GET** /pdf/{name}/attachments | Read document attachments info.
*PdfApi* | [**getDocumentBookmarks**](docs/PdfApi.md#getDocumentBookmarks) | **GET** /pdf/{name}/bookmarks | Read document bookmark/bookmarks (including children).
*PdfApi* | [**getDocumentProperties**](docs/PdfApi.md#getDocumentProperties) | **GET** /pdf/{name}/documentproperties | Read document properties.
*PdfApi* | [**getDocumentProperty**](docs/PdfApi.md#getDocumentProperty) | **GET** /pdf/{name}/documentproperties/{propertyName} | Read document property by name.
*PdfApi* | [**getDownload**](docs/PdfApi.md#getDownload) | **GET** /storage/file | Download a specific file 
*PdfApi* | [**getDownloadDocumentAttachmentByIndex**](docs/PdfApi.md#getDownloadDocumentAttachmentByIndex) | **GET** /pdf/{name}/attachments/{attachmentIndex}/download | Download document attachment content by its index.
*PdfApi* | [**getEpubInStorageToPdf**](docs/PdfApi.md#getEpubInStorageToPdf) | **GET** /pdf/create/epub | Convert EPUB file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getField**](docs/PdfApi.md#getField) | **GET** /pdf/{name}/fields/{fieldName} | Get document field by name.
*PdfApi* | [**getFields**](docs/PdfApi.md#getFields) | **GET** /pdf/{name}/fields | Get document fields.
*PdfApi* | [**getFragment**](docs/PdfApi.md#getFragment) | **GET** /pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber} | Read page fragment.
*PdfApi* | [**getFragmentTextFormat**](docs/PdfApi.md#getFragmentTextFormat) | **GET** /pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/textFormat | Read page fragment text format.
*PdfApi* | [**getFragments**](docs/PdfApi.md#getFragments) | **GET** /pdf/{name}/pages/{pageNumber}/fragments | Read page fragments.
*PdfApi* | [**getHtmlInStorageToPdf**](docs/PdfApi.md#getHtmlInStorageToPdf) | **GET** /pdf/create/html | Convert HTML file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getImage**](docs/PdfApi.md#getImage) | **GET** /pdf/{name}/pages/{pageNumber}/images/{imageNumber} | Extract document image in format specified.
*PdfApi* | [**getImages**](docs/PdfApi.md#getImages) | **GET** /pdf/{name}/pages/{pageNumber}/images | Read document images.
*PdfApi* | [**getLaTeXInStorageToPdf**](docs/PdfApi.md#getLaTeXInStorageToPdf) | **GET** /pdf/create/latex | Convert LaTeX file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getMhtInStorageToPdf**](docs/PdfApi.md#getMhtInStorageToPdf) | **GET** /pdf/create/mht | Convert MHT file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getPage**](docs/PdfApi.md#getPage) | **GET** /pdf/{name}/pages/{pageNumber} | Convert document page to format specified.
*PdfApi* | [**getPageAnnotation**](docs/PdfApi.md#getPageAnnotation) | **GET** /pdf/{name}/pages/{pageNumber}/annotations/{annotationNumber} | Read document page annotation by its number.
*PdfApi* | [**getPageAnnotations**](docs/PdfApi.md#getPageAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations | Read documant page annotations.
*PdfApi* | [**getPageConvertToBmp**](docs/PdfApi.md#getPageConvertToBmp) | **GET** /pdf/{name}/pages/{pageNumber}/convert/bmp | Convert document page to Bmp image.
*PdfApi* | [**getPageConvertToEmf**](docs/PdfApi.md#getPageConvertToEmf) | **GET** /pdf/{name}/pages/{pageNumber}/convert/emf | Convert document page to Emf image.
*PdfApi* | [**getPageConvertToGif**](docs/PdfApi.md#getPageConvertToGif) | **GET** /pdf/{name}/pages/{pageNumber}/convert/gif | Convert document page to Gif image.
*PdfApi* | [**getPageConvertToJpeg**](docs/PdfApi.md#getPageConvertToJpeg) | **GET** /pdf/{name}/pages/{pageNumber}/convert/jpeg | Convert document page to Jpeg image.
*PdfApi* | [**getPageConvertToPng**](docs/PdfApi.md#getPageConvertToPng) | **GET** /pdf/{name}/pages/{pageNumber}/convert/png | Convert document page to Png image.
*PdfApi* | [**getPageConvertToTiff**](docs/PdfApi.md#getPageConvertToTiff) | **GET** /pdf/{name}/pages/{pageNumber}/convert/tiff | Convert document page to Tiff image.
*PdfApi* | [**getPageLinkAnnotationByIndex**](docs/PdfApi.md#getPageLinkAnnotationByIndex) | **GET** /pdf/{name}/pages/{pageNumber}/links/{linkIndex} | Read document page link annotation by its index.
*PdfApi* | [**getPageLinkAnnotations**](docs/PdfApi.md#getPageLinkAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/links | Read document page link annotations.
*PdfApi* | [**getPageText**](docs/PdfApi.md#getPageText) | **GET** /pdf/{name}/pages/{pageNumber}/text | Read page text items.
*PdfApi* | [**getPageTextItems**](docs/PdfApi.md#getPageTextItems) | **GET** /pdf/{name}/pages/{pageNumber}/textItems | Read page text items.
*PdfApi* | [**getPages**](docs/PdfApi.md#getPages) | **GET** /pdf/{name}/pages | Read document pages info.
*PdfApi* | [**getPclInStorageToPdf**](docs/PdfApi.md#getPclInStorageToPdf) | **GET** /pdf/create/pcl | Convert PCL file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getPdfInStorageToDoc**](docs/PdfApi.md#getPdfInStorageToDoc) | **GET** /pdf/{name}/convert/doc | Converts PDF document (located on storage) to DOC format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToEpub**](docs/PdfApi.md#getPdfInStorageToEpub) | **GET** /pdf/{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToHtml**](docs/PdfApi.md#getPdfInStorageToHtml) | **GET** /pdf/{name}/convert/html | Converts PDF document (located on storage) to Html format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToLaTeX**](docs/PdfApi.md#getPdfInStorageToLaTeX) | **GET** /pdf/{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToMobiXml**](docs/PdfApi.md#getPdfInStorageToMobiXml) | **GET** /pdf/{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToPdfA**](docs/PdfApi.md#getPdfInStorageToPdfA) | **GET** /pdf/{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToPptx**](docs/PdfApi.md#getPdfInStorageToPptx) | **GET** /pdf/{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToSvg**](docs/PdfApi.md#getPdfInStorageToSvg) | **GET** /pdf/{name}/convert/svg | Converts PDF document (located on storage) to SVG format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToTiff**](docs/PdfApi.md#getPdfInStorageToTiff) | **GET** /pdf/{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXls**](docs/PdfApi.md#getPdfInStorageToXls) | **GET** /pdf/{name}/convert/xls | Converts PDF document (located on storage) to XLS format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXml**](docs/PdfApi.md#getPdfInStorageToXml) | **GET** /pdf/{name}/convert/xml | Converts PDF document (located on storage) to XML format and returns resulting file in response content
*PdfApi* | [**getPdfInStorageToXps**](docs/PdfApi.md#getPdfInStorageToXps) | **GET** /pdf/{name}/convert/xps | Converts PDF document (located on storage) to XPS format and returns resulting file in response content
*PdfApi* | [**getPsInStorageToPdf**](docs/PdfApi.md#getPsInStorageToPdf) | **GET** /pdf/create/ps | Convert PS file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getSegment**](docs/PdfApi.md#getSegment) | **GET** /pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/{segmentNumber} | Read segment.
*PdfApi* | [**getSegmentTextFormat**](docs/PdfApi.md#getSegmentTextFormat) | **GET** /pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments/{segmentNumber}/textformat | Read segment text format.
*PdfApi* | [**getSegments**](docs/PdfApi.md#getSegments) | **GET** /pdf/{name}/pages/{pageNumber}/fragments/{fragmentNumber}/segments | Read fragment segments.
*PdfApi* | [**getSvgInStorageToPdf**](docs/PdfApi.md#getSvgInStorageToPdf) | **GET** /pdf/create/svg | Convert SVG file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getText**](docs/PdfApi.md#getText) | **GET** /pdf/{name}/text | Read document text.
*PdfApi* | [**getTextItems**](docs/PdfApi.md#getTextItems) | **GET** /pdf/{name}/textItems | Read document text items.
*PdfApi* | [**getVerifySignature**](docs/PdfApi.md#getVerifySignature) | **GET** /pdf/{name}/verifySignature | Verify signature document.
*PdfApi* | [**getWebInStorageToPdf**](docs/PdfApi.md#getWebInStorageToPdf) | **GET** /pdf/create/web | Convert web page to PDF format and return resulting file in response. 
*PdfApi* | [**getWordsPerPage**](docs/PdfApi.md#getWordsPerPage) | **GET** /pdf/{name}/pages/wordCount | Get number of words per document page.
*PdfApi* | [**getXfaPdfInStorageToAcroForm**](docs/PdfApi.md#getXfaPdfInStorageToAcroForm) | **GET** /pdf/{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
*PdfApi* | [**getXmlInStorageToPdf**](docs/PdfApi.md#getXmlInStorageToPdf) | **GET** /pdf/create/xml | Convert XML file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getXpsInStorageToPdf**](docs/PdfApi.md#getXpsInStorageToPdf) | **GET** /pdf/create/xps | Convert XPS file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**getXslFoInStorageToPdf**](docs/PdfApi.md#getXslFoInStorageToPdf) | **GET** /pdf/create/xslfo | Convert XslFo file (located on storage) to PDF format and return resulting file in response. 
*PdfApi* | [**postAppendDocument**](docs/PdfApi.md#postAppendDocument) | **POST** /pdf/{name}/appendDocument | Append document to existing one.
*PdfApi* | [**postCreateField**](docs/PdfApi.md#postCreateField) | **POST** /pdf/{name}/fields | Create field.
*PdfApi* | [**postDocumentReplaceText**](docs/PdfApi.md#postDocumentReplaceText) | **POST** /pdf/{name}/replaceText | Document&#39;s replace text method. Deprecated
*PdfApi* | [**postDocumentReplaceTextList**](docs/PdfApi.md#postDocumentReplaceTextList) | **POST** /pdf/{name}/replaceTextList | Document&#39;s replace text method. Deprecated
*PdfApi* | [**postDocumentTextReplace**](docs/PdfApi.md#postDocumentTextReplace) | **POST** /pdf/{name}/text/replace | Document&#39;s replace text method.
*PdfApi* | [**postMovePage**](docs/PdfApi.md#postMovePage) | **POST** /pdf/{name}/pages/{pageNumber}/movePage | Move page to new position.
*PdfApi* | [**postOptimizeDocument**](docs/PdfApi.md#postOptimizeDocument) | **POST** /pdf/{name}/optimize | Optimize document.
*PdfApi* | [**postPageReplaceText**](docs/PdfApi.md#postPageReplaceText) | **POST** /pdf/{name}/pages/{pageNumber}/replaceText | Page&#39;s replace text method. Deprecated
*PdfApi* | [**postPageReplaceTextList**](docs/PdfApi.md#postPageReplaceTextList) | **POST** /pdf/{name}/pages/{pageNumber}/replaceTextList | Page&#39;s replace text method. Deprecated
*PdfApi* | [**postPageTextReplace**](docs/PdfApi.md#postPageTextReplace) | **POST** /pdf/{name}/pages/{pageNumber}/text/replace | Page&#39;s replace text method.
*PdfApi* | [**postReplaceImage**](docs/PdfApi.md#postReplaceImage) | **POST** /pdf/{name}/pages/{pageNumber}/images/{imageNumber} | Replace document image.
*PdfApi* | [**postSignDocument**](docs/PdfApi.md#postSignDocument) | **POST** /pdf/{name}/sign | Sign document.
*PdfApi* | [**postSignPage**](docs/PdfApi.md#postSignPage) | **POST** /pdf/{name}/pages/{pageNumber}/sign | Sign page.
*PdfApi* | [**postSplitDocument**](docs/PdfApi.md#postSplitDocument) | **POST** /pdf/{name}/split | Split document to parts.
*PdfApi* | [**putAddNewPage**](docs/PdfApi.md#putAddNewPage) | **PUT** /pdf/{name}/pages | Add new page to end of the document.
*PdfApi* | [**putAddParagraph**](docs/PdfApi.md#putAddParagraph) | **PUT** /pdf/{name}/pages/{pageNumber}/paragraph | Add text to PDF document page. Deprecated
*PdfApi* | [**putAddText**](docs/PdfApi.md#putAddText) | **PUT** /pdf/{name}/pages/{pageNumber}/text | Add text to PDF document page.
*PdfApi* | [**putConvertDocument**](docs/PdfApi.md#putConvertDocument) | **PUT** /pdf/convert | Convert document from request content to format specified.
*PdfApi* | [**putCreate**](docs/PdfApi.md#putCreate) | **PUT** /storage/file | Upload a specific file 
*PdfApi* | [**putCreateDocument**](docs/PdfApi.md#putCreateDocument) | **PUT** /pdf/{name} | Create new document.
*PdfApi* | [**putCreateDocumentFromImages**](docs/PdfApi.md#putCreateDocumentFromImages) | **PUT** /pdf/{name}/fromimages | Create new document from images.
*PdfApi* | [**putDocumentSaveAsTiff**](docs/PdfApi.md#putDocumentSaveAsTiff) | **PUT** /pdf/{name}/SaveAs/tiff | Save document as Tiff image.
*PdfApi* | [**putEpubInStorageToPdf**](docs/PdfApi.md#putEpubInStorageToPdf) | **PUT** /pdf/{name}/create/epub | Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putFieldsFlatten**](docs/PdfApi.md#putFieldsFlatten) | **PUT** /pdf/{name}/fields/flatten | Flatten form fields in document.
*PdfApi* | [**putHtmlInStorageToPdf**](docs/PdfApi.md#putHtmlInStorageToPdf) | **PUT** /pdf/{name}/create/html | Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putImageInStorageToPdf**](docs/PdfApi.md#putImageInStorageToPdf) | **PUT** /pdf/{name}/create/images | Convert image file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putImagesExtractAsGif**](docs/PdfApi.md#putImagesExtractAsGif) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/gif | Extract document images in format specified to folder.
*PdfApi* | [**putImagesExtractAsJpeg**](docs/PdfApi.md#putImagesExtractAsJpeg) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/jpeg | Extract document images in format specified to folder.
*PdfApi* | [**putImagesExtractAsPng**](docs/PdfApi.md#putImagesExtractAsPng) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/png | Extract document images in format specified to folder.
*PdfApi* | [**putImagesExtractAsTiff**](docs/PdfApi.md#putImagesExtractAsTiff) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/tiff | Extract document images in format specified to folder.
*PdfApi* | [**putLaTeXInStorageToPdf**](docs/PdfApi.md#putLaTeXInStorageToPdf) | **PUT** /pdf/{name}/create/latex | Convert LaTeX file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putMergeDocuments**](docs/PdfApi.md#putMergeDocuments) | **PUT** /pdf/{name}/merge | Merge a list of documents.
*PdfApi* | [**putMhtInStorageToPdf**](docs/PdfApi.md#putMhtInStorageToPdf) | **PUT** /pdf/{name}/create/mht | Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putPageAddStamp**](docs/PdfApi.md#putPageAddStamp) | **PUT** /pdf/{name}/pages/{pageNumber}/stamp | Add page stamp.
*PdfApi* | [**putPageConvertToBmp**](docs/PdfApi.md#putPageConvertToBmp) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/bmp | Convert document page to bmp image and save in storage.
*PdfApi* | [**putPageConvertToEmf**](docs/PdfApi.md#putPageConvertToEmf) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/emf | Convert document page to emf image and save in storage.
*PdfApi* | [**putPageConvertToGif**](docs/PdfApi.md#putPageConvertToGif) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/gif | Convert document page to gif image and save in storage.
*PdfApi* | [**putPageConvertToJpeg**](docs/PdfApi.md#putPageConvertToJpeg) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/jpeg | Convert document page to Jpeg image and save in storage.
*PdfApi* | [**putPageConvertToPng**](docs/PdfApi.md#putPageConvertToPng) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/png | Convert document page to png image and save in storage.
*PdfApi* | [**putPageConvertToTiff**](docs/PdfApi.md#putPageConvertToTiff) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/tiff | Convert document page to Tiff image and save in storage.
*PdfApi* | [**putPclInStorageToPdf**](docs/PdfApi.md#putPclInStorageToPdf) | **PUT** /pdf/{name}/create/pcl | Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putPdfInRequestToDoc**](docs/PdfApi.md#putPdfInRequestToDoc) | **PUT** /pdf/convert/doc | Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToEpub**](docs/PdfApi.md#putPdfInRequestToEpub) | **PUT** /pdf/convert/epub | Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToHtml**](docs/PdfApi.md#putPdfInRequestToHtml) | **PUT** /pdf/convert/html | Converts PDF document (in request content) to Html format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToLaTeX**](docs/PdfApi.md#putPdfInRequestToLaTeX) | **PUT** /pdf/convert/latex | Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToMobiXml**](docs/PdfApi.md#putPdfInRequestToMobiXml) | **PUT** /pdf/convert/mobixml | Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToPdfA**](docs/PdfApi.md#putPdfInRequestToPdfA) | **PUT** /pdf/convert/pdfa | Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToPptx**](docs/PdfApi.md#putPdfInRequestToPptx) | **PUT** /pdf/convert/pptx | Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToSvg**](docs/PdfApi.md#putPdfInRequestToSvg) | **PUT** /pdf/convert/svg | Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToTiff**](docs/PdfApi.md#putPdfInRequestToTiff) | **PUT** /pdf/convert/tiff | Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXls**](docs/PdfApi.md#putPdfInRequestToXls) | **PUT** /pdf/convert/xls | Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXml**](docs/PdfApi.md#putPdfInRequestToXml) | **PUT** /pdf/convert/xml | Converts PDF document (in request content) to XML format and uploads resulting file to storage.
*PdfApi* | [**putPdfInRequestToXps**](docs/PdfApi.md#putPdfInRequestToXps) | **PUT** /pdf/convert/xps | Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
*PdfApi* | [**putPdfInStorageToDoc**](docs/PdfApi.md#putPdfInStorageToDoc) | **PUT** /pdf/{name}/convert/doc | Converts PDF document (located on storage) to DOC format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToEpub**](docs/PdfApi.md#putPdfInStorageToEpub) | **PUT** /pdf/{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToHtml**](docs/PdfApi.md#putPdfInStorageToHtml) | **PUT** /pdf/{name}/convert/html | Converts PDF document (located on storage) to Html format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToLaTeX**](docs/PdfApi.md#putPdfInStorageToLaTeX) | **PUT** /pdf/{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToMobiXml**](docs/PdfApi.md#putPdfInStorageToMobiXml) | **PUT** /pdf/{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToPdfA**](docs/PdfApi.md#putPdfInStorageToPdfA) | **PUT** /pdf/{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToPptx**](docs/PdfApi.md#putPdfInStorageToPptx) | **PUT** /pdf/{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToSvg**](docs/PdfApi.md#putPdfInStorageToSvg) | **PUT** /pdf/{name}/convert/svg | Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToTiff**](docs/PdfApi.md#putPdfInStorageToTiff) | **PUT** /pdf/{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXls**](docs/PdfApi.md#putPdfInStorageToXls) | **PUT** /pdf/{name}/convert/xls | Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXml**](docs/PdfApi.md#putPdfInStorageToXml) | **PUT** /pdf/{name}/convert/xml | Converts PDF document (located on storage) to XML format and uploads resulting file to storage
*PdfApi* | [**putPdfInStorageToXps**](docs/PdfApi.md#putPdfInStorageToXps) | **PUT** /pdf/{name}/convert/xps | Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
*PdfApi* | [**putPrivileges**](docs/PdfApi.md#putPrivileges) | **PUT** /pdf/{name}/privileges | Update privilege document.
*PdfApi* | [**putPsInStorageToPdf**](docs/PdfApi.md#putPsInStorageToPdf) | **PUT** /pdf/{name}/create/ps | Convert PS file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putSearchableDocument**](docs/PdfApi.md#putSearchableDocument) | **PUT** /pdf/{name}/ocr | Create searchable PDF document. Generate OCR layer for images in input PDF document.
*PdfApi* | [**putSetProperty**](docs/PdfApi.md#putSetProperty) | **PUT** /pdf/{name}/documentproperties/{propertyName} | Add/update document property.
*PdfApi* | [**putSvgInStorageToPdf**](docs/PdfApi.md#putSvgInStorageToPdf) | **PUT** /pdf/{name}/create/svg | Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putUpdateField**](docs/PdfApi.md#putUpdateField) | **PUT** /pdf/{name}/fields/{fieldName} | Update field.
*PdfApi* | [**putUpdateFields**](docs/PdfApi.md#putUpdateFields) | **PUT** /pdf/{name}/fields | Update fields.
*PdfApi* | [**putWebInStorageToPdf**](docs/PdfApi.md#putWebInStorageToPdf) | **PUT** /pdf/{name}/create/web | Convert web page to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXfaPdfInRequestToAcroForm**](docs/PdfApi.md#putXfaPdfInRequestToAcroForm) | **PUT** /pdf/convert/xfatoacroform | Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
*PdfApi* | [**putXfaPdfInStorageToAcroForm**](docs/PdfApi.md#putXfaPdfInStorageToAcroForm) | **PUT** /pdf/{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
*PdfApi* | [**putXmlInStorageToPdf**](docs/PdfApi.md#putXmlInStorageToPdf) | **PUT** /pdf/{name}/create/xml | Convert XML file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXpsInStorageToPdf**](docs/PdfApi.md#putXpsInStorageToPdf) | **PUT** /pdf/{name}/create/xps | Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 
*PdfApi* | [**putXslFoInStorageToPdf**](docs/PdfApi.md#putXslFoInStorageToPdf) | **PUT** /pdf/{name}/create/xslfo | Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 


## Documentation for Models

 - [AntialiasingProcessingType](docs/AntialiasingProcessingType.md)
 - [AppendDocument](docs/AppendDocument.md)
 - [Color](docs/Color.md)
 - [ColorDepth](docs/ColorDepth.md)
 - [CompressionType](docs/CompressionType.md)
 - [DocFormat](docs/DocFormat.md)
 - [DocRecognitionMode](docs/DocRecognitionMode.md)
 - [DocumentPrivilege](docs/DocumentPrivilege.md)
 - [EpubRecognitionMode](docs/EpubRecognitionMode.md)
 - [FieldType](docs/FieldType.md)
 - [FontEncodingRules](docs/FontEncodingRules.md)
 - [FontSavingModes](docs/FontSavingModes.md)
 - [FontStyles](docs/FontStyles.md)
 - [HorizontalAlignment](docs/HorizontalAlignment.md)
 - [HtmlDocumentType](docs/HtmlDocumentType.md)
 - [HtmlMarkupGenerationModes](docs/HtmlMarkupGenerationModes.md)
 - [HttpStatusCode](docs/HttpStatusCode.md)
 - [ImageSrcType](docs/ImageSrcType.md)
 - [ImageTemplate](docs/ImageTemplate.md)
 - [ImageTemplatesRequest](docs/ImageTemplatesRequest.md)
 - [ImagesListRequest](docs/ImagesListRequest.md)
 - [LettersPositioningMethods](docs/LettersPositioningMethods.md)
 - [LineSpacing](docs/LineSpacing.md)
 - [Link](docs/Link.md)
 - [LinkActionType](docs/LinkActionType.md)
 - [LinkElement](docs/LinkElement.md)
 - [LinkHighlightingMode](docs/LinkHighlightingMode.md)
 - [MarginInfo](docs/MarginInfo.md)
 - [MergeDocuments](docs/MergeDocuments.md)
 - [OptimizeOptions](docs/OptimizeOptions.md)
 - [PageWordCount](docs/PageWordCount.md)
 - [Paragraph](docs/Paragraph.md)
 - [PartsEmbeddingModes](docs/PartsEmbeddingModes.md)
 - [PdfAType](docs/PdfAType.md)
 - [RasterImagesSavingModes](docs/RasterImagesSavingModes.md)
 - [Rectangle](docs/Rectangle.md)
 - [Rotation](docs/Rotation.md)
 - [SaaSposeResponse](docs/SaaSposeResponse.md)
 - [Segment](docs/Segment.md)
 - [ShapeType](docs/ShapeType.md)
 - [Signature](docs/Signature.md)
 - [SignatureType](docs/SignatureType.md)
 - [SplitResult](docs/SplitResult.md)
 - [Stamp](docs/Stamp.md)
 - [StampType](docs/StampType.md)
 - [TextHorizontalAlignment](docs/TextHorizontalAlignment.md)
 - [TextLine](docs/TextLine.md)
 - [TextRect](docs/TextRect.md)
 - [TextRects](docs/TextRects.md)
 - [TextReplace](docs/TextReplace.md)
 - [TextReplaceListRequest](docs/TextReplaceListRequest.md)
 - [TextState](docs/TextState.md)
 - [TiffExportOptions](docs/TiffExportOptions.md)
 - [VerticalAlignment](docs/VerticalAlignment.md)
 - [WordCount](docs/WordCount.md)
 - [WrapMode](docs/WrapMode.md)
 - [Annotation](docs/Annotation.md)
 - [AnnotationResponse](docs/AnnotationResponse.md)
 - [Annotations](docs/Annotations.md)
 - [AnnotationsResponse](docs/AnnotationsResponse.md)
 - [Attachment](docs/Attachment.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [Attachments](docs/Attachments.md)
 - [AttachmentsResponse](docs/AttachmentsResponse.md)
 - [Document](docs/Document.md)
 - [DocumentPagesResponse](docs/DocumentPagesResponse.md)
 - [DocumentProperties](docs/DocumentProperties.md)
 - [DocumentPropertiesResponse](docs/DocumentPropertiesResponse.md)
 - [DocumentProperty](docs/DocumentProperty.md)
 - [DocumentPropertyResponse](docs/DocumentPropertyResponse.md)
 - [DocumentResponse](docs/DocumentResponse.md)
 - [Field](docs/Field.md)
 - [FieldResponse](docs/FieldResponse.md)
 - [Fields](docs/Fields.md)
 - [FieldsResponse](docs/FieldsResponse.md)
 - [Image](docs/Image.md)
 - [ImageResponse](docs/ImageResponse.md)
 - [Images](docs/Images.md)
 - [ImagesResponse](docs/ImagesResponse.md)
 - [LinkAnnotation](docs/LinkAnnotation.md)
 - [LinkAnnotationResponse](docs/LinkAnnotationResponse.md)
 - [LinkAnnotations](docs/LinkAnnotations.md)
 - [LinkAnnotationsResponse](docs/LinkAnnotationsResponse.md)
 - [Page](docs/Page.md)
 - [Pages](docs/Pages.md)
 - [SignatureVerifyResponse](docs/SignatureVerifyResponse.md)
 - [SplitResultDocument](docs/SplitResultDocument.md)
 - [SplitResultResponse](docs/SplitResultResponse.md)
 - [TextFormat](docs/TextFormat.md)
 - [TextFormatResponse](docs/TextFormatResponse.md)
 - [TextItem](docs/TextItem.md)
 - [TextItemResponse](docs/TextItemResponse.md)
 - [TextItems](docs/TextItems.md)
 - [TextItemsResponse](docs/TextItemsResponse.md)
 - [TextRectsResponse](docs/TextRectsResponse.md)
 - [TextReplaceRequest](docs/TextReplaceRequest.md)
 - [TextReplaceResponse](docs/TextReplaceResponse.md)
 - [WordCountResponse](docs/WordCountResponse.md)
 - [DocumentTextReplaceResponse](docs/DocumentTextReplaceResponse.md)
 - [PageTextReplaceResponse](docs/PageTextReplaceResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### appsid

- **Type**: API key
- **API key parameter name**: appsid
- **Location**: URL query string

### oauth

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: api.aspose.cloud/oauth2/token
- **Scopes**: N/A

### signature

- **Type**: API key
- **API key parameter name**: signature
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



