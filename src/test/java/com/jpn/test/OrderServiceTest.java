package com.jpn.test;

import com.jpn.AbstractTest;
import com.jpn.spring.business.DocumentService;
import com.jpn.spring.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * Created by jpnouchi on 12/06/16.
 */
public class OrderServiceTest  extends AbstractTest{

    @Autowired
    DocumentService orderServiceImpl;




    @Test
    public void testService(){
        Order order= new Order();
        order.setDescripion("asd");
        order.setNumeroDocumento(123);
        orderServiceImpl.procesar();
        orderServiceImpl.mostrar(order);

        String asd="asd";
        String bbb="asd";

        String ccc=new String("asd");
        String ddd= new String("asd");

        System.out.println(asd.equals(bbb));
        System.out.println(asd==bbb);
        System.out.println(ccc==asd);
        System.out.println(ccc==ddd);
        System.out.println(ccc.equals(asd));


    }


}
