/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroalumnos;

import java.util.Vector;

/**
 *
 * @author marck - andres villamarin peña
 */
public class Usuario {

    public static Vector mostrar() {
        return ListaUsuario.mostrar();
    }
    
    private String nick;
    private String contasenia;

    public Usuario() {
    }

    public Usuario(String nick, String contasenia) {
        this.nick = nick;
        this.contasenia = contasenia;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContasenia() {
        return contasenia;
    }

    public void setContasenia(String contasenia) {
        this.contasenia = contasenia;
    }

        static int VerificarNuevo(String usuario) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        return -1;
    }

    static int verificarLogueo(String usuario, String contraseña) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario) && obj.getContasenia().equalsIgnoreCase(contraseña)) {
                return i;
            }
        }
        return -1;
    }
}
