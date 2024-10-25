import java.util.*;
class matrixCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1,m2,n1,n2;
        System.out.println("\n---- MATRIX CALCULATOR ----\n");
        System.out.println("NOTE: Values of m and n must be greater than 0.\n");
        System.out.println("Enter m1 and n1 (rows x columns) for the first matrix:\n");
        System.out.print("m1: ");
        m1=sc.nextInt();
        System.out.print("n1: ");
        n1=sc.nextInt();
        int arr1[][]=new int[m1][n1];
        // Taking Input For First Matrix
        System.out.print("Enter matrix elements: " );
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nEnter m2 and n2 (rows x columns) for the second matrix:\n");
        System.out.print("m2: ");
        m2=sc.nextInt();
        while(m2!=n1){
            System.out.println("\nAlert! m2 must be equal to n1!\n");
            System.out.print("m2: ");
            m2=sc.nextInt();
        }

        System.out.print("n2: ");
        n2=sc.nextInt();
        int arr2[][]=new int[m2][n2];

        // Taking Input For Second Matrix
        System.out.print("Enter matrix elements: " );
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nChoose Subtraction Order --\n1. First Matrix - Second Matrix\n2. Second Matrix - First Matrix\n");
        System.out.print("Choose (1/2):");
        int choice=sc.nextInt();
        while(choice != 1 && choice !=2){
            System.out.println("You must choose between 1 and 2 only!");
            System.out.print("Choose (1/2):");
            choice=sc.nextInt();
        }
        // Printing First Matrix
        System.out.println("\nFirst Matrix:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println("");
        }

        // Printing Second Matrix
        System.out.println("\nSecond Matrix:");
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println("");
        }

        // Matrix Additon Logic
        System.out.println("\nMatrix Addition:");
        if(m1 != m2 || n1 != n2){
            System.out.println("The matrix dimensions are incompatible for addition.\n");
        }
        else{
            for(int i=0;i<m1;i++){
                for(int j=0;j<n1;j++){
                    System.out.print(arr1[i][j]+arr2[i][j]+"\t");
                }
                System.out.println("");
            }
        }

        // Matrix Subtraction Logic
        System.out.println("\nMatrix Subtraction:");
        switch(choice){
            case 1 -> {
                if(m1 != m2 || n1 != n2){
                    System.out.println("Dimensions are not same! Hence matrix subtraction cannot be performed!\n");
                }
                else{
                    for(int i=0;i<m1;i++){
                        for(int j=0;j<n1;j++){
                            System.out.print(arr1[i][j]-arr2[i][j]+"\t");
                        }
                        System.out.println("");
                    }
                }
            }
            case 2 -> {
                if(m1 != m2 || n1 != n2){
                    System.out.println("Dimensions are not same! Hence matrix subtraction cannot be performed!\n");
                }
                else{
                    for(int i=0;i<m1;i++){
                        for(int j=0;j<n1;j++){
                            System.out.print(arr2[i][j]-arr1[i][j]+"\t");
                        }
                        System.out.println("");
                    }
                }
            }
        }

        // Matrix Multiplication Logic
        int arr_mult[][]=new int[m1][n2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                int sum=0;
                for(int k=0;k<n1;k++){
                    sum += arr1[i][k]*arr2[k][j];
                }
                arr_mult[i][j]=sum;
            }
        }

        // Matrix multiplication Result
        System.out.println("\nMatrix Multiplication:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr_mult[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n---- THANK YOU! (`-`) ----\n");
        sc.close();
    }
}
