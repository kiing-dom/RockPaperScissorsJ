import java.util.*;
public class RPS {
    public static void main(String[] args){
        
        //Get the users input
        Scanner in = new Scanner(System.in);
        

        //loop to keep game going on
        while(true){

            System.out.println("Rock, Paper, Scissors, Shoot!!");
        System.out.print("If you want to quit type QUIT: ");
        String myMove = in.nextLine();

        //check if the user entered QUIT
        if(myMove.equals("quit")){
            break;
        }

            //Verify that myMove is valid
    if(!myMove.equals("rock") && !myMove.equals("paper") &&
    !myMove.equals("scissors")){
     System.out.println("Your move isn't valid");

} else { 
    
    //Randomly generate the opponents move (0, 1, 2)
    int rand = (int) (Math.random() * 3);
   String oppMove = "";
   if(rand == 0) {
       oppMove = "rock";
   }else if(rand == 1){
       oppMove = "paper";

   }else{ oppMove = "scissors";

    }
    System.out.println("Opponent Move: " + oppMove);

    // Decide if the user, tied, won or lost
    if(myMove.equals(oppMove)){
        System.out.println("YOU TIED");

    } else if((myMove.equals("rock") && oppMove.equals("scissors"))
     | (myMove.equals("scissors") && oppMove.equals("paper")) ||
     (myMove.equals("paper") && oppMove.equals("rock"))) {
         System.out.println("YOU WON");
         }else{
             System.out.println("YOU LOST");
}
}

}
    System.out.println("THANKS FOR PLAYING");
}

        }


        