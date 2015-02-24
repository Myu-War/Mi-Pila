/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackadt;

/**
 *
 * @author introduccion02
 */
public interface StackADT <T>{
    
    public void push (T elem);
    
    public T pop();
    
    public T peek();
    
    public boolean isEmpty();
    
    public int size();
    
    public String toString();
    
    public boolean evaluaParentesis(String valor);
    /**
     * @param args the command line arguments
     */
    
}