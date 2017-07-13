package rng;

public class KotA_Decision{
    
    public static String coinFlip(){ //to decide which team will pick a server
        int gen = (int)(Math.random()*2+1);
        if(gen == 1){
            return "Heads";
        }if(gen == 2){
            return "Tails";
        }
    }
    
    public static String MapDecision(){ //if both teams can't decide a map
        String[] maps = {"Canals", "Bureau", "Legacy", "Plaza", "Grounded"};
        int map = (int)(Math.random()*maps.length);
        return maps[map];
    }
    
    public static void main(String[] args){
        System.out.print("coinflip side: "+ coinFlip()+
            "\nMap decided:: " + MapDecision()+"\n");
    }
}
