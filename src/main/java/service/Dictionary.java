package service;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String,String> dic;

    static {
        dic = new HashMap<>();
        dic.put("hello","Xin chào");
        dic.put("he","Anh ấy");
        dic.put("how","Thế nào ");
        dic.put("english","Tiếng anh");
    }

    public String check(String word){
        String result=null;
        if(dic.get(word)!= null){
            result = dic.get(word);
        }
        return result;
    }
}