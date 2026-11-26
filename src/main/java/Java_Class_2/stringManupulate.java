package Java_Class_2;

import java.util.Arrays;

public class stringManupulate {
    public static void main(String[] args) {
        String name = "Badrun nesa barsha";

//        char [] ch=name.toCharArray();   //to char array
//        for (char c:ch){
//            System.out.println(c);
//        }
//        System.out.println(Arrays.toString(ch));


//        String [] splitName=name.split("\\s"); //split
//
//        System.out.println(Arrays.toString(splitName));


        StringBuilder sb=new StringBuilder(name);  //string builder
        sb.append(" Manger");
        sb.replace(7,11,"Nesa");
//        sb.reverse();
//        sb.delete(7,11);

        System.out.println(sb);




//        System.out.println(name.toUpperCase());  //upper case
//        System.out.println(name.toLowerCase());  //lower case

//        System.out.println(name.trim());   //trim


//        System.out.println(name.substring(0,6));   //substring

//        System.out.println(name.replace("a","o"));     //replace
//        System.out.println(name.replaceAll(" ","%"));    //replace all
//
//
//
//        System.out.println(name.length());    //length
//        System.out.println(name.charAt(8));    //char at
//        System.out.println(name.indexOf('e'));   //index of
//
//        if(name.contains("nesa")){        //contain
//            System.out.println("Found Successfully");
//        }
 /*       if (name.equals("Badrun nesa barsha")) {     //equals
            System.out.println("Found Successfully");

        }else {
            System.out.println("Not match");
        }*/


    }
}
