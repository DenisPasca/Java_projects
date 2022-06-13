
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random rnd=new Random();
    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
       
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
        
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        int extra;
        for(int i=0;i<7;i++) {
            
           extra=this.rnd.nextInt(40)+1;
            
          
            if(this.containsNumber(extra)) {
                i--;
                continue;
            }
            numbers.add(extra);
        }
        
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if(this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

