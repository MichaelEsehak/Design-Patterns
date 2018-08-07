package com.design.pattern.strategy;

import java.io.File;

import java.util.List;

public interface CompressionStrategy {

    public void compress(List<File> files);
}
