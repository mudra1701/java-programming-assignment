
import java.util.*;
class Matrix {
    int rows, cols;
    int[][] mat;
    Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[rows][cols];
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    Matrix transpose() {
        Matrix t = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    Matrix multiply(Matrix m) {
        if (this.cols != m.rows) {
            
System.out.println("Multiplication not possible");
            return null;
        }
        Matrix result = new Matrix(this.rows, m.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                result.mat[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.mat[i][j] += this.mat[i][k] * m.mat[k][j];
                }
            }
        }
        return result;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of Matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        Matrix m1 = new Matrix(r1, c1);
        m1.input();
        System.out.print("Enter rows and columns of Matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        Matrix m2 = new Matrix(r2, c2);
        m2.input();
        System.out.println("\nMatrix 1:");
        m1.display();
        System.out.println("\nMatrix 2:");
        m2.display();
        System.out.println("\nTranspose of Matrix 1:");
        Matrix t = m1.transpose();
        t.display();

        // Multiplication
        System.out.println("\nMultiplication Result:");
     
   Matrix result = m1.multiply(m2);
        if (result != null) {
            result.display();
        }
    }
}
