package usandoDate;
import java.util.Date;
import java.time.Instant;

public class birthdayMillis {
    public static void main(String[] args) {
        boolean verificaPosterior;

        Instant birthday =  Instant.parse("1994-12-06T11:00:00Z");
        Long millisBirth = birthday.toEpochMilli();
        System.out.println("Descubra o timeInMillies do dia que você nasceu:");
        System.out.println(millisBirth);

        Date nascimento =  new Date(millisBirth);
        System.out.println("Converta em um objeto Date:");
        System.out.println(nascimento);

        Instant dataProposta = Instant.parse("2010-05-15T03:00:00Z");
        Long millisDataProposta = dataProposta.toEpochMilli();
        Date novaData = new Date(millisDataProposta);
        //System.out.println(novaData);

        verificaPosterior = nascimento.toInstant().isAfter(novaData.toInstant());
        System.out.println("Verifique se ele é anterior ou posterior ao dia 15 de maio de 2010:");
        if(verificaPosterior){
            System.out.println("Você nasceu depois do dia 15 de Maio de 2010!");
        } else if (!verificaPosterior){
            System.out.println("Você nasceu antes do dia 15 de Maio de 2010!");
        }else{
            System.out.println("Você nasceu no dia 15 de Maio de 2010!");
        }
    }
}
