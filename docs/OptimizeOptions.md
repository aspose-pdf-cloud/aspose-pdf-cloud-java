﻿
# OptimizeOptions
Represents Pdf optimize options.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **String** | Specifies document password (if any) encoded with base-64. | [optional]
**allowReusePageContent** | **Boolean** | If true page contents will be reused when document is optimized for equal pages. LinkDuplcateStreams option must be set to true. | [optional]
**compressImages** | **Boolean** | If this flag is set to true images will be compressed in the document. Compression level is specified with ImageQuality property. | [optional]
**imageQuality** | **Integer** | Specifies level of image compression when CompressImages flag is used. | [optional]
**linkDuplcateStreams** | **Boolean** | If this flag is set to true, Resource streams will be analyzed. If duplicate streams are found (i.e. if stream contents is equal), then thees streams will be stored as one object. This allows to decrease document size in some cases (for example, when same document was concatenated multiple times). | [optional]
**removeUnusedObjects** | **Boolean** | If this flag is set to true, all document objects will be checked and unused objects (i.e. objects which does not have any reference) are removed from document. | [optional]
**removeUnusedStreams** | **Boolean** | If this flag set to true, every resource is checked on it's usage. If resource is never used, then resources is removed. This may decrease document size for example when pages were extracted from document.  | [optional]
**unembedFonts** | **Boolean** | Make fonts not embedded if set to true. Unembedding a font means removing the embedded byte stream data of the font included in a PDF document. | [optional]
**resizeImages** | **Boolean** | If this flag set to true and CompressImages is true images will be resized if image resolution is greater then specified MaxResolution parameter. | [optional]
**maxResolution** | **Integer** | Specifies maximum resolution of images. If image has higher resolution it will be scaled. | [optional]
**subsetFonts** | **Boolean** | Fonts will be converted into subsets if set to true. Only those characters that are actually used in the layout are stored in the PDF.  | [optional]
**removePrivateInfo** | **Boolean** | Remove private information (page piece info). | [optional]
**imageEncoding** | [**ImageEncoding**](ImageEncoding.md) | Image encode which will be used. | [optional]
**imageCompressionVersion** | [**ImageCompressionVersion**](ImageCompressionVersion.md) | Version of compression algorithm. Possible values are: "Standard" - standard compression, "Fast" - fast (improved compression which is faster then standard but may be applicable not for all images), "Mixed" - mixed (standard compression is applied to images which can not be compressed by faster algorithm, this may give best compression but more slow then "Fast" algorithm. Version "Fast" is not applicable for resizing images (standard method will be used). Default is "Standard". | [optional]


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


