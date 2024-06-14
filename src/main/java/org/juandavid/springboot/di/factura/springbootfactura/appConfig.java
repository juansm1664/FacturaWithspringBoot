package org.juandavid.springboot.di.factura.springbootfactura;


import org.juandavid.springboot.di.factura.springbootfactura.models.Item;
import org.juandavid.springboot.di.factura.springbootfactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class appConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product product1 = new Product("Camara sony",800);
        Product product2 = new Product("Audifonos JBL",1200);
        Product product3 = new Product("silla gaming",1200);
        List<Item> items = Arrays.asList(new Item(product1,2), new Item(product2, 3), new Item(product3,4));
        return items;
    }

    @Bean("default")
    List<Item> itemsInvoiceOffice(){
        Product product1 = new Product("Monitor ASUS",800);
        Product product2 = new Product("bicicleta trek",1200);
        Product product3 = new Product("Celular OppO",1200);
        Product product4 = new Product("Notebook Razer",1200);
        List<Item> items = Arrays.asList(new Item(product1,2), new Item(product2, 3), new Item(product3,4), new Item(product4, 3));
        return items;
    }


}
