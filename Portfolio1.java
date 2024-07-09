Public class portfolio {

int[][] A = {{11, 16, 21, 26, 31},
             {12, 17, 22, 27, 32},
             {13, 18, 23, 28, 33},
             {14, 19, 24, 29, 34},
             {15, 20, 25, 30, 35}};
System.out.println("Array A:");
//Display Array A using a nested loop:

for(int i = 0; i < A.length; i++) {
    for(int j = 0; j < A[0].length; j++) {
        System.out.print(A[i][j] + "\t");
    }
    System.out.println();
}

//Calculate the sum of the elements in the 3rd row:
int sumRow3 = 0;
for(int j = 0; j < A[2].length; j++) {
    sumRow3 += A[2][j];
}
System.out.println("Sum of elements in row 3: " + sumRow3);

//Find the largest value in the first column:
int maxFirstCol = A[0][0];
for(int i = 1; i < A.length; i++) {
    if(A[i][0] > maxFirstCol) {
        maxFirstCol = A[i][0];
    }
}
System.out.println("Largest value in the first column: " + maxFirstCol);

//Create a One-Dimensional Array B to become the sum of each column from Array A:
int[] B = new int[A[0].length];
for(int j = 0; j < A[0].length; j++) {
    int sumCol = 0;
    for(int i = 0; i < A.length; i++) {
        sumCol += A[i][j];
    }
    B[j] = sumCol;
}
System.out.println("Array B (sum of each column in Array A):");
for(int j = 0; j < B.length; j++) {
    System.out.print(B[j] + "\t");
}
System.out.println();

//Add each element of rows 2 and 3 to replace row 3:
for(int j = 0; j < A[2].length; j++) {
    A[2][j] += A[1][j] + A[2][j];
}
System.out.println("Array A with row 3 replaced by sum of rows 2 and 3:");
for(int i = 0; i < A.length; i++) {
    for(int j = 0; j < A[0].length; j++) {
        System.out.print(A[i][j] + "\t");
    }
    System.out.println();
}

//Interchange columns 3 and 4:
for(int i = 0; i < A.length; i++) {
    int temp = A[i][2];
    A[i][2] = A[i][3];
    A[i][3] = temp;
}
System.out.println("Array A with columns 3 and 4 interchanged:");
for(int i = 0; i < A.length; i++) {
    for(int j = 0; j < A[0].length; j++) {
        System.out.print(A[i][j] + "\t");
    }
    System.out.println();
}
}