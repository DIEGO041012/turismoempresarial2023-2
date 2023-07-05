package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
       Integer edad=34;
       //los objetos son variables , especiales
        universidad johonf=new universidad("diego");
        Usuario objetousuario=new Usuario(25,"andres", "123456",4,"andy@gmail.com");

        System.out.println(johonf.nombres);
        System.out.println(objetousuario.nombres);
        System.out.println(objetousuario.correoElectronico);
        System.out.println(objetousuario.id);
        System.out.println(objetousuario.documento);
        System.out.println(objetousuario.ubicacion);
    }
}