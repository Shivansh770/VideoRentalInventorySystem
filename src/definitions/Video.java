/*   Created by IntelliJ IDEA.
 *   Author: Shivansh Gupta (Shivansh770)
 *   Date: 19-08-2020
 *   Time: 20:29
 *   File: Video.java
 */

package definitions;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    public Video() {
        this.videoName = "Golmall";
        this.rating = 5;
        this.checkOut = true;
    }

    public Video(String videoName, int rating) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = true;
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

    public String toString() {
        return String.format(
                "Video Name: %s, Video Rating: %d, Is Video Available: %b",
                getVideoName(), getRating(), isCheckOut()
        );
    }


}

