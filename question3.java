package JavaPractice;

import java.util.Scanner;

class question3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        int num1 = 0, num2 = 1;
        
        System.out.print("First " + n + " terms of Fibonacci sequence: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");
            
            // Compute the next term
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
        scanner.close();
    }
}