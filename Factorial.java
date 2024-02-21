public class Factorial{
public static void main(String[]args){
if(args.length>0){
int x=Integer.parseInt(args[0]);
System.out.println(factorial(x));
}else{
System.out.println("x");
}
}
public static int factorial(int n){
if(n==0 || n==1){
return 1;
}else{
return n*factorial(n-1);
}

}
}