import java.util.Arrays;

public class ChangeVariable{
public static void main(String[] args) {
    
    //creating an array
    int [] arr = {1,2,3,4};
    change (arr);
    System.out.println(Arrays.toString(arr));
}

 static void change(int[] nums) {
    nums[0]=99;
    /*if you make a change to the object via thsi ref variable ,
     Same object will be changed



     In case of Strings 
     it is not possible, because the strings are immutable
    */
}

}