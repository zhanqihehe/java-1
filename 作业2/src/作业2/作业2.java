package ��ҵ2;
import java.util.Scanner;  
public class ��ҵ2 {  
 public static void main(String[] args) {  
  Scanner input = new Scanner(System.in);  
  System.out.print("������:");  
  int n = input.nextInt();  
  int num[][] = new int[n][n];  
  int count = n % 2 == 0 ? n / 2 : n / 2 + 1;  
  int x = 0, y = 0;  
  int value = 1;  
  num[x][y] = value;  
  for (int i = 1; i <= count; i++) {  
   x++;  
   // �� �����ȴ��ϵ���  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x++][y] = ++value;  
   }  
   x--;  
   y++;  
   // �������ȴ�����  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x][y++] = ++value;  
   }  
   y--;  
   x--;  
   // ���������ȴ��µ���  
   while (x < n && x >= 0 && y < n && y >= 0) {  
    if (num[x][y] != 0)  
     break;  
    num[x--][y] = ++value;  
   }  
   x++;  
   y--;  
   // ���������ȴ��ҵ���  
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

