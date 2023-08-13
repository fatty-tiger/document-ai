package com.fattytiger.ai.pdfbox;


import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;


public class PdfToImages {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\购房材料\\收入证明.pdf");
        PDDocument document = PDDocument.load(file);

        PDFRenderer renderer = new PDFRenderer(document);
        BufferedImage image = renderer.renderImage(0);

        ImageIO.write(image, "JPEG", new File("E:\\购房材料\\收入证明.jpg"));

        document.close();
    }
}
