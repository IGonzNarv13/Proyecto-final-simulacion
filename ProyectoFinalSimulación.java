package proyecto.pkgfinal.simulación;

import javax.swing.JOptionPane;

public class ProyectoFinalSimulación {

    public static void main(String[] args) {
        int i = 1;
        boolean a1, a2, a3, a4, a5, a6, a7, a8;
        boolean b1, b2, b3, b4, b5, b6, b7, b8;
        int v1, v2, v3, v4, v5, v6, v7, v8;
        
        a1 = b1 = true;
        a2 = b2 = false;
        a3 = b3 = false;
        a4 = b4 = false;
        a5 = b5 = true;
        a6 = b6 = false;
        a7 = b7 = true;
        a8 = b8 = false;
        
            if (a1 == true){
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            
            if (a1 == true){
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            
            if (a2 == true){
                v2 = 1;
            }
            else {
                v2 = 0;
            }
            
            if (a3 == true){
                v3 = 1;
            }
            else {
                v3 = 0;
            }
            
            if (a4 == true){
                v4 = 1;
            }
            else {
                v4 = 0;
            }
            
            if (a5 == true){
                v5 = 1;
            }
            else {
                v5 = 0;
            }
            
            if (a6 == true){
                v6 = 1;
            }
            else {
                v6 = 0;
            }
            
            if (a7 == true){
                v7 = 1;
            }
            else {
                v7 = 0;
            }
            if (a8 == true){
                v8 = 1;
            }
            else {
                v8 = 0;
            }

        
            System.out.println("Estado inicial " + v1 + ", " + v2 + ", "
            + v3 + ", " + v4 + ", " + v5 + ", " + v6 + " ," + v7 + " ," + v8);

        System.out.println();
        do {            
            b1 = !a7;
            b2 = !a6 && a1;
            b3 = a1;
            b4 = a1 && a5;
            b5 = a1;
            b6 = a1;
            b7 = !a8;
            b8 = !a1;
            
            a1 = b1;
            a2 = b2;
            a3 = b3;
            a4 = b4;
            a5 = b5;
            a6 = b6;
            a7 = b7;
            a8 = b8;
            
            if (a1 == true){
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            
            if (a1 == true){
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            
            if (a2 == true){
                v2 = 1;
            }
            else {
                v2 = 0;
            }
            
            if (a3 == true){
                v3 = 1;
            }
            else {
                v3 = 0;
            }
            
            if (a4 == true){
                v4 = 1;
            }
            else {
                v4 = 0;
            }
            
            if (a5 == true){
                v5 = 1;
            }
            else {
                v5 = 0;
            }
            
            if (a6 == true){
                v6 = 1;
            }
            else {
                v6 = 0;
            }
            
            if (a7 == true){
                v7 = 1;
            }
            else {
                v7 = 0;
            }
            if (a8 == true){
                v8 = 1;
            }
            else {
                v8 = 0;
            }
                  
            System.out.println("Iteración " + i + ": " + v1 + ", " + v2 + ", "
            + v3 + ", " + v4 + ", " + v5 + ", " + v6 + " ," + v7+ " ," + v8);

            System.out.println();
            i++;
        }while(i<11);
    }
    
}
