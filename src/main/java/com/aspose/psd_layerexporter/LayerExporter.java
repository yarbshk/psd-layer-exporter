package com.aspose.psd_layerexporter;

import com.aspose.psd.ImageOptionsBase;
import com.aspose.psd.fileformats.psd.layers.Layer;

/**
 * Exports a layer into a file format that corresponds {@link ImageOptionsBase}.
 * <p>
 * This class exports the layer into a working directory by default. You can set any existing
 * directory for storing the exported layer.
 */
public class LayerExporter implements ImageExporter<Layer>
{
    private ImageNameFormatter<Layer> filenameFormatter;
    private String outputDirectoryPath;

    public LayerExporter(ImageNameFormatter<Layer> filenameFormatter)
    {
        this.filenameFormatter = filenameFormatter;
        this.outputDirectoryPath = "";
    }

    public void export(Layer layer, ImageOptionsBase options)
    {
        String filename = filenameFormatter.format(layer, options);
        layer.save(FileUtils.joinPaths(outputDirectoryPath, filename), options);
    }

    public String getOutputDirectoryPath()
    {
        return outputDirectoryPath;
    }

    public void setOutputDirectoryPath(String outputDirectoryPath)
    {
        this.outputDirectoryPath = outputDirectoryPath;
    }
}
