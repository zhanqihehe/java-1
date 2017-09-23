package 作业2;
import java.util.Scanner;  
public class 作业2 {  
 public static void main(String[] args) {  
  Scanner input = new Scanner(System.in);  
  System.out.print("请输入:");  
  int n = input.nextInt();  
  int num[][] = new int[n][n];  
  int count = n % 2 == 0 ? n / 2 : n / 2 + 1;  
  int x = 0, y = 0;  
  int value = 1;  
  num[x][y] = value;  
  for (int i = 1; i <= count; i++) {  
   x++;  
   // 上 左起，先从上到下  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x++][y] = ++value;  
   }  
   x--;  
   y++;  
   // 下左起，先从左到右  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x][y++] = ++value;  
   }  
   y--;  
   x--;  
   // 从下右起，先从下到上  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x--][y] = ++value;  
   }  
   x++;  
   y--;  
   // 从上右起，先从右到左  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x][y--] = ++value;  
   }  
   y++;  
  }  
  for (int i = 0; i < num.length; i++) {  
   for (int j = 0; j < num[i].length; j++)  
  
    System.out.printf("%5d", num[i][j]);  
  
   System.out.println();  
  }  
 }  
}  

