
package Mypackage;


public class User {
   Card card;
   public User(int codCard){
       //cauta cardul caruia ii corespunde cod card
       //pus in card.
   }
   public void validareCard(int zi,int luna, int an ,int ora, int minut, int linie, int codUnicRatb){
       // sa nu validez dupa mai putin de 15min in acelasi ratb(cu acelasi cod unic)
       // daca validez in acelasi ratb dar cu cod unic diferit sa-mi ia bani
       
     int size = card.abonamente.size();
     int ok = 0;
       for( int i =0 ; i <size; i++){
           
           if(card.abonamente.get(i).getLinie()== 9999 || card.abonamente.get(i).getLinie()==linie && card.abonamente.get(i).getZiEnd()>= zi &&card.abonamente.get(i).getLunaEnd()>= luna &&card.abonamente.get(i).getAnEnd()>=an){
               System.out.print("pass");
                ok =1;
                Validare validare= new Validare(card,zi, luna,  an, minut, ora,  linie, codUnicRatb);
             //   addValidare(validare);
                break;
           }
       }
       if(ok==0){
           if(card.bani >= 1.30){
          System.out.print("pass");
           card.setBani(card.getBani()-1.30);
           Validare validare= new Validare(card,zi, luna,  an, minut, ora,  linie, codUnicRatb);
         //  addValidare(validare);
           }
           else{
               System.out.print("sold insuficient");
           }
       }
       
   }
   
   /// public verificareCard(int zi,int luna, int an ,int ora, int minut, int linie, int codUnicRatb){
        
   // }
}
