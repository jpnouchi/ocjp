package com.jpn.spring.business.impl;

import com.jpn.spring.business.DocumentService;
import com.jpn.spring.model.Documento;
import org.springframework.stereotype.Service;

/**
 * Created by jpnouchi on 12/06/16.
 */
public class RfqServiceImpl implements DocumentService {


    public void procesar() {
        System.out.println("procesar rfq");
    }

    public void mostrar(Documento documento) {
        System.out.println("numero RFQ "+documento.getNumeroDocumento());

    }
}
