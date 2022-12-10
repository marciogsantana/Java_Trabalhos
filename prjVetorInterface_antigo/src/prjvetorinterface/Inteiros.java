/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjvetorinterface;

import javax.swing.DefaultListModel;

/**
 *
 * @author Alexandre
 */
public class Inteiros {
 
    public static int Soma(DefaultListModel list)
    {   
        int s = 0;
        for (int i = 0; i < list.getSize(); i++)
            s = s + (Integer)list.get(i);

        return s;
    }
}
