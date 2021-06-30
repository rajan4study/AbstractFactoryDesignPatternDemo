/**
 * 
 */
package com.study.design.pattern.abstarct.factory.fatoryProducer;

import com.study.design.pattern.abstarct.factory.abstractFactoryProducer.AbstractFactoryProducer;
import com.study.design.pattern.abstarct.factory.model.Blue;
import com.study.design.pattern.abstarct.factory.model.Color;
import com.study.design.pattern.abstarct.factory.model.Red;
import com.study.design.pattern.abstarct.factory.model.Shape;

/**
 * @author rajan
 * Color factory producer
 *
 */
public class ColorFactoryProducer extends AbstractFactoryProducer {

	/**
	 *method to get color class
	 */
	@Override
	public Color getColor(String color) {
		if("blue".equalsIgnoreCase(color)) {
			return new Blue();
		}else if("red".equalsIgnoreCase(color)) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
