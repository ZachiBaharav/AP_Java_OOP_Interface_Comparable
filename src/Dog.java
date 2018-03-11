
// https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
// https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-java.lang.Object:A-
// https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html

public class Dog extends Animal implements Comparable<Dog> {
    
    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }
    
    public String toString() {
        return super.toString() + " :: " + weight ;
    }
    
    public String getname() {
        return super.getName();
    }
    
    public int compareTo(Dog d) {
        return weight - d.weight;
        //return getName().compareTo(d.getName());
    }

}
