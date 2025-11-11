import java.util.Scanner;
import java.io.*;

public class Exercicis {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercici? (A partir de 15)");
        int exercici = input.nextInt();

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        final int MAXIMO_ENCONTRADO,N;
        int a,i,j,k,r,m,n,p,z,ci,xi,var,max,suma,index,cont,count,contador;
        double ad,md,xd,yd;
        char car,c;
        boolean xb,sigue,fin;

        switch(exercici){
            case 15:
                System.out.println("Mira es codi");
                /*if(max = MAXIMO_ENCONTRADO)
                    System.out.println(max+"es el maximo encontrado");
                break;*/
            case 16:
                index = 1;
                while (index<10){
                    System.out.println(index);
                    index++;
                }
                break;
            case 17:
                count = 50;
                while(count >= 0){
                    System.out.println(count);
                    count = count+1;
                }
                break;
            case 18:
                count = 50;
                while(count>=0){
                    System.out.println(count);
                    count++;
                }
                break;
            case 19:
                ci = 1;
                N = 5;
                while (ci <= N){
                    System.out.print(ci);
                    ci--;
                }
                break;
            case 20:
                xd = 13.0;
                yd = 7.0;
                int v1 = (int) ((xd /4)+1);
                int v2 = (int) (yd /4);
                while (v1 > 0){
                    v1 = v1-1;
                    v2 = v2 * v1;
                    System.out.print(v2 + " ");
                }
                break;
            case 21:
                System . out . print ( " Introduzca 0 o 1: " );
                xd = Integer . parseInt ( stdin.readLine());
                while ( xd !=0 || xd !=1) {
                    System . out . print ( " Opcion erronea , pruebe de nuevo \n " );
                    xd = Integer . parseInt ( stdin.readLine());
                }
                break;
            case 22:
                car = '1';
                //car args[0].charAt(0);
                while(car != 'a' || car != 't'){
                    car++;
                }
                System.out.println(car);
                break;
            case 23:
                System.out.print("Introduzca SI o NO : ");
                car = stdin.readLine().charAt(0);
                System.out.println("Mira codi");
                /*while( car !=’S’ || car !=’n’){
                System.out.print(" Opcion erronea , pruebe de nuevo \n ");
                car = stdin.readLine().charAt(0);
                }*/
                break;
            case 24:
                r = 2;
                while(r>=1){
                    ci = 1;
                    while(ci<=2){
                        System.out.print(" " + (r%2==1?"1":"2"));
                        ++ci;
                    }
                    --r;
                }
                break;
            case 25:
                xi = 0;
                yd = 0;
                sigue = true;
                while(sigue){
                    xi = (int)Math.pow(2,2);
                    switch(xi) {
                        case 4:
                            yd = 2;
                        case 6:
                            yd = 4;
                            break;
                        case 8:
                            yd = 8;
                            break;
                        default:
                            yd = 0;
                    }
                    System.out.println(yd);
                    sigue = false;
                }
                break;
            case 26:
                index = 1;
                do{
                    index++;
                    System.out.println(index);
                } while(index < 10);
                break;
            case 27:
                c = 'M';
                m = 0;
                xb = true;
                do{
                    if (!xb){
                        c='m';
                    }
                    do{
                        m = m*2+1;
                    }while(m<2);
                    xb = false;
                }while(c!='m');
                System.out.println(m);
                break;
            case 28:
                contador = 0;
                do{
                    System.out.println(contador);
                    contador++;
                }while(contador <0);
                break;
            case 29:
                contador = 5;
                if(contador!=5){
                    contador = contador + 2;
                } else {
                    do{
                        System.out.println(contador);
                        contador++;
                    }while (contador < 0);
                }
                break;
            case 30:
                var = 1;
                m = 1;
                xb = true;
                do{
                    if(!xb){
                        var = 2;
                    }
                    do{
                        m++;
                    }while(m<3);
                    xb = false;
                }while(var!=2);
                System.out.println(m);
                break;
            case 31:
                fin = false;
                i = 3;
                do{
                    if (i%2==0){
                        fin=!fin;
                    }
                    System.out.print(i+" ");
                    i++;
                }while(i<6 && !fin);
                break;
            case 32:
                md = 3.37;
                cont = 0;
                i = 0;
                do{
                    if ((md/2!=0)||(i/2)==0){
                        cont++;
                        md++;
                    }
                }while(cont<2);
                do {
                    i++;
                    md--;
                } while (i<1);
                System.out.printf("%.1f",md);
                break;
            case 33:
                a = 4;
                if(a>=5){
                    a--;
                } else {
                    do{
                        a++;
                        System.out.println(a);
                    } while (a<4);
                }
                break;
            case 34:
                ad = 3.22;
                i = 0;
                j = 0;
                while(i<2){
                    if((ad/2!=0) || (j/2==0)){
                        i++;
                        ad++;
                    }
                }
                do {
                    j++;
                    ad--;
                } while(j<1);
                System.out.printf("%.1f",ad);
                break;
            case 35:
                for (i = 0; i<12 ; i++){
                    switch(i){
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println(" i es menor que 5");
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            System.out.println(" i es menor que 10");
                            break;
                        default:
                            System.out.println(" i es 10 o mayor");
                    }
                }
                break;
            case 36:
                m = 5;
                {
                    //if ( args == 7)
                        n = 7;
                }
                for (i=0 ; i<n ; i++)
                    System.out.println(i);
                break;
            case 37:
                for (int star = 9 ; star < 0 ; star++)
                    System.out.print('*');
                break;
            case 38:
                for (i=0 ; i<=7 ; i++){
                    switch(i){
                        case 0:
                        case 1:
                        case 2:
                            System.out.println(i+" es menor que 3");
                        case 3:
                        case 4:
                        case 5:
                            System.out.println(i+" es menor que 5");
                            break;
                        default:
                            System.out.println(i+" es 6 o mayor");
                    }
                }
                break;
            case 39:
                for (contador=1; contador>4; contador++){
                    System.out.println(contador);
                }
                break;
            case 40:
                for (i=1; i<4 ; i++){
                    switch(i){
                        case 1:
                            System.out.print("a");
                            break;
                        case 2:
                            System.out.print("b");
                        case 3:
                            System.out.print("c");
                            break;
                        default:
                            System.out.print("d");
                    }
                }
                break;
            case 41:
                for(i=5 ; i>1 ; i--){
                    for(j=0 ; j<i ; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 42:
                for( i=0 ; i<=6 ; i++ ){
                    switch(i){
                        case 0:
                        case 1:
                            break;
                        case 2:
                            System.out.print("1 ");
                        case 3:
                            break;
                        case 5:
                            System.out.print("5 ");
                            break;
                        default:
                            System.out.print("d ");
                    }
                }
                break;
            case 43:
                for (j=0 ; j<3 ; j++){
                    switch(j){
                        case 1:
                            System.out.print(1);
                            break;
                        case 2:
                            System.out.print(2);
                        default:
                            System.out.print(3);
                    }
                }
                break;
            case 44:
                for(i=20 ; i<=26 ; i++) {
                    if(i%2!=0){
                        System.out.println(i);
                    }
                }
                break;
            case 45:
                xd = 1;
                for (i=0 ; i<3 ; i++){
                    xd = xd + 2 * i;
                }
                System.out.println(xd + " " + i);
                break;
            case 46:
                a = 2;
                n = 6;
                cont = 0;
                for(i=0 ; i<n ; i++){
                    if ((a/2!=0) || (i/2)!=0){
                        cont++;
                    }
                }
                System.out.println(cont);
                break;
            case 47:
                for(i=0 ;  i<3 ; i++){
                    for( j=0 ; j<i ; j++){
                        System.out.print(" ");
                    }
                    for(k=0 ; k<5-2*i; k++){
                        System.out.print("xd");
                    }
                    System.out.println();
                }
                break;
            case 48:
                for(i=0 ; i<=5 ; i++){
                    switch(i){
                        case 0:
                        case 1:
                            System.out.print("++ ");
                            break;
                        case 3:
                        case 4:
                            System.out.print("$$ ");
                            break;
                        default:
                            System.out.print("@@ ");
                    }
                }
                break;
            case 49:
                xd = 4;
                yd = 4;
                j = 0;
                for (i = 0 ; i < yd; i++){
                    if((xd /2!=0) || (i/2)!=0){
                        j--;
                    }
                }
                System.out.println(j);
                break;
            case 50:
                k = 0;
                j = 0;
                for (i=0 ; i<2 ; i++){
                    for ( j=0 ; j<2 ; j++){
                        k=k+(i+j);
                    }
                }
                System.out.println(i + " + " + j + " = " + k);
                break;
            case 51:
                r = 0;
                z = 0;
                p = 0;
                for (r=3 ; r<=4 ; r++){
                    for(p=0 ; p<2 ; p++){
                        z = z + (p + r);
                    }
                }
                System.out.println(p + " " + r + " " + z);
                break;
            case 52:
                m = 4;
                n = 3;
                cont = 0;
                for( i=0 ; i<n ; i++){
                    if ((m/2!=0) || (i/2)!=0){
                        cont++;
                    }
                }
                System.out.println(cont);
                break;
            case 53:
                contador = 1;
                for (;contador>4;contador++){
                    System.out.print("Contador dentro del bucle: " + contador);
                }
                System.out.println("Contador fuera del bucle: " + contador);
                break;
            case 54:
                a = 7;
                n = 20;
                cont = 0;
                for (var = 0 ; var<n ; var++){
                    if ((a%2==0) || (var%2)==0){
                        cont++;
                    }
                }
                System.out.println(cont);
                break;
            case 55:
                suma = 0;
                for(j = 1 ; j <=5 ; j++){
                    suma = suma + j;
                }
                System.out.print("suma="+suma);
                break;
            case 56:
                for(c=1;c>=0;c++){
                    System.out.println(c);
                }
                break;
            case 57:
                j=1;
                for(i=0;i<5;i++){
                    switch (i){
                        case 0:
                        case 2:
                            j=j+i;
                            break;
                        case 1:
                            j=j*i;
                        case 3:
                            j=j-i;
                            break;
                        default:
                            j=i/j;
                    }
                }
                System.out.println(j);
                break;
            default:
                System.out.println("Invalid number dumbass!!");
        }
    }
}
