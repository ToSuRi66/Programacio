public void main() {
    boolean repeat = true;
    do {
        Scanner sc = new Scanner(System.in);
        short tipoTemp = 3;
        IO.println("Que temperatura desea convertir: 0 (Celsius) 1 (Fahrenheit) ");
        tipoTemp = sc.nextShort();
        if (tipoTemp == 0 || tipoTemp == 1) { //Bucle error-proof

            IO.println("Que temperatura: ");
            double temperatura = sc.nextDouble(); // Demanar temeratura
            if (tipoTemp == 1) { //Convertir a Fahrenheit
                double tempFinal = (temperatura - 32) * 0.5556;
                IO.println("Temperatura convertida: " + tempFinal);
            } else if (tipoTemp == 0) { //Convertir a Celsius
                double tempFinal = (temperatura * 1.8) + 32;
                IO.println("Temperatura convertida: " + tempFinal);
            }
        } else {
            IO.println("Error: Tipo no especificado");
            break;
        }
        IO.println("Desea volver a empezar? (S) Si o (N) No");
        char inRepeat = sc.next().charAt(0);
        if (inRepeat == 'N' || inRepeat == 'n') {
            IO.println("De acuerdo, hasta la proxima");
            repeat = false;
        } else if (inRepeat == 'S' || inRepeat == 's') {
            IO.println("Volvemos a empezar");
        } else  {
            IO.println("Error: Respuesta inesperada1");
            break;
        }
    } while (repeat);
}