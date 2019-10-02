import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TestaDateAPI {
    public static void main(String[] args) {

        LocalDate minhaData = LocalDate.now();
        System.out.println("A minha data atual é: " + minhaData);

        LocalTime meuTempo = LocalTime.now();
        System.out.println("O meu tempo atual é: " + meuTempo);

        String dataFormatada = LocalDateTime
                                    .now()
                                    .format(DateTimeFormatter
                                                        .ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Data e Tempo no formato => yyyy-MM-dd HH:mm:ss => " + dataFormatada);

        LocalDate outraData = LocalDate.of(1982, 12,8);
        System.out.println("Nasci em: " + outraData);

        LocalDate natal = LocalDate.of(2019, 12,25);
        int diasParaNatal = natal.getDayOfYear() - minhaData.getDayOfYear();
        System.out.println("Faltam " + diasParaNatal + " dias para o Natal!");

    }
}
