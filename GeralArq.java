
import java.io.*;
import java.util.*;

public class GeralArq{
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            LinkedList <Pessoa> lp = new LinkedList <Pessoa>();
            LinkedList <Doenca> ld = new LinkedList <Doenca>();
            String s = br.readLine();
            while (s.compareTo("fim") != 0){
                StringTokenizer st = new StringTokenizer(s, ";");
                Pessoa p = new Pessoa();
                p.setNome(st.nextToken());
                p.setId(Integer.parseInt(st.nextToken()));
                p.setDna(st.nextToken());
        
                lp.add(p);

                s = br.readLine();
                br.close();
            }    
            s = br.readLine();
            while(s != null){
                StringTokenizer st = new StringTokenizer(s, ";");
                Doenca d = new Doenca();
                d.setDnad(st.nextToken());
                d.setNomeDoenca(st.nextToken());
            
                ld.add(d);

                s = br.readLine();
            }
            for(Pessoa p:lp){
                System.out.printf("\n Nome: %s \n Idade: %d \n DNA: %s\n Doenca: ", p.getNome(), p.getId(), p.getDna());
                for(Doenca d: ld){
                    if  (p.getDna().contains(d.getNomeDoenca()));
                    {
                        System.out.printf("%s \n", d.getNomeDoenca());
                    }
                }
            }
        }             
        catch (Exception a) {
            System.out.printf("%s \n", a.getMessage());
        }
    }
}