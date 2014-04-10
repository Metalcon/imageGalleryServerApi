package de.metalcon.imageGalleryServer.api.requests;

import de.metalcon.domain.Muid;

public class RequestAllImages extends GalleryServerRequest {

    private static final long serialVersionUID = 2483079666464162477L;

    protected long entityId;

    public RequestAllImages(
            Muid muid) {
        entityId = muid.getValue();
    }

    public long getEntityId() {
        return entityId;
    }

}
