
public class DataStructuresHW
{

    public static void main(String[] args)
    {
        //Question #1
        int[] array = {5,9,6,7,12,25};
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        
        System.out.println("Sum of the elements of the array: " + sum);
        
        //Question #2
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++)
        {

             if (exampleArray[ i ] > maximum) 
             {
                  maximum = exampleArray[ i ];
                  index = i;
             }
        }

        System.out.println(index);

        //Don't do question #3
    }

}
