package app.com.toursguide;


import android.util.Log;

public class TourGuide {

    private String title;

    private String address;

    private String price;

    private String description;

    private String time;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;


    public TourGuide(String title, String description, String address, String time, String price, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.time = time;
        this.price = price;
        this.imageResourceId = imageResourceId;

    }

    public String getTitle() {
        return title;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }


    public boolean hasImage() {
        Log.v("hasImage", "word has image: " + (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice() {
        return getPrice() != null;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public boolean hasTime() {
        return getTime() != null;
    }

    @Override
    public String toString() {
        String output = getTitle() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPrice() + "\n" +
                getTime() + "\n" +
                getImageResourceId();

        return output;
    }
}
