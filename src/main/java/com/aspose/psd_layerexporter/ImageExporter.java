package com.aspose.psd_layerexporter;

import com.aspose.psd.Image;
import com.aspose.psd.ImageOptionsBase;

public interface ImageExporter<T extends Image>
{
    void export(T image, ImageOptionsBase options);
}
