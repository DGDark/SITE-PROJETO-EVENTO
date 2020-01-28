import java.util.*;

public class arratlist {
    public static void main(String[] args) {

        List<Integer>  numerosal= new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i < 20; i++) {

            numerosal.add(rd.nextInt(99));}
            System.out.println(random.nextInt());

            Map<String,String> mapaMund = new HashMap<>();
            mapaMund.put("Brasil","Brasilia");
            mapaMund.put("Japão","Tokyo");
            mapaMund.put("Bulgaria","Sófia");
            mapaMund.put("Grogerland","Jerffesonland");
            mapaMund.put("Runnaterra","yonia");

            for (Map.Entry<String, String> item : mapaMund.entrySet()) {
                System.out.println(item.getKey() + " - " + item.getValue());
            }
                if(mapaMund.containsKey("Brasil")){
                    System.out.println("Ola'Brasil");
                }
                break;

        }
    }
}
