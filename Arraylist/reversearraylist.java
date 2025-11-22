import java.util.*;
public class reversearraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            l1.add(val);
        }

        for(int i=n-1;i>=0;i--){
            System.out.print(l1.get(i)+" ");
        }
        //FOR SORTING AN ARRAYLIST WE CAN USE Collections.sort(listname)
        //THIS WILL SORT ARRAYLIST IN ASCENDING ORDER
        //TO SORT THE ARRAYLIST IN DESCENDING ORDER WE CAN USE
        //Collections .sort(listname,Collections.reverseOrder());
                    }

}