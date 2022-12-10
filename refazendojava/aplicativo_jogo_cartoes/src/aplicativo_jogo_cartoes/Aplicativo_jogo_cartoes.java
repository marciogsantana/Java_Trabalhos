
package aplicativo_jogo_cartoes;

import java.util.*;

import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import java.io.*;
        

public class Aplicativo_jogo_cartoes {

   
    public static void main(String[] args) {
  
        QuizCardBuilder builder = new QuizCardBuilder();
        QuizCardplayer reader = new QuizCardplayer();
        builder.go();
        reader.go();
    }
    
}
