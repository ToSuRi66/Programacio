import java.util.Scanner;
import java.util.ArrayList;

public class Problemes {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Problema?");
        int problema = input.nextInt();

        switch(problema){
            case 1:
                double n1 = 0.0;
                double n2 = 0.0;
                System.out.println("Introdueix els dos nombres reals: ");
                n1 = input.nextDouble();
                n2 = input.nextDouble();
                if(n1 == n2){
                    System.out.printf("Els nombres son iguals: %.2f", n1);
                } else if(n1 > n2){
                    System.out.printf("%.2f es major que %.2f",n1,n2);
                } else if (n1 < n2){
                    System.out.printf("%.2f es menor que %.2f",n1,n2);
                }
                break;
            case 2:
                double r1 = 3.5;
                double r2 = 3.50;
                int p = 2;
                if (Math.abs (r1-r2) < p){
                    System.out.println("Iguals");
                }else{
                    System.out.println("Diferents");
                }
                break;
            case 3:
                double aceleracionGravedad = 9.8;
                System.out.print("Masa en grams (Max. 1Kg):");
                double masa = input.nextDouble();
                if (masa > 1000){
                    System.out.println("Se romperá el hilo.");
                    break;
                } else if (masa < 0) {
                    System.out.println("Invalid mass");
                    break;
                }
                System.out.println("Longitud del péndulo:");
                double longitud = input.nextDouble();
                double frecuencia = 1/(2*Math.PI);
                frecuencia = frecuencia * Math.sqrt(aceleracionGravedad / longitud);
                System.out.printf("La frecuencia será: %.4f", frecuencia);
                break;
            case 4:
                System.out.print("Nombre N:");
                int n = input.nextInt();
                int quadrat = 0;
                long resultat = 0;
                for(int i=1 ; i<=n ; i++){
                    quadrat = i*i;
                    resultat = resultat + quadrat;
                }
                System.out.printf("Resultat final: %d" , resultat);
                break;
            case 5:
                double media = 0.0;
                double notaMax = 0.0;
                ArrayList medias = new ArrayList();
                System.out.println("Cuantas notas tienes: ");
                int largo =  input.nextInt();
                for (int i = 0 ; i<largo;i++){
                    System.out.printf("Nota %d: ",i+1);
                    medias.add(input.nextDouble());
                }
                for(int i = 0; i<largo;i++){
                    media = media + (double)medias.get(i);
                    if ((double)medias.get(i) > notaMax){
                        notaMax = (double)medias.get(i);
                    }
                }
                media = media / largo;
                System.out.printf("La media es %.2f con una nota maxima de %.2f",media,notaMax);
                break;
            case 6:
                int numCifras = 0;
                int num = 0;
                int suma = 0;
                System.out.println("Introduce un numero entero: ");
                int numero = input.nextInt();
                System.out.printf("Has introducido el numero %d\n",numero);
                System.out.println("El numero invertido es: ");
                while(numero>0){
                    numCifras++;
                    num = numero%10;
                    suma = suma + num;
                    numero = numero / 10;
                    System.out.print(num);
                }
                System.out.printf("\nEl numero tiene %d cifras",numCifras);
                break;
            case 7:
                System.out.println("Numero de tipo byte: ");
                byte nb = input.nextByte();
                int count = 0;
                double numdb;
                double suma7 = 0.0;
                do{
                    numdb = input.nextDouble();
                    suma7 = suma7+numdb;
                    count++;
                } while(numdb == 0.0 || count != nb);
                double resultat7 = suma7 / (double)count;
                System.out.printf("Se han leído %d números, y la media es %.2f",count,resultat7);
                break;
            case 8:
                System.out.println("Mirar codigo");
                /*
                while (i<n){
                j=Integer.parseInt(leer.readLine())
                if(j==-1) i=n;
                i++
                }
                */
                break;
            case 9:
                int m9 = 0, d9;
                while (m9 <=3){
                    m9++;
                    d9 =1;
                    while(d9 <=5){
                        if (m9 ==2 && d9 >=4) {
                            d9++;
                        } else {
                            System.out.println(m9 +" "+ d9);
                            d9++;
                        }
                    }
                }
                break;
            case 10:
                
                break;
            default:
                System.out.println("Invalid number dumbass!!!");
                break;



        }
    }
}
