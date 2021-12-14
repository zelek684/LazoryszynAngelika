package pl.imiajd.lazoryszyn;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Fortepian(" Fortepian?", LocalDate.of(1234,4,12)));
        orkiestra.add(new Skrzypce("Skrzypce?", LocalDate.of(1360,7,1)));
        orkiestra.add(new Flet("obojetnie ;)", LocalDate.of(1322,12,1)));
        for(Instrument tmp: orkiestra){
            System.out.print(tmp.dzwiek()+" ");
            System.out.println(tmp);
        }
        System.out.println(orkiestra.get(1).equals(orkiestra.get(2)));
        System.out.println(orkiestra.get(0).getProducent());
        System.out.println(orkiestra.get(0).getRokProdukcji());
    }
}