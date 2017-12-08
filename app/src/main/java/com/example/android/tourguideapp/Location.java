package com.example.android.tourguideapp;

/** Location represents an attraction or place to eat that the user wants to go in Antwerp.
 * It contains an image, title text, summary text and number of stars depending on category.
 */

public class Location {

    /** Title text */
    private String mTitleText;

    /** Summary text */
    private String mSummaryText;

    /** Image resource ID */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Icon resource ID for the inside/outside attractions "for kids" and stars in "to eat" */
    private int mIconResourceId = NO_ICON_PROVIDED;

    private static final int NO_ICON_PROVIDED = -1;


    /**
     * Create a new Location object (constructor) with both texts and an image.
     *
     * @param titleText is title of the attraction or restaurant.
     * @param summaryText is the short summary of the attraction or restaurant.
     * @param imageResourceId is the image resource ID.
     */
    public Location(String titleText, String summaryText, int imageResourceId) {
        mTitleText = titleText;
        mSummaryText = summaryText;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a second Location object (constructor) with extra image - icon.
     *
     * @param titleText is title of the restaurant.
     * @param summaryText is the short summary of the attraction or restaurant.
     * @param imageResourceId is the image resource ID.
     * @param iconResourceId is the icon image resource ID.
     */
    public Location(String titleText, String summaryText, int imageResourceId, int iconResourceId) {
        mTitleText = titleText;
        mSummaryText = summaryText;
        mImageResourceId = imageResourceId;
        mIconResourceId = iconResourceId;
    }

    /**
     * Create a third Location object (constructor) with only two texts.
     *
     * @param titleText is title of the restaurant.
     * @param summaryText is the short summary.
     */
    public Location(String titleText, String summaryText) {
        mTitleText = titleText;
        mSummaryText = summaryText;
    }


    /**
     * Get the summary text of the location.
     *
     * @return current summary text in the Location.
     */
    public String getSummaryText() {
        return mSummaryText;
    }

    /**
     * Get the title text of the location.
     *
     * @return current title text in the Location.
     */
    public String getTitleText() {
        return mTitleText;
    }

    /**
     * Return the image resource ID for the location.
     *
     * @return current image in the Location (image or number of stars).
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the icon resource ID for the location.
     *
     * @return current icon in the Location (inside/outside).
     */
    public int getIconResourceId() {
        return mIconResourceId;
    }

    /**
     * Returns whether or not there is an icon for this location.
     *
     * @return current icon in the Location.
     */
    public boolean hasIcon() {
        return mIconResourceId != NO_ICON_PROVIDED;
    }

    /**
     * Returns whether or not there is an image for this location.
     *
     * @return current image in the Location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
