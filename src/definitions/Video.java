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

    public String getVideoName() {
        return videoName;
    }

    public int getRating() {
        return rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

