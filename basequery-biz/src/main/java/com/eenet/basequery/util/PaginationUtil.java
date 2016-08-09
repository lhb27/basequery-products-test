package com.eenet.basequery.util;

import com.eenet.basequery.page.Pagination;

public class PaginationUtil {
	/** 
     * 获取查询总数对应的SQL 
     * @param querySelect 
     * @return 
     */  
    public static String getCountSql(String querySql) {  
    	return "select count(1) totalCount from ( "+querySql+" ) t";
    }  
  
    /** 
     * 得到分页的SQL 
     * 
     * @param offset 偏移量 
     * @param limit  位置 
     * @return 分页SQL 
     */  
    public static String getPagingSql(String querySql, long offset, long limit) {  
        String sql = querySql + " limit " + offset + " ," + limit;  
        return sql;  
    }  
    
    /** 
     * 得到分页的SQL 
     * 
     * @param offset 偏移量 
     * @param limit  位置 
     * @return 分页SQL 
     */  
    public static String getPagingSql(String querySql, Pagination pagination) {  
    	return getPagingSql(querySql,(pagination.getPageCurrent()-1)*pagination.getPageSize(),pagination.getPageSize());
    }  
  
    /** 
     * 将SQL语句压缩成一条语句，并且每个单词的间隔都是1个空格 
     * @param sql SQL语句 
     * @return 如果sql是NULL返回空，否则返回转化后的SQL 
     */  
    private static String compress(String sql) {  
        return sql.replaceAll("[\r\n]", " ").replaceAll("\\s{2,}", " ");  
    }  
  
  
    /** 
     * 判断括号"()"是否匹配,并不会判断排列顺序是否正确 
     * 
     * @param text 要判断的文本 
     * @return 如果匹配返回TRUE, 否则返回FALSE 
     */  
    private static boolean isBracketCanPartnership(String text) {  
        if (text == null  
                || (getIndexOfCount(text, '(') != getIndexOfCount(text, ')'))) {  
            return false;  
        }  
        return true;  
    }  
  
    /** 
     * 得到一个字符在另一个字符串中出现的次数 
     * 
     * @param text 文本 
     * @param ch   字符 
     */  
    private static int getIndexOfCount(String text, char ch) {  
        int count = 0;  
        for (int i = 0; i < text.length(); i++) {  
            count = (text.charAt(i) == ch) ? count + 1 : count;  
        }  
        return count;  
    }  
} 

