/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarifa;

import carrera.Carrera;

/**
 *
 * @author Sergi
 */
public class Tarifa {

    private static String id = null;
    private static double costeMilla = 1.35;
    private static double costeMinuto = 0.35;
    private static double costeMinimo = 5;
    private static double porcentajeComision = 0.20;
    private static Carrera carrera = null;

    public Tarifa() {
    }

    public Tarifa(String id, double costeMilla, double costeMinuto, double costeMinimo, double porcentajeComision) {
        this.id = id;
        this.costeMilla = costeMilla;
        this.costeMinuto = costeMinuto;
        this.costeMinimo = costeMinimo;
        this.porcentajeComision = porcentajeComision;

    }

    /*
    
    METODOS PROPIOS DE LA CLASE
     */
    public static double getCosteDistancia(double distancia) {

        return distancia * getCosteMilla();

    }

    public static double getCosteTiempo(double minutos) {
        return minutos * getCosteMinuto();

    }

    public static double getCosteTotalEsperado(Carrera cr) {

        if (getCosteMinimo() >= 5) {
            return getCosteDistancia(cr.getDistancia()) + getCosteTiempo(cr.getTiempoEsperado());
        } else {
            return 5;
        }

    }

    //    
    /*
    GETTERS Y SETTERS
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static  double getCosteMilla() {
        return costeMilla;
    }

    public void setCosteMilla(double costeMilla) {
        this.costeMilla = costeMilla;
    }

    public static double getCosteMinuto() {
        return costeMinuto;
    }

    public void setCosteMinuto(double costeMinuto) {
        this.costeMinuto = costeMinuto;
    }

    public static double getCosteMinimo() {
        return costeMinimo;
    }

    public void setCosteMinimo(double costeMinimo) {
        this.costeMinimo = costeMinimo;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

}
