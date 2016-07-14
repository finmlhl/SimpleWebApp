package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("young")){
            return "A great man, still living and enjoying his life.";
        }
        
        if(query.toLowerCase().contains("multiplied")){
        	return Integer.toString(Integer.valueOf(query.substring(query.length() - 2, query.length())) * Integer.valueOf(query.substring(query.length() - 19, query.length() - 17)));
        	//String value =  Integer.toString(Integer.valueOf(query.substring(query.length() - 2, query.length())));
        	//return value;
        }
        return "";
    }
}
