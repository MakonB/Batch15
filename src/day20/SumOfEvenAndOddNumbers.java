package day20;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {

        int sum = 0;


        for ( int i = 10; i <= 100; ++i  ){
            if ( i % 2 == 0 ){
                sum = sum + i;
                System.out.print(i + ",");
            }

        }
        System.out.println();
        System.out.println(sum);

        }

    }

