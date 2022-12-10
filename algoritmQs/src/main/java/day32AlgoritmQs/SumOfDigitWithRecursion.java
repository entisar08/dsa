package day32AlgoritmQs;

public class SumOfDigitWithRecursion {

    public static void main(String[] args) {


        Integer input= 132189;
        System.out.println( findSumOfDigits(input));

    }

    public static int findSumOfDigits(int num){
        //convert num to string then chararray
            String str=Integer.toString(num);
            char[] numArray=str.toCharArray();
            int sum=0;
            for (int i = 0; i < numArray.length; i++) {
                sum+=Character.getNumericValue(numArray[i]);
            }
            num=sum;
            if(numArray.length==1) return num;
            return findSumOfDigits(num);

    }
}
