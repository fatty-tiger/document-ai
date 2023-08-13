package com.fattytiger.ai.pdfbox;


import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;


public class PdfToImages {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/jiangjie/文档/保险计划书/百年康惠保重大疾病保险条款.pdf");
        PDDocument document = PDDocument.load(file);
        System.out.println("document pages:" + document.getPages().getCount());
//        PDFRenderer renderer = new PDFRenderer(document);
//        BufferedImage image = renderer.renderImage(0);
//
//        ImageIO.write(image, "JPEG", new File("/home/jiangjie/文档/保险计划书/test.jpg"));
//
//        document.close();
    }
}
