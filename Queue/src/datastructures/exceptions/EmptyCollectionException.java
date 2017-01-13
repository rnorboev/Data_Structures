/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures.exceptions;

/**
 *
 * @author kemal
 */
public class EmptyCollectionException extends RuntimeException{
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }

    public EmptyCollectionException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
