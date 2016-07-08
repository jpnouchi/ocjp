package com.jpn.pkgA.pkgB;

/**
 * Created by jpnouchi on 11/06/16.
 */
public class ServicioContar {

    private String valor="5";

    private static ServicioContar serviceContar;

    private ServicioContar() {

    }

    public static ServicioContar getInstance(){
        if(serviceContar==null)
            serviceContar=new ServicioContar();

        return serviceContar;
    }


    public void calcularValor(String asd){
        System.out.println("caluculo valor "+ valor+asd);
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
