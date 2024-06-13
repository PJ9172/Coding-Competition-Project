import java.util.*;

public class Assignment {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();

    void rock() {
        System.out.println("Enter your choice for Rock, Paper or Scissors");
        System.out.print("0 for Rock, 1 for Paper & 2 for Scissors : ");
        int uch = sc.nextInt();
        if (uch < 0 || uch > 3) {
            System.out.println("Your choice is invlaid!!!");
            System.out.print("Please enter valid choice : ");
            uch = sc.nextInt();
        }
        String str[] = { "Rock", "Paper", "Scissors" };
        int cch = rn.nextInt(str.length);
        if (cch == 0)
            System.out.println("Computer choice is Rock");
        else if (cch == 1)
            System.out.println("Computer choice is Paper");
        else
            System.out.println("Computer choice is Scissors");

        if (cch == uch)
            System.out.println("Match Tie!!");
        else if (uch == 0 && cch == 1)
            System.out.println("You Loss!!!");
        else if (uch == 0 && cch == 2)
            System.out.println("You Win!!!");
        else if (uch == 1 && cch == 0)
            System.out.println("You Win!!!");
        else if (uch == 1 && cch == 2)
            System.out.println("You Loss!!!");
        else if (uch == 2 && cch == 0)
            System.out.println("You Loss!!!");
        else if (uch == 2 && cch == 1)
            System.out.println("You Win!!!");
    }

    void numGuessing()
    {
        System.out.print("Guess any number between 1-100 : ");
        int uno=sc.nextInt();
        int rno=rn.nextInt(100);
        System.out.println("Computer generated number is : "+rno);
        if(uno==rno)
            System.out.println("Your guess is correct!!!");
        else if(uno>rno)
            System.out.println("Your guess is too High!!!");
        else
            System.out.println("Your guess is too Low!!!");
    }

    int gameMenue() {
        System.out.println("1 : Rock Paper Scissors");
        System.out.println("2 : Number Guessing");
        System.out.print("Enter your game choise : ");
        int ch = sc.nextInt();
        return ch;
    }

    public static void main(String[] args) {
        Assignment as = new Assignment();
        switch (as.gameMenue()) {
            case 1:
                as.rock();
                break;
            case 2:
                as.numGuessing();
                break;
            default:
                System.out.println("Invalid choice!!!");
                break;
        }
    }
}