import java.util.Random;

import javax.swing.JOptionPane;

public class GuessGame
{
    public GuessGame() {
     int userNum=0;
     int count=0;
    
    Random rNo=new Random();
    int randomNo=rNo.nextInt(100)+1;
    while(userNum != randomNo)
    {
      
      String s= JOptionPane .showInputDialog(null, "Enter Number Between 1 To 100", "NUMBER GUESSING GAME", JOptionPane.PLAIN_MESSAGE);
       userNum=Integer.parseInt(s);
    if(userNum>randomNo)
    {
        JOptionPane.showMessageDialog(null, "your Number is Higher ,Guess again", "RECOMENDATION", JOptionPane.PLAIN_MESSAGE);
        count++;
    }
    else if(userNum<randomNo)
    {
       JOptionPane.showMessageDialog(null, "your Number is Lower ,Guess again", "RECOMENDATION", JOptionPane.PLAIN_MESSAGE);
        count++;
    }
    else if(userNum==randomNo)
    {
        JOptionPane.showMessageDialog(null, "your Number is correct ,YOU WIN", "winner", JOptionPane.PLAIN_MESSAGE);

        count++; 
         JOptionPane.showMessageDialog(null, "YOU Took "+count+" Times", "RECOMENDATION", JOptionPane.PLAIN_MESSAGE);
         if(count==1)
         {
             JOptionPane.showMessageDialog(null, "OUTSTANDING ,YOU WON ONCE", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 100+" Outstanding", null,JOptionPane.PLAIN_MESSAGE);
        
         }
         if(count==2)
         {
             JOptionPane.showMessageDialog(null, "EXCELENT ,YOU WON AT SECOND TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 90+" Excelent", null,JOptionPane.PLAIN_MESSAGE);
    
         }
         if(count==3)
         {
             JOptionPane.showMessageDialog(null, "SUPERB ,YOU WON AT THIRD TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 80+" Superb", null,JOptionPane.PLAIN_MESSAGE);
         }
         if(count==4)
         {
             JOptionPane.showMessageDialog(null, "GOOD ,YOU WON AT FOURTH TIME", "RECOMENDATION", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 70+"  Good", null,JOptionPane.PLAIN_MESSAGE);
         }
         if(count==5)
         {
             JOptionPane.showMessageDialog(null, "NOTBAD ,YOU WON AT FIFTH TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 60+"  Notbad", null,JOptionPane.PLAIN_MESSAGE);  
         }
         if(count==6)
         {
            JOptionPane.showMessageDialog(null, "YOU WON AT SIXTH TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 50+"", null,JOptionPane.PLAIN_MESSAGE);
         }
         if(count==7)
         {
            JOptionPane.showMessageDialog(null, "YOU WON AT SEVENTH TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 40+"", null,JOptionPane.PLAIN_MESSAGE);
         }
         if(count==8)
         {
            JOptionPane.showMessageDialog(null, "YOU WON AT EIGHTH TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 30+"", null,JOptionPane.PLAIN_MESSAGE);
         }
         if(count==9)
         {
            JOptionPane.showMessageDialog(null, "YOU WON AT NINTH TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 20+"", null,JOptionPane.PLAIN_MESSAGE);
         }
         if(count==10)
         {
            JOptionPane.showMessageDialog(null, "YOU WON AT TENTH TIME", "WINNER", JOptionPane.PLAIN_MESSAGE);
             JOptionPane.showMessageDialog(null, "Your Score is "+ 10+"", null,JOptionPane.PLAIN_MESSAGE);
             break;
         }
    }
    else
    {
         JOptionPane.showMessageDialog(null, "your Number is Incorrect ,Try again", "WINNER", JOptionPane.PLAIN_MESSAGE);
        count++;
    }
    
       }
       System.exit(0);

    }
    public static void main(String[] args) {
        new GuessGame();
    }

}
