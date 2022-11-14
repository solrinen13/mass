
public class Main {


    public static void main(String[] args) {



        System.out.println("task №1/2.1");

        int [] weight = new int[]{1,2,3};

        for (int i=0; i < weight.length; i++)
        {
            if(i < weight.length - 1)
            {
                System.out.print(weight[i]+", ");
            }
            else System.out.print(weight[i]);
        }


        System.out.println(" ");

        System.out.println("task №1/2.2");

        double [] weightTwo = new double[]{1.57, 7.654, 9.986};

        for (int i=0; i < weightTwo.length; i++)
        {
            if(i < weightTwo.length - 1)
            {
            System.out.print(weightTwo[i]+", ");
            }
            else System.out.print(weightTwo[i]);
        }

        System.out.println(" ");


        System.out.println("task №1/2.3");


        int[] arr = new int[]{1,0,0,0,0,0,0,0,0,0};

        for (int i=0; i < arr.length; i++)
        {
            if(i < arr.length - 1)
            {
                System.out.print(arr[i]+", ");
            }
            else System.out.print(arr[i]);
        }
        System.out.println(" ");



            System.out.println("task №3.1");

        for (int i = weight.length -1; i >= 0; i--)
        {
            if (i != 0)
                System.out.print(weight[i] + ", ");
            else System.out.print(weight[i]);


        }


            System.out.println(" ");
            System.out.println("task №3.2");

            double[] weightTwoTaskThree = new double[]{1.57, 7.654, 9.986};
            for (int i = weightTwoTaskThree.length -1; i >= 0; i--)
            {

                if (i != 0)
                {
                    System.out.print(weightTwoTaskThree[i] + ", ");
                } else System.out.print(weightTwoTaskThree[i]);
            }

            System.out.println(" ");


            System.out.println("task №3.3");


        for (int i = arr.length-1; i >= 0; i--)
        {
            if (i != 0)
             {
                 System.out.print(arr[i] + ", ");

             }
            else System.out.print(arr[i]);
            }

            System.out.println(" ");


            System.out.println("task №4");


            int[] weight_4 = new int[]{1, 2, 3};

            for (int i = 0; i < weight_4.length; i++)
            {
                if (weight_4[i] % 2 != 0)
                {
                    weight_4[i] = weight_4[i] + 1;
                }
                if (i < weight_4.length - 1) {
                    System.out.print(weight_4[i] + ", ");
                }

                if (i == weight_4.length - 1) {
                    System.out.print(weight_4[i]);
                }


            }


        }
    }
