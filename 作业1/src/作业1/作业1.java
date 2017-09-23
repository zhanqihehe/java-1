package 作业1;

public class 作业1 {
	public static void main(String[] args) {
		doubleNum(1237);	
    }
     
    public static void doubleNum(int n){
        System.out.println(n);
        if (n <= 5000) {
            doubleNum(n * 2);
            System.out.println(n);
        }
    }
}