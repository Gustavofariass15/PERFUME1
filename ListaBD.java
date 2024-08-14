package br.ulbra.lista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaBD {
    public ArrayList lista;
    
    public ListaBD (){
        lista = new ArrayList();
    }
    
    public void salvar(String elemento){
        if (elemento.equals("")|| elemento.equals (null)){
            JOptionPane.showMessageDialog(null, "digite algo xiru");
        } else {
        
        lista.add(elemento);
        JOptionPane.showMessageDialog(null, elemento+ ", salvo com sucesso");
        }
    }
    public String lista(){
        String elemento = "Lista de perfumes:\n";
        if(lista.isEmpty()){
            return "Não foram lançados perfumes. ";
        } else {
        for(int i=0;i<lista.size(); i++){
            elemento += lista.get(i)+"\n";
            
        }
        
        return elemento;
    }
  }
}
