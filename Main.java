/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    Scanner input = new Scanner(System.in);
    public void main(String[] args){
        countUp();
    }
    public void countUp(){
        System.out.println("Please input a number!");
        int num = Integer.parseInt(input.nextLine());
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("You sum total is "+sum+".");
    }
}
