package methods;
import java.util.Scanner; 
public class scenner {
public static void main(String args[]) {
scenner obj=new scenner();
int a=25;
int b=68;
obj.sum(25, 68);
int c=99;
int d=54;
obj.sub(99, 68);
int e=99;
int f=9;
obj.div(99, 68);


}
public void sum(int a, int b) {
	System.out.println(a+b);
}
public void sub(int c, int d) {
	System.out.println(c-d);
}
public void div(int e, int f) {
	System.out.println(e/f);
}
}
