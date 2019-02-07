package com.aspose.asposecloudpdf.examples.document;

import java.io.File;
import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.MergeDocuments;

public class PutMergeDocumentExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9");

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("4pages.pdf");
		nameList.add("PdfWithImages2.pdf");
		nameList.add("marketing.pdf");

		for (String name : nameList) {
			Common.uploadFile(pdfApi, name);
		}

		String resultName = "MergingResult.pdf";
		MergeDocuments mergeDocuments = new MergeDocuments();

		for (int i = 0; i < nameList.size(); i++) {
			nameList.set(i, nameList.get(i));
		}
		mergeDocuments.setList(nameList);
		String folder = "";

		File response = pdfApi.putMergeDocuments(resultName, mergeDocuments, null, folder);
	}

}
