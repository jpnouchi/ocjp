package com.jpn.spring.business.impl;

import com.jpn.spring.business.DocumentService;
import com.jpn.spring.model.Documento;
import org.springframework.stereotype.Service;

/**
 * Created by jpnouchi on 12/06/16.
 */

public class OrderServiceImpl implements DocumentService {

    public void procesar() {
        System.out.println("procesar order");
    }

    public void mostrar(Documento documento) {
        System.out.println("numero OC "+documento.getNumeroDocumento());
    }
}
