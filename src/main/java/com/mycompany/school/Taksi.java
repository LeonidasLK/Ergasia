/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Taksi {
   
    private String kwdikosTaksis;

    /**
     * Get the value of kwdikosTaksis
     *
     * @return the value of kwdikosTaksis
     */
    public String getKwdikosTaksis() {
        return kwdikosTaksis;
    }

    /**
     * Set the value of kwdikosTaksis
     *
     * @param kwdikosTaksis new value of kwdikosTaksis
     */
    public void setKwdikosTaksis(String kwdikosTaksis) {
        this.kwdikosTaksis = kwdikosTaksis;
    }

    private String perigrafi;

    /**
     * Get the value of perigrafi
     *
     * @return the value of perigrafi
     */
    public String getPerigrafi() {
        return perigrafi;
    }

    /**
     * Set the value of perigrafi
     *
     * @param perigrafi new value of perigrafi
     */
    public void setPerigrafi(String perigrafi) {
        this.perigrafi = perigrafi;
    }
public void printStats(){
        System.out.println("Το όνομα του καθηγητή είναι" +kwdikosTaksis);
        System.out.println("Το όνομα του καθηγητή είναι" +perigrafi);
        
    } 

    public Taksi(String kwdikosTaksis, String perigrafi) {
        this.kwdikosTaksis = kwdikosTaksis;
        this.perigrafi = perigrafi;
    }

}
