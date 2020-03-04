package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
			
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Selam selamNesnesi1 = context.getBean("selam",Selam.class);
		selamNesnesi1.setMesaj("Mutlu Sancaktutar");
		selamNesnesi1.goster();
	
			
		Selam selamNesnesi2 = context.getBean("selam",Selam.class);
		selamNesnesi2.setMesaj("Burak Yilmaz");// Goruldugu uzere setMesaj yazmasakta Mutlu Sancaktutar yazacak
		selamNesnesi2.goster();
		

		selamNesnesi1.goster();
		
		Selam selamNesnesi3 = new Selam();
		selamNesnesi3.goster();
		
		
		System.out.println(context.getBean("selam",Selam.class));
		System.out.println(context.getBean("selam",Selam.class));
		System.out.println(context.getBean("selam",Selam.class));
		System.out.println(context.getBean("selam",Selam.class));
		System.out.println(context.getBean("selam",Selam.class));
		System.out.println(context.getBean("selam",Selam.class));
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
		
		
	}

}
