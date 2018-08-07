package com.design.pattern.strategy;

import java.util.ArrayList;

public class TestStrategy {

    public static void main(String[] args) {
        CompressionContext compressionContext = new CompressionContext();

        compressionContext.setCompressionStrategy(new RarCompressionStrategy());
        compressionContext.compress(new ArrayList<>());

        compressionContext.setCompressionStrategy(new ZipCompressionStrategy());
        compressionContext.compress(new ArrayList<>());
    }
}
