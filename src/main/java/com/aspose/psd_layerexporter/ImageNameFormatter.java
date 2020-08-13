package com.aspose.psd_layerexporter;

import com.aspose.psd.Image;
import com.aspose.psd.ImageOptionsBase;

public interface ImageNameFormatter<T extends Image>
{
    String format(T image, ImageOptionsBase options);
}
