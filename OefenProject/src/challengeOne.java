public class challengeOne {
    public static void main(String[]args){
        double value1 = 20.00;
        double value2 = 80.00;

        double theTotal = ((value1+value2)*100);
        System.out.println(theTotal);

        double theRemainder = (theTotal%40);
        System.out.println(theRemainder);

        boolean remainderZeroTest = theRemainder == 0.00 ? true : false;
        System.out.println(remainderZeroTest);

        if (remainderZeroTest == false){
            System.out.println("Got some remainder");
        }
    }
}
