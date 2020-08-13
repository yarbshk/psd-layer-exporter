package com.aspose.psd_layerexporter;

import com.aspose.psd.ImageOptionsBase;
import com.aspose.psd.imageoptions.GifOptions;
import com.aspose.psd.imageoptions.JpegOptions;
import com.aspose.psd.imageoptions.PngOptions;

import java.util.HashMap;
import java.util.Map;

public enum ImageExtension
{
    PNG(PngOptions.class), JPG(JpegOptions.class), GIF(GifOptions.class);

    private final Class<? extends ImageOptionsBase> optionsClass;
    private static Map<Class<? extends ImageOptionsBase>, ImageExtension> cache =
            new HashMap<Class<? extends ImageOptionsBase>, ImageExtension>();

    ImageExtension(Class<? extends ImageOptionsBase> optionsClass)
    {
        this.optionsClass = optionsClass;
    }

    public static String getImageExtension(Class<? extends ImageOptionsBase> optionsClass)
    {
        return valueOf(optionsClass).toString().toLowerCase();
    }

    private static ImageExtension valueOf(Class<? extends ImageOptionsBase> optionsClass)
    {
        ImageExtension imageExtension = cache.get(optionsClass);
        if (imageExtension != null)
        {
            return imageExtension;
        }

        for (ImageExtension value : values())
        {
            if (value.optionsClass.equals(optionsClass))
            {
                cache.put(optionsClass, value);
                return value;
            }
        }

        throw new RuntimeException("Unsupported image options class");
    }
}
