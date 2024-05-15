package org.example;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        ImageProcessor imageProcessor = new ImageProcessor();

        try {
            {
                imageProcessor.readImage("kotek.jpg");
                long startTime = System.currentTimeMillis();
                imageProcessor.setBrightness(100);
                long endTime = System.currentTimeMillis();
                System.out.println(endTime-startTime);
            }
            {
                imageProcessor.readImage("kotek.jpg");
                long startTime = System.currentTimeMillis();
                imageProcessor.setBrightness2(100);
                long endTime = System.currentTimeMillis();
                System.out.println(endTime-startTime);
            }
            {
                imageProcessor.readImage("kotek.jpg");
                long startTime = System.currentTimeMillis();
                imageProcessor.setBrightnessThreadPool(100);
                long endTime = System.currentTimeMillis();
                System.out.println(endTime - startTime);
            }
            //imageProcessor.setBrightness(100);
            imageProcessor.writeImage("obrazek.jpeg");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}