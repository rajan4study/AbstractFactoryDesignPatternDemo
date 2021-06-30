package com.study.design.pattern.abstarct.factory;

import com.study.design.pattern.abstarct.factory.abstractFactoryProducer.AbstractFactoryProducer;
import com.study.design.pattern.abstarct.factory.fatoryProducer.ColorFactoryProducer;
import com.study.design.pattern.abstarct.factory.fatoryProducer.ShapeFactoryProducer;

/**
 * @author rajan
 * 
 * main factory which generate each individual factories
 *
 */
public class MainFactory {
	
	/**
	 * method to get each factory based on type name passed as argument
	 * @param type
	 * @return
	 */
	public static AbstractFactoryProducer getFactoryByType(String type) {
		if("shape".equalsIgnoreCase(type)) {
			return new ShapeFactoryProducer();
		}else if("color".equalsIgnoreCase(type)){
			return new ColorFactoryProducer();
		}
		return null;
	}

}
