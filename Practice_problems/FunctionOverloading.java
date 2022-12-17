


public class FunctionOverloading {
    public static void main(String[] args) {
        
       int ans =  sum(1,2); //prints 3
        ans = sum(1,2,3);//updates ans to 6
        // sum(1,2,3,4); this will give error 
        /*Because the the compiler would say there is not method that takes four arguments */
        
        System.out.println(ans);
    }    
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    
}
