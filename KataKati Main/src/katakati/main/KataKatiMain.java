/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katakati.main;
import java.util.Scanner;
/**
 *
 * @author Shovan
 */
public class KataKatiMain {
    
    public static String enter;
    public static char team;
    public static char computer; 
    public static String usrIn;
    public static char[] holder= { '_', '_', '_', '_', '_', '_', '_', '_', '_' };
    
    public static void main(String[] args) {
        
        if (KataKatiMain.enter != "y"){
     
        System.out.println("\n\t\tWelcome To kAtA KuTi!\n");
        }
       while(true) {
           System.out.print("\t\tPress y to Enter: ");
           Scanner input = new Scanner(System.in);
           KataKatiMain.enter = input.next();
           if (KataKatiMain.enter.toLowerCase().equals("y")){
            // run setup
            
            setup(); break;
        } 
    }
    }   
    public static void drawBoard(){
        System.out.println("\n===================================================================================================================================");
        System.out.println("\n\t\t   A   B   C");
        System.out.println("\t\t  ___ ___ ___");
        System.out.println("\t      1  |   |   |   |");
        System.out.println("\t\t |_"+KataKatiMain.holder[0]+"_|_"+KataKatiMain.holder[1]+"_|_"+KataKatiMain.holder[2]+"_|"+ "  " + 1);
        System.out.println("\t      2  |   |   |   |");
        System.out.println("\t\t |_"+KataKatiMain.holder[3]+"_|_"+KataKatiMain.holder[4]+"_|_"+KataKatiMain.holder[5]+"_|"+ "  " + 2);
        System.out.println("\t      3  |   |   |   |");
        System.out.println("\t\t |_"+KataKatiMain.holder[6]+"_|_"+KataKatiMain.holder[7]+"_|_"+KataKatiMain.holder[8]+"_|"+ "  " + 3);
        System.out.println("\n\t\t   A   B   C");
    }
    public static void setup(){   
        // resetting the gameboard
        for(int i = 0; i<9; i++){
            KataKatiMain.holder[i] = '_';
        }
        drawBoard();
        // Choosing Side, X or O
        while((KataKatiMain.team != 'X')&&(KataKatiMain.team != 'O')) {
            
            System.out.println("\nChoose your Side.\nEnter X to choose Team X / Enter O to choose Team O");
            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            KataKatiMain.usrIn = input.next().toUpperCase();
            
            if  (KataKatiMain.usrIn.equals("X")){
                 KataKatiMain.team = 'X';
                 KataKatiMain.computer = 'O';
                                
            }
            
            else if (KataKatiMain.usrIn.equals("O")){
                KataKatiMain.team = 'O';
                KataKatiMain.computer = 'X';
            }
            
            else {
                System.out.println("You have entered an invalid option. Please choose between X or O.");
            }
        }
        System.out.println("\n\nYou are Team '" + KataKatiMain.team + "'" + "Place an '" + KataKatiMain.team +"'" + "anywhere in the board.\nExample: For placing an'" + KataKatiMain.team + "'" + "in the 1st column and 1st Row simply write A1.");
        // run game
        game();
    }
    public static void game(){
        boolean loop = true;
        drawBoard();       
        System.out.println("\nIt's your turn!");
        System.out.print("\nEnter your move here: ");
        
        
        do{
        Scanner input = new Scanner(System.in);
        KataKatiMain.usrIn = input.next().toUpperCase();
        
        switch (KataKatiMain.usrIn){
            
            case "A1": if ( KataKatiMain.holder[0] == '_' ){
                KataKatiMain.holder[0] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam();  loop = false;
            } else if ( KataKatiMain.holder[0] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[0] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;
            
            case "B1": if ( KataKatiMain.holder[1] == '_' ){
                KataKatiMain.holder[1] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[1] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[1] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;
                
            case "C1": if ( KataKatiMain.holder[2] == '_' ){
                KataKatiMain.holder[2] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[2] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[2] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;
            
            case "A2": if ( KataKatiMain.holder[3] == '_' ){
                KataKatiMain.holder[3] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[3] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[3] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;
            
            case "B2": if ( KataKatiMain.holder[4] == '_' ){
                KataKatiMain.holder[4] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[4] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[4] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;    
            
            case "C2": if ( KataKatiMain.holder[5] == '_' ){
                KataKatiMain.holder[5] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[5] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[5] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;    
              
            case "A3": if ( KataKatiMain.holder[6] == '_' ){
                KataKatiMain.holder[6] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[6] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[6] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;
                
            case "B3": if ( KataKatiMain.holder[7] == '_' ){
                KataKatiMain.holder[7] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[7] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[7] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;    
             
            case "C3": if ( KataKatiMain.holder[8] == '_' ){
                KataKatiMain.holder[8] = KataKatiMain.team;
                System.out.println("You have placed a "+  KataKatiMain.team +" in "+ KataKatiMain.usrIn);
                checkWinForTeam(); loop = false;
            } else if ( KataKatiMain.holder[8] == KataKatiMain.team ){
                System.out.println("You have already put an " + KataKatiMain.team + "there. Choose another spot.");
            } else if ( KataKatiMain.holder[8] == KataKatiMain.computer ){
                System.out.println("This spot is already taken by your opponent");
            } break;
                
        }
        } while(loop);
              
    }
    public static void checkWinForTeam(){
        if (KataKatiMain.holder[0] == KataKatiMain.team && KataKatiMain.holder[1] == KataKatiMain.team && KataKatiMain.holder[2] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();           
        }
        else if (KataKatiMain.holder[3] == KataKatiMain.team && KataKatiMain.holder[4] == KataKatiMain.team && KataKatiMain.holder[5] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }   
        else if (KataKatiMain.holder[6] == KataKatiMain.team && KataKatiMain.holder[7] == KataKatiMain.team && KataKatiMain.holder[8] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[0] == KataKatiMain.team && KataKatiMain.holder[3] == KataKatiMain.team && KataKatiMain.holder[6] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[1] == KataKatiMain.team && KataKatiMain.holder[4] == KataKatiMain.team && KataKatiMain.holder[7] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[2] == KataKatiMain.team && KataKatiMain.holder[5] == KataKatiMain.team && KataKatiMain.holder[8] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[0] == KataKatiMain.team && KataKatiMain.holder[4] == KataKatiMain.team && KataKatiMain.holder[8] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[2] == KataKatiMain.team && KataKatiMain.holder[4] == KataKatiMain.team && KataKatiMain.holder[6] == KataKatiMain.team){
            System.out.println("\n\n"+KataKatiMain.team+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[0] != '_' && KataKatiMain.holder[1] != '_' && KataKatiMain.holder[2] != '_' && KataKatiMain.holder[3] != '_' && KataKatiMain.holder[4] != '_' && KataKatiMain.holder[5] != '_' && KataKatiMain.holder[6] != '_' && KataKatiMain.holder[7] != '_' && KataKatiMain.holder[8] != '_' ){
            System.out.println("It's a TIE!");  drawBoard();  playAgain();
         }
         else { computerMove(); }
    }
    public static void computerMove(){
        while (true) {
            if (KataKatiMain.holder[0] == '_' || KataKatiMain.holder[1] == '_' || KataKatiMain.holder[2] == '_' || KataKatiMain.holder[3] == '_' || KataKatiMain.holder[4] == '_' || KataKatiMain.holder[5] == '_' || KataKatiMain.holder[6] == '_' || KataKatiMain.holder[7] == '_' || KataKatiMain.holder[8] == '_' ){
                float rn = (float) Math.random();
                float p = rn * 8;
                int x  = Math.round(p);
                if (KataKatiMain.holder[x] == '_'){
                    KataKatiMain.holder[x] = KataKatiMain.computer;
                    break;
                } 
            } else {
                    checkWinForTeam(); break;
                }
        }
        checkWinForComputer();
    }
    public static void checkWinForComputer(){
        if (KataKatiMain.holder[0] == KataKatiMain.computer && KataKatiMain.holder[1] == KataKatiMain.computer && KataKatiMain.holder[2] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();           
        }
        else if (KataKatiMain.holder[3] == KataKatiMain.computer && KataKatiMain.holder[4] == KataKatiMain.computer && KataKatiMain.holder[5] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }   
        else if (KataKatiMain.holder[6] == KataKatiMain.computer && KataKatiMain.holder[7] == KataKatiMain.computer && KataKatiMain.holder[8] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[0] == KataKatiMain.computer && KataKatiMain.holder[3] == KataKatiMain.computer && KataKatiMain.holder[6] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[1] == KataKatiMain.computer && KataKatiMain.holder[4] == KataKatiMain.computer && KataKatiMain.holder[7] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[2] == KataKatiMain.computer && KataKatiMain.holder[5] == KataKatiMain.computer && KataKatiMain.holder[8] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[0] == KataKatiMain.computer && KataKatiMain.holder[4] == KataKatiMain.computer && KataKatiMain.holder[8] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[2] == KataKatiMain.computer && KataKatiMain.holder[4] == KataKatiMain.computer && KataKatiMain.holder[6] == KataKatiMain.computer){
            System.out.println("\n\n"+KataKatiMain.computer+" WINS!");  drawBoard();  playAgain();
        }
         else if (KataKatiMain.holder[0] != '_' && KataKatiMain.holder[1] != '_' && KataKatiMain.holder[2] != '_' && KataKatiMain.holder[3] != '_' && KataKatiMain.holder[4] != '_' && KataKatiMain.holder[5] != '_' && KataKatiMain.holder[6] != '_' && KataKatiMain.holder[7] != '_' && KataKatiMain.holder[8] != '_' ){
            System.out.println("\n\nIt's a TIE!");  drawBoard();  playAgain();
         }
         else { game(); }
    }
    public static void playAgain(){
        System.out.print("\nDo you want to play again? (y/n): ");
        Scanner input = new Scanner(System.in);
        KataKatiMain.usrIn = input.next().toUpperCase();
        if (KataKatiMain.usrIn.equals ("Y")) {
            KataKatiMain.team = '_' ;
            KataKatiMain.computer = '_' ;
            setup();
        } 
        else if (KataKatiMain.usrIn.equals ("N")){
            System.exit(0);
        }
    }
    
}
