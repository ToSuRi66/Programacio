import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

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
                System.out.print("Numero entero: ");
                int num10Og = input.nextInt();
                int num10 = Math.abs(num10Og);
                int countAnillos = 0;
                if (num10 == 0){
                    countAnillos++;
                    break;
                }
                while(num10 > 0){
                    int num10Ud = num10%10;
                    switch(num10Ud){
                        case 0,6,9:
                            countAnillos++;
                            break;
                        case 8:
                            countAnillos = countAnillos + 2;
                            break;
                    }
                    num10 = num10 / 10;
                }
                System.out.printf("El numero %d contiene %d anillos.",num10Og,countAnillos);
                break;
            case 11:
                System.out.println("Mirar codigo");
                /*
                int j = 0;
                int i = 0;
                do{
                    i = metodo1();
                    if(i==-1) j=n-1;
                    j+=i;
                }while(j<n);
                */
                break;
            case 12:
                double valorConc = 0.0;
                final double KA = 0.0;
                double pKA = Math.log10(KA)*-1;

                break;
            case 13:
                System.out.println("Codigo rehecho");
                int index = 1;
                do{
                    System.out.println(index++);
                } while (index < 10);
                break;
            case 14:
                System.out.print("Numero para el productorio: ");
                int num14 = input.nextInt();
                int resultat14 = 1;
                for (int i = 1; i <= num14; i++) {
                    resultat14 = i * resultat14;
                }
                System.out.printf("El productorio de %d es: %d",num14,resultat14);
                break;
            case 15:
                int dia = 0,mes = 0,ano = 0,sumaDias = 0,diasRestan = 0;
                boolean bisiesto = false;
                System.out.print("Dia: ");dia = input.nextInt();
                System.out.print("Mes: ");mes = input.nextInt();
                System.out.print("Año: ");ano = input.nextInt();
                if(dia <= 0 || mes <= 0 ||ano <= 0){
                    break;
                }
                if (ano%4 == 0) bisiesto = true;
                for (int i = 1; i < mes; i++) {
                    switch(i){
                        case 4,6,9,11:
                            sumaDias = sumaDias + 30;
                            break;
                        case 1,3,5,7,8,10,12:
                            sumaDias = sumaDias + 31;
                            break;
                        case 2:
                            if (bisiesto){
                                sumaDias = sumaDias + 29;
                            } else {
                                sumaDias = sumaDias + 28;
                            }
                            break;
                    }
                }
                sumaDias = sumaDias + dia;
                if (bisiesto){
                    diasRestan = 366 - sumaDias;
                } else {
                    diasRestan = 365 - sumaDias;
                }
                System.out.printf("Quedan para final de año: %d",diasRestan);
                break;
            case 16:
                int numLimit = 0;
                System.out.print("Hasta que numero quieres saber los primos: ");
                numLimit = input.nextInt();
                System.out.printf("Numeros primos: 1");
                for (int i = 2; i <= numLimit; i++) {
                    boolean esPrimo = true;
                    for (int j = 2; j < i ; j++) {
                        if (i%j == 0) esPrimo = false;
                    }
                    if(esPrimo){
                        System.out.printf(", %d", i);
                    }
                }
                break;
            case 17:
                System.out.println("Cuantas potencias de 2: ");
                int numPot = input.nextInt();
                for (int i = 0; i <= numPot; i++) {
                    int potencia = (int)Math.pow(2,i);
                    System.out.printf("2 elevado a %d = %d\n",i,potencia);
                }
                break;
            case 18:
                System.out.println("Empezamos:");
                for (int i = 30 ; i <= 60 ; i++) {
                    System.out.printf("%d\n",i);
                }
                break;
            case 19:
                for (int i = 20 ; i <= 40 ; i++) {
                    if ( i % 2 != 0){
                        System.out.println( i );
                    }
                }
                break;
            case 20:
                /*
                index=1;
                while(index<10){
                    index++;
                    System.out.println(index);
                }
                */
                for (int index20 = 2; index20 <= 10; index20++) {
                    System.out.println(index20);
                }
                break;
            case 21:
                String binari = "";
                char zero = '0',uno = '1';
                for (int i = 4 ; i <= 9 ; i = i + 2) {
                    for (int j = 1 ; j < i + 1 ; j++) {
                        if( j == 1 || j == ( i / 2 ) + 1 ){
                            System.out.print(zero);
                        } else {
                            System.out.print(uno);
                        }
                    }
                    System.out.println();
                }
                System.out.println(binari);
                break;
            case 22:
                int n22 = 1;
                do {
                    System.out.println("Introduce numero:");
                    n22 = input.nextInt();
                } while (n22 < 1);
                float resultado = 1.0F;
                float fraccion = 0.0F;
                for (int i = 2; i <= n22; i++) {
                    fraccion = (float)1/i;
                    resultado = resultado + fraccion;
                }
                System.out.printf("%.5f",resultado);
                break;
            default:
                System.out.println("Invalid number dumbass!!!");
                break;



        }
    }
}
