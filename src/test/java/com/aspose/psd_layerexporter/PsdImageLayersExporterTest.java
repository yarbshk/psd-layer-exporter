package com.aspose.psd_layerexporter;

import com.aspose.psd.fileformats.psd.PsdImage;
import com.aspose.psd.imageoptions.PngOptions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PsdImageLayersExporterTest
{

    /**
     * This test shows how to use the Photoshop document layers exporter properly.
     */
    @Test
    public void testExport()
    {
        LayerExporter layerExporter = new LayerExporter(new ImageNameFormatterImpl());
        // TODO: Uncomment the next line and set desired path if you want to store images into
        //  a directory that differs from working one
        // layerExporter.setOutputDirectoryPath("path/to/output/directory");
        PsdImageLayersExporter psdImageLayersExporter = new PsdImageLayersExporter(layerExporter);
        // TODO: Load a real PSD file in the next line using {@link com.aspose.psd.Image#load}
        PsdImage psdImage = new PsdImage(1, 1);
        try
        {
            psdImageLayersExporter.export(psdImage, new PngOptions());
        }
        finally
        {
            psdImage.dispose(); // Do not forget to dispose the document
        }
    }
}