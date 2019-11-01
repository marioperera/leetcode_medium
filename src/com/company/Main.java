package com.company;

import java.util.*;


class Solution{
    public static  HashMap<Character,String> map = new HashMap<Character, String>();

    public HashSet<String> combinations =new HashSet<String>();

    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<>();
        }
        return new ArrayList<>(this.drivcrfunc(digits));
    }

    public HashSet<String> drivcrfunc(String digits){

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ght");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqr");
        map.put('8',"stu");
        map.put('9',"wxyz");

        getcombinations("",map,digits);
        System.out.println(this.combinations);
        return this.combinations;
    }

    public void getcombinations(String ret,HashMap<Character,String> mapping,String nums){



        if( nums.equals("")){
            combinations.add(ret);
        }else {
            char getindex =nums.charAt(0);
            String word = map.get(getindex);
            for (int i = 0; i <word.length() ; i++) {
                String returnstring =nums.substring(1);
                getcombinations(ret+word.charAt(i),map,returnstring);
            }
        }
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Solution solution =new Solution();
        solution.drivcrfunc("123");

    }
}
