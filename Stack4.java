
package javaapplication32;
import java.util.*;
import java.util.Stack;

/**
 *
 * @author Asus Tuf
 */
public class Stack4 {
    
    public static void pushAtButtom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtButtom(data,s);
        s.push(top);
       
    }
    
    public static void reverse(Stack<Integer>s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtButtom(top,s);
    }
    
    public static void main(String args[]){
        Stack<Integer>s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        
//        reverse(s);
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
            
            
        }
        
    }
    
}
