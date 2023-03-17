package zzapr;

public class W04MatrixMain {
    public static void main(String[] args) {
        W04Matrix matrixA = new W04Matrix(4, 3);
        matrixA.generateRandomElements(-20, 20);

        System.out.println("matrix A:");
        System.out.println(matrixA);

        W04Matrix matrixB = new W04Matrix(4, 3);
        matrixB.generateRandomElements(-20, 20);

        System.out.println("Matrix B:");
        System.out.println(matrixB);


        W04Matrix matrixC = matrixA.sumMatrix(matrixB);
        if (matrixC != null) {
            System.out.print("matrix A + matrix B:\n");
            System.out.println(matrixC);
        }

        W04Matrix matrixD = matrixA.multiMatrix(matrixB);
        if (matrixC != null) {
            System.out.print("matrix A * matrix B:\n");
            System.out.println(matrixD);
        }

    }
}

