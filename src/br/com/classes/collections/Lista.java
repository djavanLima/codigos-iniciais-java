package br.com.classes.collections;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
	ArrayList<Usuario> lista = new ArrayList <>();
	Usuario u1=new Usuario("Djavan Lima","djavanlyonel@gmail.com");
	lista.add(u1);
	lista.add(new Usuario("Luana Marinho Calheiros","luana@gamil.com"));
	lista.add(new Usuario("Bia"," bia@gmail.com"));
	lista.add(new Usuario("Djavan Liam","djavanlyonel@gmail.com"));
	
	
	}
}
