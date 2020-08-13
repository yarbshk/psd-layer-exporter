package com.aspose.psd_layerexporter;

import java.io.File;

public class FileUtils
{
    public static String joinPaths(String parent, String child)
    {
        return new File(parent, child).getAbsolutePath();
    }
}
