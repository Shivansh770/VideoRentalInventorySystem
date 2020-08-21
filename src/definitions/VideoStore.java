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


    public Video[] getStore() {
        return store.clone(); // a copy of the `store` array
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }


}