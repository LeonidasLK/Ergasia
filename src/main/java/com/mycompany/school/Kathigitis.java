/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Kathigitis {
    
    private String onoma;

    /**
     * Get the value of onoma
     *
     * @return the value of onoma
     */
    public String getOnoma() {
        return onoma;
    }

    /**
     * Set the value of onoma
     *
     * @param onoma new value of onoma
     */
    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    private String epitheto;

    /**
     * Get the value of epitheto
     *
     * @return the value of epitheto
     */
    public String getEpitheto() {
        return epitheto;
    }

    /**
     * Set the value of epitheto
     *
     * @param epitheto new value of epitheto
     */
    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    private int amka;

    /**
     * Get the value of amka
     *
     * @return the value of amka
     */
    public int getAmka() {
        return amka;
    }

    /**
     * Set the value of amka
     *
     * @param amka new value of amka
     */
    public void setAmka(int amka) {
        this.amka = amka;
    }
    
    private Mathima mathima;

    /**
     * Get the value of mathima
     *
     * @return the value of mathima
     */
    public Mathima getMathima() {
        return mathima;
    }

    /**
     * Set the value of mathima
     *
     * @param mathima new value of mathima
     */
    public void setMathima(Mathima mathima) {
        this.mathima = mathima;
    }


    public Kathigitis(String onoma, String epitheto, int amka, Mathima mathima) {
        this.onoma = onoma;
        this.epitheto = epitheto;
        this.amka = amka;
        this.mathima = mathima;
    }

public void printStats(){
        System.out.println("Το όνομα του καθηγητή είναι" +onoma);
        System.out.println("Το όνομα του καθηγητή είναι" +epitheto);
        System.out.println("Το όνομα του καθηγητή είναι" +amka);
        
    }
}
