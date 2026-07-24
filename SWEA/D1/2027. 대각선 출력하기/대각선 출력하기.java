import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        char[][] arr = new char[5][5];
        
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 5; j++) {
            	if (i == j) {
                	arr[i][j] = '#';
                } else {
                    arr[i][j] = '+';
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < 5; j++) {
            	System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	}
}