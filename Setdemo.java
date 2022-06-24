import java.util.*;
public class Setdemo {
    public static void main(String[] args) {
        Set <Integer> s=new HashSet <Integer>();
        List<Integer> a=new ArrayList<Integer>();
        a.add(3);
        a.add(9);
        a.add(5);
        s.add(1);
        s.addAll(Arrays.asList(new Integer[] {2,3,4,5,1,6}));
       // System.out.println(a.getClass().getSimpleName());
        for(int i:s){
            System.out.print(i+" ");
        }
        //checking contains
        if(s.contains(5)){
            System.out.println("COntains checked");

        }
        //checking contains all
        if(!(s.containsAll(a))){
            System.out.println("CONTAINS ALL CHECKED");
        }
        //CHECKING ITERATOR
        Iterator <Integer> it=s.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
        //checking remove and remove all
        s.remove(6);
        System.out.println(s);
        s.removeAll(a);
        System.out.println(s);
        System.out.println(a);

        Object[] arr = s.toArray();
        int ar[]=new int[arr.length];
        for(int i=0;i<ar.length;i++){
            ar[i]=(int)arr[i];
        }
        for(int i:ar){
            System.out.print(i+" ");
        }

        
    }
}