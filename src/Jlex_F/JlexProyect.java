/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jlex_F;

/**
 *
 * @author Dennis Santizo
 */
public class JlexProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Producciones p = new Producciones(new Yylex(new java.io.FileInputStream("C:\\Users\\JairoJS\\Desktop\\ProyectoJlexCup\\prueba.mlp")));
            p.parse();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
