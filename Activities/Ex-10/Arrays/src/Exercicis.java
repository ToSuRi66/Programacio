import java.util.*;

public class Exercicis{
    public static void main (String [] args){

        System.out.println("Exercici: ");
        Scanner input = new Scanner(System.in);
        int exercici = input.nextInt();

        switch(exercici){
            case 5:
                int [] intArray;
                break;
            case 6:
                int [] intArray6 = new int[19];
                break;
            case 7:
                int [] intArray7 = new int [19];
                intArray7[0] = 2;
                break;
            case 8:
                int [] intArray8 = new int [19];
                intArray8[0] = 800;
                break;
            case 9:
                int [] intArray9 = new int [19];
                intArray9[2] = 17;
                break;
            case 10:
                Float [] arr1 = new Float[4];
                float [] arr2 = new float[4];
                Integer [] arr3 = new Integer[4];
                int [] arr4 = new int[4];
                double [] arr5 = new double[4];
                boolean [] arr6 = new boolean[4];
                break;
            case 11:
                String [] strArr = new String[10];
                strArr[0] = "Mary";
                strArr[1] = "had";
                strArr[2] = "a";
                strArr[3] = "little";
                strArr[4] = "lamb";
                break;
            case 12:
                String [] strArr12 = new String[10];
                strArr12[0] = "Mary";
                strArr12[1] = "had";
                strArr12[2] = "a";
                strArr12[3] = "little";
                strArr12[4] = "lamb";
                System.out.println("Array length: " + strArr12.length);
                break;
            case 13:
                int [] intArray01 = new int [50];
                System.out.printf("Array 01 length: %d\n", intArray01.length);
                break;
            case 19:
                int [] arr19 = new int [0];
                System.out.println(arr19.length);
                break;
            case 21:
                int [] intArray211 = new int[]{10,11,12,13,14};
                int [] intArray212 = Arrays.copyOf(intArray211, intArray211.length);
                System.out.printf("%d, %d, %d, %d, %d \n", intArray212[0], intArray212[1], intArray212[2], intArray212[3], intArray212[4]);
                break;
            case 22:
                int [] intArray221 = new int[]{10,11,12,13,14};
                int [] intArray222 = Arrays.copyOf(intArray221, intArray221.length);
                System.out.printf("%d, %d, %d, %d, %d \n", intArray222[0], intArray222[1], intArray222[2], intArray222[3], intArray222[4]);
                boolean equals = Arrays.equals(intArray221, intArray222);
                System.out.printf("Are equals? %b",equals);
                break;
            case 23:
                int [] intArray231 = new int[]{55,747,15000,89,2333};
                int [] intArray232 = Arrays.copyOfRange(intArray231,0,3);
                System.out.printf("intArray232 = %d, %d, %d with length of %d",intArray232[0],intArray232[1],intArray232[2],intArray232.length);
                break;
            case 24:
                int [] intArray241 = new int[]{55,747,15000,89,2333};
                int [] intArray242 = new int[intArray241.length];
                System.arraycopy(intArray241,0,intArray242,2,3);
                System.out.printf("Array 2 : %d ,%d ,%d, %d, %d",intArray242[0],intArray242[1],intArray242[2],intArray242[3],intArray242[4]);
                break;
            case 25:
                int [] intArray251 = new int[]{55,747,15000,89,2333};
                int [] intArray252 = new int[intArray251.length];
                System.arraycopy(intArray251,0,intArray252,2,3);
                System.out.printf("Array 2 : %s",Arrays.toString(intArray252));
                break;
            case 27:
                int [] intArray271 = new int[]{55,747,15000,89,2333};
                int [] intArray272 = new int[3];
                System.arraycopy(intArray271,0,intArray272,0,3);
                System.out.printf("1st Array length: %d\n",intArray271.length);
                System.out.println(Arrays.toString(intArray272));
                break;
            case 28:
                int [] intArray281 = new int[]{55,747,15000,89,2333};
                System.out.printf("Old length: %d\n",intArray281.length);
                intArray281 = Arrays.copyOfRange(intArray281,0,10);
                System.out.printf("New length: %d\n",intArray281.length);
                System.out.println(Arrays.toString(intArray281));
                break;
            case 29:
                int [] intArray291 = new int[]{17,42,43,8,23};
                intArray291 = Arrays.copyOfRange(intArray291,0,15);
                intArray291[intArray291.length-1] = 57;
                intArray291[intArray291.length-2] = 84;
                System.out.printf("New length: %d and new content %s", intArray291.length,Arrays.toString(intArray291));
                break;
            case 30:
                int [] intArray301 = new int[]{55,747,15000,89,2333};
                intArray301 = Arrays.copyOfRange(intArray301,2,5);
                System.out.println(intArray301.length);
                System.out.println(Arrays.toString(intArray301));
                break;
            case 32:
                int [] intArray32 = new int []{-1,-1,-1,-1,-1};
                System.out.printf("Content: %s",Arrays.toString(intArray32));
                break;
            case 33:
                int [] intArray33 = new int[]{55,747,15000,89,2333};
                Arrays.sort(intArray33);
                System.out.printf("Content sorted: %s",Arrays.toString(intArray33));
                break;
            case 34,36:
                int [] intArray34 = new int[]{55,747,15000,89,2333};
                Arrays.parallelSort(intArray34);
                System.out.printf("Content sorted: %s",Arrays.toString(intArray34));
                System.out.println("Ex: 36");
                int index36 = Arrays.binarySearch(intArray34,747);
                System.out.printf("The number 747 is in the %d position",index36+1);
                break;
            case 37:
                String s01 = "Hello how are you?";
                byte[] byteArray = s01.getBytes();
                System.out.printf("Length of the byte array: %d\n",byteArray.length);
                break;
            case 38,39:
                int [][] matrixA = new int [2][3];
                System.out.println(Arrays.toString(matrixA));
                break;
            case 40 ,41:
                int [][][][][] matrixB = new int[10][4][3][5][12];
                System.out.println(Arrays.toString(matrixB));
                break;
            case 42,43:
                int [][] matrix1 = new int[][]{{1,2,3},{4,5,6}};
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("%d ",matrix1[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                int [][] matrix2 = new int[][]{{5,5,8},{3,1,3}};
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("%d ",matrix2[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
                if(exercici == 42)break;
                int [][] matrix3 = new int[2][3];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.printf("%d ",matrix3[i][j]);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid number dumbaass!!");
        }

    }
}