package de.metalcon.imageGalleryServer.api.responses;

import de.metalcon.api.responses.SuccessResponse;
import de.metalcon.imageGalleryServer.api.GalleryInfo;

public class GalleryResponse extends SuccessResponse {

    private static final long serialVersionUID = -1827045202731272431L;

    protected GalleryInfo galleryInfo;

    public GalleryResponse(
            GalleryInfo galleryInfo) {
        this.galleryInfo = galleryInfo;
    }

    public GalleryInfo getGalleryInfo() {
        return galleryInfo;
    }

}
