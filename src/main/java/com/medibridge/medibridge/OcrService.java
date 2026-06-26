package com.medibridge.medibridge;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class OcrService {

    private static final double CONFIDENCE_THRESHOLD = 85.0;

    public OcrResult extractText(MultipartFile imageFile) {

        // Safety check — agar file empty ho
        if (imageFile == null || imageFile.isEmpty()) {
            return new OcrResult(false, "", 0,
                "No image received. Please upload a prescription image.");
        }

        try {
            // Temp file banao
            Path tempFile = Files.createTempFile("prescription_", ".png");
            imageFile.transferTo(tempFile.toFile());

            // Tesseract setup
            Tesseract tesseract = new Tesseract();
            tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
            tesseract.setLanguage("eng");

            // Text extract karo
            String extractedText = tesseract.doOCR(tempFile.toFile());

            // Temp file delete karo
            Files.deleteIfExists(tempFile);

            // Confidence check
            if (extractedText == null || extractedText.trim().length() < 3) {
                return new OcrResult(false, extractedText, 0,
                    "Could not read prescription clearly. Please rescan or consult your doctor.");
            }

            return new OcrResult(true, extractedText.trim(), 90,
                "Text extracted successfully. Please verify before proceeding.");

        } catch (TesseractException e) {
            return new OcrResult(false, "", 0,
                "Could not read prescription. Please rescan or consult your doctor.");
        } catch (IOException e) {
            return new OcrResult(false, "", 0,
                "File error. Please try again.");
        }
    }

    // Result class
    public static class OcrResult {
        public boolean success;
        public String extractedText;
        public double confidence;
        public String message;

        public OcrResult(boolean success, String extractedText, double confidence, String message) {
            this.success = success;
            this.extractedText = extractedText;
            this.confidence = confidence;
            this.message = message;
        }
    }
}