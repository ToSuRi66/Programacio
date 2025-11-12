public void main() {

    int yearActual = LocalDate.now().getYear();
    Scanner sc = new Scanner(System.in);
    IO.println("Introduce tu año de nacimiento: ");
    long yearNasc = sc.nextInt();
    long edadYear = yearActual - yearNasc;
    long edadDias = edadYear * 365;
    long edadHoras = edadDias * 24;
    long edadMinutos = edadHoras * 60;
    long edadSegundos = edadMinutos * 60;
    long edadMiliSec = edadSegundos * 1000;

    IO.println("Edad en años: " + edadYear);
    IO.println("Edad en Dias: " + edadDias);
    IO.println("Edad en Horas: " + edadHoras);
    IO.println("Edad en Minutos: " + edadMinutos);
    IO.println("Edad en Segundos: " + edadSegundos);
    IO.println("Edad en Milisegundos: " + edadMiliSec);
}
