import java.util.ArrayList;

public class ALTester {

    /* public static void Populate(int length) {
	int counter = 0;
	while (counter < length-1) {
	    ArrayList.add(counter);
	    counter += 1;
	}
	}*/
	
	

    public static void main(String[] args) {
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
        int counter = 0;
	while (counter < 22) {
	    foo.add((int)(Math.random()*100));
	    counter += 1;
	}
	System.out.println(foo);
    }
}
