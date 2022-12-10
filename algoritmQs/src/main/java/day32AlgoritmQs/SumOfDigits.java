package day32AlgoritmQs;

public class SumOfDigits {

    public static void main(String[] args) {


        Integer input= 99;
        System.out.println( findSumOfDigits(input));

    }

    public static int findSumOfDigits(int num){

        //convert num to string then chararray

        while (true) {
            String str=Integer.toString(num);
            char[] numArray=str.toCharArray();
            int sum=0;
            for (int i = 0; i < numArray.length; i++) {
                sum+=Character.getNumericValue(numArray[i]);
            }
            num=sum;
            if(numArray.length==1) break;
        }


        return num;

    }
}
