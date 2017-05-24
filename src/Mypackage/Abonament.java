/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;


class Abonament {
   int zi_start;
   int luna_start;
   int an_start;
   int zi_end;
   int luna_end;
   int an_end;
   int linie;
   //ab asta e pe toate liniile
   
   public void abonamentLunar(int zi_start, int luna_start, int an_start){
       //calculeaza cand se termina ab
       linie=9999;
   }
   public void abonamentLunarOLinie(int zi_start, int luna_start, int an_start, int linie){
       //calculeaza cand se termina ab
   }
   //ab pe zi este pe toate liniile
   public void abonamentZi(int zi_start, int luna_start, int an_start ){
       
   }
   public int getZiEnd(){
       return zi_end;
   }
   public int getLunaEnd(){
       return luna_end;
   }
   public int getAnEnd(){
       return an_end;
   }
   public int getLinie(){
       return linie;
   }
   
   
}
