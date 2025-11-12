import java.util.Scanner;
import java.lang.Math;

public class Exercicis {
    public static void main(String[]args){

        int count,a,b,i,j,k,x,result,index;
        String unio;
        char caracter;
        boolean condicio;
        int[] intArray01 = new int[]{18,42,26,44,55};
        int[] intArray16 = new int[15];

        Scanner input = new Scanner(System.in);
        System.out.println("Exercici?");
        int exercici = input.nextInt();

        switch (exercici){
            case 1:
                count = 0;
                while(count <10){
                    System.out.println(count);
                    count++;
                }
                break;
            case 2:
                count = 1;
                while(count <= 15000){
                    System.out.println(count);
                    count++;
                }
                break;
            case 3:
                i = 0;
                while(i < 5){
                    System.out.println(intArray01[i]);
                    i++;
                }
                break;
            case 4:
                i = 4;
                while(i>=0){
                    System.out.println(intArray01[i]);
                    i--;
                }
                break;
            case 7:
                for(x = 2;x<=10;x++) {
                    System.out.println(x);
                }
                break;
            case 14:
                for(i = 0;i<intArray01.length;i++)
                    System.out.printf("intArray01[%d] = %d\n",i,intArray01[i]);
                break;
            case 15,18:
                for(i = intArray01.length-1;i>=0;i--)
                    System.out.printf("intArray01[%d] = %d\n",i,intArray01[i]);
                break;
            case 16:
                for (i = 0;i<intArray16.length;i++) {
                    int numRand = (int) (Math.random() * 50000);
                    intArray16[i] = numRand;
                }
                x = 0;
                System.out.print("Els nombres son: ");
                while (x < intArray16.length){
                    System.out.printf(" , index - %d == %d",x,intArray16[x]);
                    x++;
                }
                break;
            case 17:
                for (x = 0;x < intArray01.length;x++) System.out.println(intArray01[x]);
                break;
            case 19:
                index = 0;
                for(int item : intArray01){
                    if(index % 2 == 0){
                        System.out.printf("intArray01[%d] = %d\n",index,item);
                    }
                    index++;
                }
                break;
            case 20:
                for(x = 0; x < intArray01.length ; x += 2){
                    System.out.printf("intArray01[%d] = %d\n",x,intArray01[x]);
                }
                break;
            case 21:
                x = 0;
                while(x < intArray01.length){
                    System.out.printf("intArray01[%d] = %d\n",x,intArray01[x]);
                    x+=2;
                }
                break;
            case 23:
                x = 1;
                do{
                    System.out.println(x);
                    x++;
                }while(x <= 10);
                break;
            case 24:
                result = 1;index = 1;
                do{
                    result = result * index;
                    index++;
                }while(index < 10);
                System.out.printf("%d! = %d\n",10,result);
                break;
            case 25:
                condicio = false;
                while(!condicio){
                    System.out.println("Hello!");
                }
                break;
            case 26:
                x = 0;
                for (condicio = false; !condicio; x++){
                    System.out.println("Hello! " + x);
                }
                break;
            case 28:
                caracter = 'A';
                for(j = 1; j < 6 ; j++){
                    for(k = 1; k < 5; k++){
                        System.out.printf("(%c,%d) ",caracter,k);

                    }
                    caracter++;
                    System.out.println();
                }
                break;
            case 29:
                for( x = 1 ; x < 1000 ; x++){
                    System.out.println(x);
                    if(x == 10) break;
                }
                break;
            case 31:
                for( x = 1 ; x < 50 ; x++ ){
                    if( x % 5 == 0 ){
                        continue;
                    } else {
                        System.out.println( x );
                    }
                }
                break;
            case 34:
                String[] charArray = new String[]{"A","B","C"};
                PUNTO_A:{
                    for( j = 0 ; j < charArray.length ; j++){
                        for( k = 1 ; k <= 10 ; k++ ){
                            unio = String.format("%s%d",charArray[j], k);
                            if(unio.equals("C5")){
                                break PUNTO_A;
                            }
                            System.out.printf("%s ",unio);
                        }
                        System.out.println();
                    }
                }
                System.out.print("\nJust saw a C5");
                break;
            case 36:
                String[] charArray01 = new String[]{"A","B","C","D","E"};
                for( j = 0 ; j < charArray01.length ; j++){
                    for (k = 1; k <= 10; k++) {
                        unio = String.format("%s%d", charArray01[j], k);
                        if (unio.equals("C5")) {
                            break;
                        }
                        System.out.printf("%s ", unio);
                    }
                    System.out.println();
                }
                break;
            case 37:
                int[][] matrix1 = new int[][] {{1,2,3},{4,5,6}};
                int[][] matrix2 = new int[][] {{5,5,8},{3,1,3}};
                int[][] resultMatrix = new int[2][3];
                for( a = 0 ; a < 2 ; a++){
                    for( b = 0 ; b < 3 ; b++){
                        resultMatrix[a][b] = matrix1[a][b] + matrix2[a][b];
                        System.out.printf("%d ",resultMatrix[a][b]);
                    }
                    System.out.println();
                }
                break;
            case 38:
                String[] cercles = new String[]{"o","oo","ooo","oooo","ooooo","oooooo","ooooooo","oooooooo"};
                for(i = 0 ; i < cercles.length ; i++){
                    System.out.printf("%-8s%8s\n",cercles[i],cercles[i]);
                }
                for (i = cercles.length-2 ; i >= 0; i--){
                    System.out.printf("%-8s%8s\n",cercles[i], cercles[i]);
                }
                break;
            case 39:
                String[] cercles1 = new String[]{"o","oo","ooo","oooo","ooooo","oooooo","ooooooo","oooooooo"};
                for(i = 0 ; i < cercles1.length ; i++){
                    System.out.printf("%-12s%s\n",cercles1[i],cercles1[i]);
                }
                break;
            case 40:
                String[] cercles2 = new String[]{"o","oo","ooo","oooo","ooooo","oooooo","ooooooo","oooooooo"};
                for(i = 0 ; i < cercles2.length ; i++){
                    System.out.printf("%-12s", cercles2[i]);
                    x = (cercles2.length-1)-i;
                    System.out.printf("%s\n",cercles2[x]);
                }
                break;
            case 41:
                String[] indeterminat = new String[]{"o","oo","ooo","oooo","ooooo","oooooo","ooooooo","oooooooo","ooooooo","oooooo","ooooo","oooo","ooo","oo","o"};
                int indetLlarg = indeterminat.length;
                int fieldwidth = indeterminat[0].length();
                for(i = 0 ; i < indetLlarg ; i++) {
                    if (fieldwidth < indeterminat[i].length()) {
                        fieldwidth = indeterminat[i].length();
                    }
                }
                for(x = 0 ; x < indetLlarg ; x++){
                    String frase = String.format("|%-"+fieldwidth+"s|",indeterminat[x]);
                    System.out.printf("%s\n",frase);
                }
                break;
            default:
                System.out.println("Invalid number dumbassss!!");
                break;
        }
    }
}
