package Singleton;

import lombok.Synchronized;

public class Journal {
    // Singelton : the goal is to have a One and only instance accessible by all the classes , we can manipulate the same object
    // Journal so all Operations will be saved in this Journal
    private static  Journal Jrnl;
    private Journal(){} ; // Private Constructor so he can t be accessed by the outside of the class





    // We add the
//    @Synchronized just to make sure that this block of code is Thread safe , and Synchronised that s mean that
    // two threads will not access at the same time to creating a new instance
    @Synchronized
    public static Journal getInstance(){

        if(Jrnl==null){
            return new Journal();
        }else{
            return Jrnl; // return the same object if the object was already created
        }

    }
}
