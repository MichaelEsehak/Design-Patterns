package com.design.pattern.strategy;

import java.io.File;

import java.util.List;
public class CompressionContext {

    CompressionStrategy compressionStrategy;


    public CompressionContext() {
    }

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compress(List<File> files){
        compressionStrategy.compress(files);
    }

    public CompressionStrategy getCompressionStrategy() {
        return compressionStrategy;
    }

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
}
