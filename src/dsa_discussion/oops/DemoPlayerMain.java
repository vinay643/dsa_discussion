package dsa_discussion.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DemoPlayerMain {
    public static void main(String[] args) {
       Player[] pl=new Player[4];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            int playerId=sc.nextInt();
                sc.nextLine();
            String playerName=sc.nextLine();
            int runs=sc.nextInt();
            sc.nextLine();
            String playerType=sc.nextLine();
            String matchType=sc.nextLine();

            pl[i]=new Player(playerId,playerName,runs,playerType,matchType);

        }
        String value=sc.nextLine();
        String mt=sc.nextLine();
        System.out.println(findPlayerWithLowestRuns(pl,value));
        ArrayList<Player> ap=findPlayerByMatchType(pl,mt);
        for(Player p:ap){
            System.out.println(p.playerId);
        }

    }

    public static ArrayList<Player> findPlayerByMatchType(Player[] pl,String mt){
        ArrayList<Player> ap=new ArrayList<>();

        int len=pl.length;
        for(int i=0;i<len;i++){
            if(pl[i].matchType.equalsIgnoreCase(mt)){
                ap.add(pl[i]);
            }
        }

        Collections.sort(ap, new Comparator<Player>() {

            public int compare(Player p1,Player p2){
                return p2.playerId-p1.playerId;
            }
        });

        return ap;
    }
    static int  findPlayerWithLowestRuns(Player[] pl,String pt){
          int lw=Integer.MAX_VALUE;
          for(Player p:pl){
              if(p.runs<lw&& pt.equalsIgnoreCase(p.playerType)){
                  lw=p.runs;
              }
          }
          if(lw==Integer.MAX_VALUE){
              return 0;
          }

          return lw;
    }
}


 class Player{
    int playerId;



    String playerName;
    int runs;
    String playerType;
    String matchType;
     public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
         this.playerId = playerId;
         this.playerName = playerName;
         this.runs = runs;
         this.playerType = playerType;
         this.matchType = matchType;
     }

}
/*

- playerId - int
- playerName - String
- runs - int
- playerType - String
- matchType - String
 */
