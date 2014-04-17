package de.metalcon.imageGalleryServer.api;

import java.io.Serializable;

/**
 * image information object to create images and use images read before
 * 
 * @author sebschlicht
 * 
 */
public class ImageInfo implements Serializable {

    private static final long serialVersionUID = 5459142068613276422L;

    protected long timestamp;

    protected long identifier;

    protected String urlLink;

    protected String title;

    protected String metaData;

    public ImageInfo(
            long timestamp,
            long identifier,
            String urlLink,
            String title,
            String metaData) {
        this.timestamp = timestamp;
        this.identifier = identifier;
        this.urlLink = urlLink;
        this.title = title;
        this.metaData = metaData;
    }

    /**
     * @return timestamp of image upload
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @return image identifier
     */
    public long getIdentifier() {
        return identifier;
    }

    /**
     * @return URL image refers to<br>
     *         (optional, may be <b>null</b>)
     */
    public String getUrlLink() {
        return urlLink;
    }

    /**
     * @return image title<br>
     *         (optional, may be <b>null</b>)
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return additional meta data<br>
     *         (optional, may be <b>null</b>)
     */
    public String getMetaData() {
        return metaData;
    }

}
