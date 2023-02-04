public class ifOrEx {
    public static void main(String[]args){
        int topScore = 80;

        if ((topScore>100) || (topScore<0)){
            System.out.println("Your score is either too high or too low");
        }
        else{
            System.out.println("Your'e fine");
        }
    }
}
