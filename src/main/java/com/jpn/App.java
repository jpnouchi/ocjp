package com.jpn;

import com.jpn.pkgA.pkgB.ServicioContar;
import com.jpn.spring.Controlador;
import com.jpn.spring.business.impl.OrderServiceImpl;
import com.jpn.spring.business.impl.RfqServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        ServicioContar servicioContar= ServicioContar.getInstance();
        ServicioContar.getInstance().calcularValor("10");
        ServicioContar.getInstance().setValor("100");
        ServicioContar.getInstance().calcularValor("20");*/

        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
        RfqServiceImpl rfqServiceImpl = new RfqServiceImpl();
        Controlador controlador= new Controlador(orderServiceImpl, rfqServiceImpl);
        controlador.procesarDocumentos();


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/app-context.xml");

        Controlador controladorSpring= (Controlador) applicationContext.getBean("controlador");
        controladorSpring.procesarDocumentos();
    }



}
