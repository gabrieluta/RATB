/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.util.ArrayList;

/**
 *
 * @author Madaluna
 */
public class Card {

    String nume;
    String prenume;
    int CodCard;
    
    double bani;
    ArrayList<Abonament> abonamente=new ArrayList<>();
    
    Card (String nume, String prenume){
        this.nume=nume;
        this.prenume=prenume;
        bani=0;
    }
    public double getBani(){
        return bani;
    }
    
    public void setBani(double bani){
        this.bani=bani;
    }
    
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getCodCard() {
        return CodCard;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCodCard(int codCard) {
        this.CodCard = codCard;
    }
}
