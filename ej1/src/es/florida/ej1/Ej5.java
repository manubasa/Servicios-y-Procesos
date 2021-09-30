package es.florida.ej1;

import java.util.ArrayList;
import java.util.List;

public class Ej5 {
    public static void main(String[] args) {

        List<Integer> values=new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        System.out.println(values);




        System.out.println(bigger((ArrayList<Integer>) values));

    }
    public static int bigger(ArrayList<Integer> array ){
        int total=array.size();
        int temp=0;
        int i = 0;
        int j = i + 1;
        int ii= array.get(i);
        int jj= array.get(j);
        for ( i = 0; i < total; i++)
        {
            for ( j = i + 1; j < total; j++)
            {
                if (array.get(i) > array.get(j))
                {
                    temp = array.get(i);
                    ii = array.get(j);
                    jj = temp;
                }
            }
        }
        return array.get(total - 1);

    }



}


