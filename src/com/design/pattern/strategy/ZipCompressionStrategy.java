package com.design.pattern.strategy;

import java.io.File;
import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy{

    @Override
    public void compress(List<File> files) {
        System.out.println("Zip Compression");
    }
}
