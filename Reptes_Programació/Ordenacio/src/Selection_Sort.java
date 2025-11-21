import java.util.Arrays;

public class Selection_Sort {
    public static void main (String[]args){

        int [] llistaNum = new int[]{5,1,12,-5,16,2,12,14};

        ordenar(llistaNum);


    }
    public static void ordenar(int[] llistaNum){

        int numPosPet = 0;
        int numPet = 0;

        for (int i = 0; i < llistaNum.length; i++) {
            numPet = llistaNum[i];
            for (int j = i; j < llistaNum.length-1; j++) {
                if (numPet == llistaNum[j]){
                    numPet = llistaNum[j];
                    numPosPet = j;
                } else if(numPet > llistaNum[j+1]){
                    numPet = llistaNum[j+1];
                    numPosPet = j+1;
                }
                System.out.printf("despres de if %d\n",numPet);

            }
            System.out.printf("For extern %d\n",i);
            llistaNum[numPosPet] = llistaNum[i];
            llistaNum[i] = numPet;
            System.out.println(Arrays.toString(llistaNum));
        }

    }
}
