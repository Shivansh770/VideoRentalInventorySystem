/*   Created by IntelliJ IDEA.
 *   Author: Shivansh Gupta (Shivansh770)
 *   Date: 19-08-2020
 *   Time: 20:29
 *   File: Video.java
 */

package definitions;

import java.util.Objects;

public class Video {

    // Components of a Definition Class in Java
    // 1. private fields
    // 2. public getters & setters
    // 3. Constructors for initializing the fields.
    // 4. toString() method
    // 5. equals() and hashCode() method

    private String videoName;
    private boolean checkOut;
    private int rating;

    public Video() {
        this.videoName = "Golmall";
        this.rating = 5;
        this.checkOut = true;
    }

    public Video(String videoName) {
        this.videoName = videoName;
        this.rating = 1;
        this.checkOut = true;
    }

    public Video(String videoName, boolean checkOut, int rating) {
        this.videoName = videoName;
        this.checkOut = checkOut;
        this.rating = rating;
    }

    public Video(String videoName, int rating) {
        this.videoName = videoName;
        this.rating = rating;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }


    /**
     * This method will allow the customer to rent a video.
     */
    public void doCheckout() {
        System.out.println("Thank you for renting.");
    }

    /**
     * This method will allow the customer to return a video.
     */
    public void doReturn() {
        System.out.println("Thank you for returning.");
    }

    // The purpose of these "special" methods is already defined.
    // So, we do not have to write the documentation comments.

    @Override
    public String toString() {
        return String.format(
                "Video Name: %s, Video Rating: %d, Is Video Available: %b",
                getVideoName(), getRating(), isCheckOut()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) //comparing the reference value of two reference variables
            //both the  reference variables are refering to the same object.
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return isCheckOut() == video.isCheckOut() &&
                getRating() == video.getRating() &&
                Objects.equals(getVideoName(), video.getVideoName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), isCheckOut(), getRating());
    }
}

