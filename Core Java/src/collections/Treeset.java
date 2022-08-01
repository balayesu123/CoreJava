package collections;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

       TreeSet<Object> ts = new TreeSet<Object>();
       
       ts.add("bala");
       ts.add("yesu");
       ts.add("sunil");
       ts.add("shashank");
    //   ts.add(8); class cast exception
       
       // TreeSet dosen't allow the Heterogeneous data  throw 'class cast exception'
       // TreeSet follows sorted order means Alphabetical order
       // treeSet is case sensitive (it will follow sorted order when given data is either UPPER CASE or LOWWER CASE)
       //  ts.add(null); 
       //  TreeSet dosen't allow null values  throws 'NullPointerException'
       //  TreeSet dosen't allow duplicates
        //  Data structure is tree like Structure
       
       System.out.println(ts);
       

	}

}
