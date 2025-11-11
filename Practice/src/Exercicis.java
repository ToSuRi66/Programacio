import java.util.Scanner;

//Exercicis PDF 1-15

public class Exercicis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int exercici;
        IO.println("De quin exercici vols el resultat:");
        exercici = input.nextInt();
        switch (exercici) {
            case 7:
                //Ex: 7
                int x;
                double y = 1243.5321;
                x = (short)(y - 0.9);
                IO.println(x);
                break;
            case 9:
                //Ex: 9
                int var1 = 15;
                {
                    int var2 = 30;
                }
                IO.println("var1 = " + var1);
                //IO.println("var2 = " + var2);
                break;
            case 10:
                //Ex: 10
                char total = 'A';
                char num = 'C';
                total = ++num;
                IO.println(total);
                IO.println(num);
                num = total++;
                IO.println(num);
                IO.println(total);
                break;
            case 11:
                //Ex: 11
                int total1 = 2;
                int num1 = 3;
                total1 = ++num1;
                IO.println(total1 + " i " + num1);
                break;
            case 12:
                //Ex: 12
                int x1 = 1;
                boolean r1 , r2 , r3 , r4;
                r1 = (x1 > 1) && (x1++ < 10);
                r2 = (10 < x1) && (15 > x1++);
                r3 = (10 == x1) || (20 > x1++);
                r4 = (10 == x1) || (20 > x1++);
                IO.println(r1 + " " + r2 + " " + r3 + " " + r4);
                break;
            case 13:
                //Ex: 13
                int incremento;
                incremento = 1;
                IO.println(++incremento + " " + incremento++ + " " + incremento);
                break;
            case 14:
                //Ex: 14
                int a = 1, b = 2, c = 3, d = 1;
                float r, s = (float)3.0;
                r = a + b / c + d / a;
                s = r - s;
                r = (long) s;
                r = ++r;
                IO.println(r);
                break;
            case 15:
                //Ex: 15
                boolean valor1 = false, valor2 = false;
                int x2 = 6, y2 = 3;
                valor1 = (x2 < 5) || (x2 > y2);
                valor2 = (x2 < 5) || (y2 == x2);
                IO.println(valor1 + " " + valor2);
                break;
            case 16:
                //Ex: 16
                boolean valor16 = false, valor26 = false;
                int x3 = 6, y3 = 3;
                valor16 = (x3 < 5) && (x3 > y3);
                valor26 = (x3 < 5) && (y3 == x3);
                IO.println(valor16 + " " + valor26);
                break;
            case 17:
                //Ex: 17
                int x4 = 2, y4 = 5;
                x4*=y4+2;
                System.out.println(x4);
                break;
            case 18:
                //Ex: 18
                char c1;
                c1 = 'c';
                System.out.printf("c = %c\n" ,c1);
                ++c1;
                System.out.printf("c = %c\n", c1);
                System.out.printf("c = %c%c\n", c1++, c1--);
                System.out.printf("c = %c\n", c1);
                break;
            case 19:
                //Ex: 19
                int y5;
                int n5=5;
                y5=n5++ + ++n5;
                IO.println(n5 + " " + y5);
                break;
            case 20:
                //Ex: 20
                boolean m=false, n=false, p, q;
                p = (!m) && (n);
                q = (!m) || (n);
                IO.println("p=" + p + " q=" + q);
                break;
            case 21:
                //Ex: 21
                int valor11 = 5, valor21 = 5;
                boolean m7=false, n7=false, p7, q7;
                p7 = (valor11 >= valor21);
                q7 = (valor11 < valor21);
                IO.println("p=" + p7 + " q=" + q7);
                break;
            case 22:
                //Ex: 22
                char a1='a';
                int x8=5;
                a1+= 5;
                x8/=3;
                IO.println(a1 + " " + x8);
                break;
            case 23:
                //Ex: 23
                int var3=1, var2=1;
                boolean r5,s2;
                r5 = (var3++ < 2);
                IO.println("r=" + r5 + " var1=" + var3);
                s2 = (++var2 <2);
                IO.println("s=" + s2 + " var2=" + var2);
            case 24:
                //Ex: 24
                double saldo;
                saldo = (1/5)*10;
                IO.println(saldo*5.0);
                break;
            case 25:
                //Ex: 25
                int op;
                int a2=2, a8=8, a4=4, a11=1;
                op = a2 + a8 / a4 + a11;
                System.out.printf("op = %d\n", op);
                break;
            case 27:
                //Ex: 27
                int num2;
                num2 = 3 + 11 / 5 * 2 + 3 % 2;
                IO.println(num2);
                break;
            case 28:
                //Ex: 28
                double a3=2, b3=5;
                int c3=2, d3=1;
                int x9 = (int)(b3 / a3) / c3 + d3;
                IO.println("x: " + x9);
                break;
            case 29:
                //Ex: 29
                int num3, divisor = 100;
                num3 = 100;
                IO.println("num inicial = " + num3);
                num3 = num3 / divisor;
                num3 = num3 / 2;
                System.out.print("num / 2 = ");
                IO.println(num3);
            case 30:
                //Ex: 30
                int m3 = 1, n3 = 4, k = 2, j = 1;
                float x0, valor = (float) 1.1;
                x0 = m3 + n3 / k + j;
                valor = x0 + valor;
                x0 = (long) valor;
                x0 = x0 + valor;
                IO.println(x0);
                break;
            case 31:
                //Ex:31
                int v1 = 1, v2 = 2, v3 = 3, v4 = 4;
                float v5 , v6 = ( float )2.2;
                v5 = v4 + v3 * v2 - v1;
                v6 = v5 - v6;
                v5 = (long) v6;
                System.out.printf ("%.1f %.1f\n", v5, v6);
                break;
            case 32:
                //Ex: 32
                int a5 , b5 , c5;
                a5 = 2; b5 = 4; c5 = 4;
                IO.println (a5*b5/2*c5);
                break;
            case 33:
                //Ex: 33
                boolean seguir = true;
                //seguir == true;
                seguir = true;
                break;
            case 34:
                //Ex: 34
                char caracter;
                caracter = 'c';
                IO.println("caracter: " + caracter);
                --caracter;
                IO.println("caracter: " + caracter);
                IO.println("caracter: " + caracter-- + caracter + caracter++ + caracter);
                break;
            case 35:
                //Ex: 35
                int var = 1;
                boolean r6 , s5 , t , v;
                r6 = (var > 1 ) && (var++ <100);
                s5 = (100 < var) && (150 > var++);
                t = (100 == var) || (200 > var++);
                v = (100 == var) || (200 > var++);
                IO.println(r6 + " " + s5 + " " + t + " " + v);
                break;
            case 36:
                //Ex: 36
                double saldo1;
                saldo1 = (2 / 3) * 2;
                saldo1++;
                System.out.printf("%.2f ", saldo1);
                break;
            case 37:
                //Ex: 37
                int m6 = 7 , n6 = 2;
                m6/= n6 + 2;
                System.out.printf("%d", m6);
                break;
            default:
                IO.println("No disponible");
                break;
        }
    }
}
