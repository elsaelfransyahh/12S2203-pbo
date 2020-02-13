/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author 06-12s18050 Elsa Marbun
 * @author 06-12s18020 Dita Sihombing;
 * 
 */
public class Main {
    private static List<String> nims = new ArrayList<>();
    private static List<String> names = new ArrayList<>();
    
    public static void main(String[] _args){
        Scanner in = new Scanner(System.in);
        String s;
        while(true){
            String nim, name;
            s = in.nextLine();
            String[] tokens = s.split("");
            switch(tokens[0]){
                case "add":
                    add(tokens[1], tokens[2]);
                    break;
                case "find":
                    String result;
                    result = find(tokens[1]);
                    System.out.println(result);
                    break;
                case "count":
                    System.out.println(count());
                    break;
                case "reset":
                    reset();
                    break;          
            }
        }
    }
    
    public static void add(String _nim, String _name){
        int check = 0;
        if(nims.size() !=0){
            for(int i = 0; i <nims.size(); i++){
                if(_nim.equals(nims.get(i))){
                    check++;
                }
                if(check ==0){
                    nims.add(_nim);
                    names.add(_name);
                }
            }
        }
    }
    public static String find(String _nim){
        String result = new String();
        for(int i =0; i <nims.size(); i++){
            if(_nim.equalsIgnoreCase(nims.get(i))){
                result = nims.get(i);
                result += " ";
                result += names.get(i);
            }
        }
        return result;
    }
    
    public static int count(){
        return nims.size();        
    }
    
    public static void reset(){
        nims.clear();
        names.clear();
    }
            }
