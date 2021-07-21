package usandoLocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class modificandoDatas {
    public static void main(String[] args) {
        LocalDate dataExemplo = LocalDate.of(2010,05,15);
        LocalTime horaExemplo = LocalTime.of(10,00,00);
        LocalDateTime exemplo = LocalDateTime.of(dataExemplo,horaExemplo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String exemploFormatado = exemplo.format(formatter);

        System.out.println(exemploFormatado);

        System.out.println("Adicionando 4 anos, 6 meses e 13 horas ao momento especificado:");
        LocalDateTime futuroExemplo = exemplo.plusYears(4).plusMonths(6).plusHours(13);

        String futuroExemploFormatado = futuroExemplo.format(formatter);

        System.out.println(futuroExemploFormatado);
    }
}
