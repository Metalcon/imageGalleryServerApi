package de.metalcon.imageGalleryServer.api;

import java.util.LinkedList;
import java.util.List;

/**
 * gallery information object to create galleries and use galleries read before
 * 
 * @author sebschlicht
 * 
 */
public class GalleryInfo {

    /**
     * number of images the gallery contains
     */
    protected int size;

    /**
     * images loaded from gallery<br>
     * (optional)
     */
    protected List<ImageInfo> imagesLoaded;

    /**
     * create empty gallery information
     */
    public GalleryInfo() {
        this(0, null);
    }

    /**
     * create gallery information
     * 
     * @param size
     *            number of images the gallery contains
     * @param imagesLoaded
     *            images loaded from gallery<br>
     *            (optional, may be <b>null</b>)
     */
    public GalleryInfo(
            int size,
            List<ImageInfo> imagesLoaded) {
        this.size = size;
        if (imagesLoaded != null) {
            this.imagesLoaded = imagesLoaded;
        } else {
            this.imagesLoaded = new LinkedList<ImageInfo>();
        }
    }

    /**
     * @return number of images the gallery contains
     */
    public int getSize() {
        return size;
    }

    /**
     * @return images loaded from gallery<br>
     *         (optional, may be empty)
     */
    public List<ImageInfo> getImagesLoaded() {
        return imagesLoaded;
    }
}
