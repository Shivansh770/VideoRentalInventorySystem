/*   Created by IntelliJ IDEA.
 *   Author: Shivansh Gupta (Shivansh770)
 *   Date: 20-08-2020
 *   Time: 13:39
 *   File: Main.java
 */

package execution;

import definitions.Video;


public class Main {
    public static void main(String[] args) {
        Video video = new Video("I Robot", 4);
        Video video1 = new Video("Transformers", 5);
        //we would like to check objext are equal or not
        //1..if both the objects(reference variable) refer to same object.

//          if (video==video1) {
//          System.out.println("Equal");
//          }else{
//           System.out.println("Not Equal");
//        }
        //2. if both the objects are from same class AND if the feilds of both objects have exact same value

//        String name ="Shivansh";
//        if(video.getClass().equals(video1.getClass())) {
//            System.out.println("They are from same class!");
//            if(
//                    video.getRating()==video1.getRating() &&
//                            video.isCheckOut()==video1.isCheckOut() &&
//                            video.getVideoName().equals(video1.getVideoName())
//            ){
//                System.out.println("the objects are equal");
//            }
//        }else{
//            System.out.println(" i am from the" + video.getClass().getName() + "class.");
//            System.out.println(" you are from the" + video1.getClass().getName() + "class.");
//            System.out.println("We are not same bro!");
//        }
    }
}