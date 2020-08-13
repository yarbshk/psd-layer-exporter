package com.aspose.psd_layerexporter;

import com.aspose.psd.ImageOptionsBase;
import com.aspose.psd.fileformats.psd.PsdImage;
import com.aspose.psd.fileformats.psd.layers.Layer;

/**
 * Exports all layers of a Photoshop document using {@link LayerExporter}.
 */
public class PsdImageLayersExporter implements ImageExporter<PsdImage>
{
    private LayerExporter layerExporter;

    public PsdImageLayersExporter(LayerExporter layerExporter)
    {
        this.layerExporter = layerExporter;
    }

    public void export(PsdImage psdImage, ImageOptionsBase options)
    {
        for (Layer layer : psdImage.getLayers())
        {
            layerExporter.export(layer, options);
        }
    }
}
