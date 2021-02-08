package com.aspose.asposecloudpdf.examples.document;

import java.util.ArrayList;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.DocumentResponse;
import com.aspose.asposecloudpdf.model.MergeDocuments;

public class PutMergeExample {

	public static void main(String[] args) throws ApiException {
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("4pages.pdf");
        nameList.add("PdfWithImages2.pdf");
        nameList.add("marketing.pdf");

        for (String name : nameList)
        {
        	Common.uploadFile(pdfApi,name);
        }

        String resultName = "MergingResult.pdf";

        MergeDocuments mergeDocuments = new MergeDocuments();

        for(int i = 0; i < nameList.size(); i++)
        {
            nameList.set(i,"" + '/' + nameList.get(i));
        }

        mergeDocuments.setList(nameList);

        String folder = "";

        DocumentResponse response = pdfApi.putMergeDocuments(resultName, mergeDocuments, null, folder);
        System.out.println(response);
	}

}
