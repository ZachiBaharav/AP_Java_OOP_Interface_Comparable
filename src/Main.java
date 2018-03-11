
// comparable: NOT part of the material for AP-CS, but potentially beneficial.
// Also, demonstrates interface class.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Dog[] D = new Dog[5];
        
        D[0] = new Dog("German Shepherd",80);
        D[1] = new Dog("Poodle",40);
        D[2] = new Dog("Labrdor",90);
        D[3] = new Dog("Viszla",50);
        D[4] = new Dog("Rhodesian Ridgeback",60);
        
        System.out.println("\nThe elements:\n");
        
        // for each loop:
        // aka enhanced for loop:
        //  Similar to:
        // for (int ii=0; ii<D.length ; ++ii){
        //    d = D[ii];
        // }
        // Drawback of for each:
        // 1. Cannot! do assignment into the array. d=new dog XX
        // 2. not access to the index
        // 3. only iterates forward in ones..
        
        for (Dog d : D) 
            System.out.println(d);
        
        Arrays.sort(D);
        
        System.out.println("\n\nThe elements SORTED:\n");
        for (Dog d : D) 
            System.out.println(d);
        
        
    }
    
    
}
