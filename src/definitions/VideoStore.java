/*   Created by IntelliJ IDEA.
 *   Author: Shivansh Gupta (Shivansh770)
 *   Date: 21-08-2020
 *   Time: 18:45
 *   File: VideoStore.java
 */

package definitions;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[5];
        // { null, null, null, null, null }
        // since every element is a Video object
        // { new Video(), new Video(), new Video(), new Video(), new Video() }
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video("Video " + (i + 1));
        }
    }

    public Video[] getStore() {
        return store.clone(); // a copy of the `store` array
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override //annotation
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    /**
     * This method will allow us to add a video to the video store.
     *
     * @param name The name of the video that we want to add.
     */
    public void addVideo(String name) {
        System.out.println("\"" + name + "\" is now added to the video store.");
    }

    /**
     * This method will allow us to rent a video from the video store.
     *
     * @param name The name of the video that we want to rent.
     */
    public void doCheckout(String name) {
        System.out.println("Thank you for renting \"" + name + "\".");
    }

    /**
     * This method will allow us to return a video to the video store.
     *
     * @param name The name of the video that we want to return.
     */
    public void doReturn(String name) {
        System.out.println("Thank you for returning \"" + name + "\".");
    }
}