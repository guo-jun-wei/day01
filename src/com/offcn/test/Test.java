package com.offcn.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    /*@Test
    public void test(){
        String s = "yekmaakkccekymbvb";
        Map<Character,Integer> result = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(result.get(ch) != null){
                result.put(ch,result.get(ch)+1);
            }else{
                result.put(ch,1);
            }
        }
        for(Map.Entry entry: result.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

*/

    public static void main(String[] args) {
        String s ="grgwregrwgrege";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length()-1;i++){
            char c = s.charAt(i);//获取到下标所对的字符
            if(map.get(c) == null){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


    }
}
