package com.aspose.psd_layerexporter;

import com.aspose.psd.ImageOptionsBase;
import com.aspose.psd.fileformats.psd.layers.Layer;
import com.aspose.psd.imageoptions.GifOptions;
import com.aspose.psd.imageoptions.JpegOptions;
import com.aspose.psd.imageoptions.PngOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ImageNameFormatterImplTest
{

    @Test(dataProvider = "testFormatParameters")
    public void testFormat(String layerName, String expFilename, ImageOptionsBase options)
    {
        // Assign
        ImageNameFormatterImpl filenameFormatter = new ImageNameFormatterImpl();
        Layer layer = new Layer();
        layer.setName(layerName);
        // Act
        String filename = filenameFormatter.format(layer, options);
        // Assert
        assertEquals(filename, expFilename);
    }

    @DataProvider
    public Object[][] testFormatParameters() {
        return new Object[][] {
                {"Layer 1", "Layer 1.png", new PngOptions()},
                {"Layer 1", "Layer 1.jpg", new JpegOptions()},
                {"Layer 1", "Layer 1.gif", new GifOptions()},
        };
    }
}