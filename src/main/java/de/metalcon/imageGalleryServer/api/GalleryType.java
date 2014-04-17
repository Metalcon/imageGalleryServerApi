package de.metalcon.imageGalleryServer.api;

/**
 * gallery types to specify how the image will be/was linked
 * 
 * @author sebschlicht
 * 
 */
public enum GalleryType {

    /**
     * images linked to an entity in general
     */
    ALL,

    /**
     * images in news feed
     */
    NEWS_FEED,

    /**
     * images in wiki editor
     */
    WIKI;

}
