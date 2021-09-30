package es.florida.ej1;

import java.util.*;

public class Ej2  {
    public static void main(String[] args) {
        String[] arrayName=new String[]{"Vicent","Adrian","Rafa","Pablo","Jesus","Nacho"};
       for (int i=0;i< arrayName.length;i++){
           System.out.println(arrayName[i]);
       }
        List<String> listName=new ArrayList<String>();
      listName.add("Andrés");
      listName.add("Manel");
      listName.add("Nestor");
      listName.add("Pablo");
      listName.add("Adri");
      listName.add("Josep");
        for (int i=0;i< listName.size();i++){
            System.out.println(arrayName[i]);
        }
    }
}