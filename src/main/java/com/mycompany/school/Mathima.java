/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Mathima {
    
    private String kwdikosMathimatos;

    /**
     * Get the value of kwdikosMathimatos
     *
     * @return the value of kwdikosMathimatos
     */
    public String getKwdikosMathimatos() {
        return kwdikosMathimatos;
    }

    /**
     * Set the value of kwdikosMathimatos
     *
     * @param kwdikosMathimatos new value of kwdikosMathimatos
     */
    public void setKwdikosMathimatos(String kwdikosMathimatos) {
        this.kwdikosMathimatos = kwdikosMathimatos;
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
    
    private Taksi[] taksi;

    /**
     * Get the value of taksi
     *
     * @return the value of taksi
     */
    public Taksi[] getTaksi() {
        return taksi;
    }
    
    private Kathigitis[] kathigitis;

    /**
     * Get the value of kathigitis
     *
     * @return the value of kathigitis
     */
    
    public Kathigitis[] getKathigitis() {
        return kathigitis;
    }

    /**
     * Set the value of kathigitis
     *
     * @param kathigitis new value of kathigitis
     */
    public void setKathigitis(Kathigitis[] kathigitis) {
        this.kathigitis = kathigitis;
    }

    /**
     * Set the value of taksi
     *
     * @param taksi new value of taksi
     */
    public void setTaksi(Taksi[] taksi) {
        this.taksi = taksi;
    }

    public Mathima(String kwdikosMathimatos, String perigrafi, Taksi taksi) {
        this.kwdikosMathimatos = kwdikosMathimatos;
        this.perigrafi = perigrafi;
        this.taksi = new Taksi[1];
        this.kathigitis = new Kathigitis[1];
        
    }


public void printStats(){
        System.out.println("Το όνομα του καθηγητή είναι" +kwdikosMathimatos);
        System.out.println("Το όνομα του καθηγητή είναι" +perigrafi);
    
        
    }
}
