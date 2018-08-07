package com.design.pattern.strategy;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy{

    public void compress(List<File> files){
        System.out.println("Rar Compression");
    }
}
