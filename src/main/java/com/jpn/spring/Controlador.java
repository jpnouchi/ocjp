package com.jpn.spring;

import com.jpn.spring.business.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jpnouchi on 12/06/16.
 */
@Component
public class Controlador {

    @Autowired
    private DocumentService orderServiceImpl;

    @Autowired
    private DocumentService rfqServiceImpl;


    public Controlador(DocumentService orderServiceImpl, DocumentService ddd) {
        this.orderServiceImpl = orderServiceImpl;
        this.rfqServiceImpl = ddd;
    }

    public Controlador(){

    }

    public void procesarDocumentos(){
        System.out.println("Prcesar documentos");
        orderServiceImpl.procesar();
        rfqServiceImpl.procesar();
    }


}
