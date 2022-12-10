
package testedata;

import java.util.GregorianCalendar;

import java.util.Date;

import java.util.Timer;

import java.text.SimpleDateFormat;



public class Testedata {


    public static void main(String[] args) {

        GregorianCalendar calendario = new GregorianCalendar();
        
       System.out.println(new Date());
       
       
       System.out.println(calendario.getTime());
       
       Date today = new Date();
       
       System.out.println (today);
       
       Date dataHoje = new Date();
       SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
       String data = formataData.format(dataHoje);
       
       System.out.println (data);
       
       Timer tempo = new Timer();
       
      
       System.out.println (tempo);
      
    }
    
}
