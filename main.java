
import java.util.Scanner;

class main{
    public static void main(String [] args){   // empty grid of char type
         char[][] grid =new char[3][3];
         for(int i =0;i<grid.length;i++){
             for(int j =0;j<grid[i].length;j++){
                 grid[i][j]=' ';
             }
         }
   

         char player = 'X';
         boolean gameOver = false;
         Scanner scn = new Scanner(System.in);

         while(!gameOver){
            PrintGrid(grid);
            System.out.println("Player " +player+" enter: ");
            int i = scn.nextInt();
            int j = scn.nextInt();

 if(grid[i][j]==' '){
                grid[i][j]=player;
                gameOver=haveWon(grid,player);

      if(gameOver){
              System.out.println("Player" + player + " has won: ");
          }else{
        player = (player=='X') ? 'O' : 'X';
          }
 }else{
      System.out.println("Invalid move try again!");
    }
          
}
   PrintGrid(grid);
 }

 
      public static boolean haveWon(char[][] grid,char player){
             // for row 
        for(int i =0;i<grid.length;i++){
             if(grid[i][0]==player && grid[i][1]==player && grid[i][2]==player){
                 return true;
             }
        }
        
        // for column

         for(int j =0;j<grid[0].length;j++){
             if(grid[0][j]==player && grid[1][j]==player && grid[2][j]==player){
                 return true;
             }
        }
        

        // lower diagonal 
        if(grid[0][0]==player && grid[1][1]==player && grid[2][2]==player){
             return true;
        }
      
  /// upper diagonal
         if(grid[0][2]==player && grid[1][1]==player && grid[2][0]==player){
             return true;
        }

        return false;
     }


      // print function
     public static void PrintGrid(char[][] grid){
           for(int i =0;i<grid.length;i++){
             for(int j =0;j<grid[i].length;j++){
               System.out.print( grid[i][j]+ " |");
             }
             System.out.println();
         }
     }

}