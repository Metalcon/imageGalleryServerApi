package de.metalcon.imageGalleryServer.api.requests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import de.metalcon.imageGalleryServer.api.GalleryType;
import de.metalcon.imageGalleryServer.api.ImageInfo;

public class CreateImageRequest extends GalleryServerRequest {

    private static final long serialVersionUID = -2005239094241010944L;

    protected ImageInfo imageInfo;

    protected byte[] rawImage;

    protected GalleryType galleryType;

    protected Long galleryId;

    private CreateImageRequest(
            ImageInfo imageInfo,
            InputStream imageStream) {
        this.imageInfo = imageInfo;
        rawImage = loadImageFromStream(imageStream);
    }

    public CreateImageRequest(
            ImageInfo imageInfo,
            InputStream imageStream,
            GalleryType galleryType) {
        this(imageInfo, imageStream);
        this.galleryType = galleryType;
        galleryId = null;
    }

    public CreateImageRequest(
            ImageInfo imageInfo,
            InputStream imageStream,
            long galleryId) {
        this(imageInfo, imageStream);
        galleryType = null;
        this.galleryId = galleryId;
    }

    public GalleryType getGalleryType() {
        return galleryType;
    }

    public Long getGalleryId() {
        return galleryId;
    }

    public ImageInfo getImageInfo() {
        return imageInfo;
    }

    public InputStream getImageStream() {
        return new ByteArrayInputStream(rawImage);
    }

    private static byte[] loadImageFromStream(InputStream imageStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int numBytesRead;
        byte[] buffer = new byte[4096];

        try {
            while ((numBytesRead = imageStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, numBytesRead);
            }
            imageStream.close();

            outputStream.flush();
            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to read image stream:\""
                    + e.getMessage());
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                // failed to close output stream
            }
        }
    }

}
