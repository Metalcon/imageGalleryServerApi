package de.metalcon.imageGalleryServer.api;

/**
 * image information object to create images and use images read before
 * 
 * @author sebschlicht
 * 
 */
public interface ImageInfo {

    /**
     * @return timestamp of image upload
     */
    public long getTimestamp();

    /**
     * @return image identifier
     */
    public long getIdentifier();

    /**
     * @return URL image refers to<br>
     *         (optional, may be <b>null</b>)
     */
    public String getUrlLink();

    /**
     * @return image title<br>
     *         (optional, may be <b>null</b>)
     */
    public String getTitle();

    /**
     * @return additional meta data<br>
     *         (optional, may be <b>null</b>)
     */
    public String getMetaData();

}
