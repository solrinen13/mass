
public class Main {
    public static void main(String[] args) {
        {
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

        for (int i=0; i < weightTwo.length; i++) {
            if(i < weightTwo.length - 1)
            {
            System.out.print(weightTwo[i]+", ");
            }
            else System.out.print(weightTwo[i]);
        }

        System.out.println(" ");


        System.out.println("task №1/2.3");


        int[] arr = new int[]{1,0,0,0,0,0,0,0,0,0};

        for (int i=0; i < arr.length; i++) {
            if(i < arr.length - 1)
            {
                System.out.print(arr[i]+", ");
            }
            else System.out.print(arr[i]);
        }
        System.out.println(" ");}


        {
            System.out.println("task №3.1");

            int[] weighTaskThree = new int[]{1, 2, 3};
            for (int i = 0; i < weighTaskThree.length; i++) {
               int j = weighTaskThree.length - 1 - i;
                if (i < weighTaskThree.length - 1) {

                    System.out.print(weighTaskThree[j] + ", ");
                } else System.out.print(weighTaskThree[j]);
            }

            System.out.println(" ");
            System.out.println("task №3.2");

            double[] weightTwo = new double[]{1.57, 7.654, 9.986};
            for (int i = 0; i < weightTwo.length; i++) {
                int j = weightTwo.length -1 - i;
                if (i < weightTwo.length - 1) {
                    System.out.print(weightTwo[j] + ", ");
                } else System.out.print(weightTwo[j]);
            }

            System.out.println(" ");


            System.out.println("task №3.3");


            int[] arr = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            for (int i = 0; i < arr.length; i++) {
                int j = arr.length - 1 - i;
                if (i < arr.length - 1) {
                    System.out.print(arr[j] + ", ");
                } else System.out.print(arr[j]);
            }
            System.out.println(" ");
        }

        System.out.println("task №4");

        {
            int[] weight = new int[]{1, 2, 3};

            for (int i = 0; i < weight.length; i++)
            {
                    if (weight[i] % 2 != 0)
                     {
                        weight[i]= weight[i] + 1;
                     }
                        if (i < weight.length - 1 )
                        {
                            System.out.print(weight[i] + ", ");
                        }

                         if  (i == weight.length - 1)
                         {
                            System.out.print(weight[i]);
                         }


            }


        }


    }
}