package com.example.android.tourguideapp;

/** Word represents an attraction or place to eat that the user wants to go in Antwerp.
 * It contains an image, text and number of stars depending on category.
 */

public class Word {

    /** Title text for attraction or restaurant */
    private String mTitleText;  //mDefaultTranslation

    /** Summary text for attraction or restaurant */
    private String mSummaryText;   //mMiwokTranslation

    /** Image resource ID for the attraction or restaurant */
    private int mImageResourceId;

    /** Icon resource ID for the inside/outside attractions for kids */
    private int mIconResourceId = NO_ICON_PROVIDED;

    private static final int NO_ICON_PROVIDED = -1;


    /**
     * Create a new Word object (constructor) with an image or number of stars.
     *
     * @param titleText is title of the attraction or restaurant.
     * @param summaryText is the short summary of the attraction or restaurant.
     * @param imageResourceId is the image resource ID or number of stars.
     */
    public Word(String titleText, String summaryText, int imageResourceId) {
        mTitleText = titleText;
        mSummaryText = summaryText;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a second Word object (constructor) with icon inside/outside.
     *
     * @param titleText is title of the restaurant.
     * @param summaryText is the short summary of the restaurant.
     * @param imageResourceId is the image resource ID.
     * @param iconResourceId is the icon image resource ID.
     */
    public Word(String titleText, String summaryText, int imageResourceId, int iconResourceId) {
        mTitleText = titleText;
        mSummaryText = summaryText;
        mImageResourceId = imageResourceId;
        mIconResourceId = iconResourceId;
    }


    /**
     * Get the summary text of the word.
     *
     * @return current summary text in the Word.
     */
    public String getSummaryTexy() {
        return mSummaryText;
    }

    /**
     * Get the title text of the word.
     *
     * @return current title text in the Word.
     */
    public String getTitleText() {
        return mTitleText;
    }

    /**
     * Return the image resource ID for the word.
     *
     * @return current image in the Word (image or number of stars).
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the icon resource ID for the word.
     *
     * @return current icon in the Word (inside/outside).
     */
    public int getIconResourceId() {
        return mIconResourceId;
    }

    /**
     * Returns whether or not there is an icon for this word.
     *
     * @return current icon in the Word.
     */
    public boolean hasIcon() {
        return mIconResourceId != NO_ICON_PROVIDED;
    }
}




