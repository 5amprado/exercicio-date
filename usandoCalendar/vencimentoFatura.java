package usandoCalendar;
import java.util.Calendar;
import java.util.Date;

public class vencimentoFatura {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();
        Calendar pagaSemJuros = Calendar.getInstance();

        Date data = new Date();
        pagaSemJuros.setTime(data);

        System.out.print("Sua data de vencimento é: ");
        System.out.printf("%tD\n", agora);


        pagaSemJuros.add(Calendar.DATE, 10);
        int dia = pagaSemJuros.get(Calendar.DAY_OF_WEEK);


        if (dia == 1) {
            pagaSemJuros.add(Calendar.DATE, 1);
            System.out.print("Você tem até dia ");
            System.out.printf("%tD", pagaSemJuros);
            System.out.println(" para pagar sem juros.");
        } else if (dia == 7) {
            pagaSemJuros.add(Calendar.DATE, 2);
            System.out.print("Você tem até dia ");
            System.out.printf("%tD", pagaSemJuros);
            System.out.println(" para pagar sem juros.");
        } else {

            System.out.print("Você tem até dia ");
            System.out.printf("%tD", pagaSemJuros);
            System.out.println(" para pagar sem juros.");
        }
        }
    }

