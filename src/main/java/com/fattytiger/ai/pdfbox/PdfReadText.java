package com.fattytiger.ai.pdfbox;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;



public class PdfReadText {
    public static void main(String[] args) throws IOException {

        File myFile = new File("E:\\购房材料\\收入证明.pdf");

        try (PDDocument doc = PDDocument.load(myFile)) {

            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(doc);

            System.out.println("Text size: " + text.length() + " characters:");
            System.out.println(text);
        }
    }
}
