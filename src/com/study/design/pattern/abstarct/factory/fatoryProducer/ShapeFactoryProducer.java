/**
 * 
 */
package com.study.design.pattern.abstarct.factory.fatoryProducer;

import com.study.design.pattern.abstarct.factory.abstractFactoryProducer.AbstractFactoryProducer;
import com.study.design.pattern.abstarct.factory.model.Circle;
import com.study.design.pattern.abstarct.factory.model.Color;
import com.study.design.pattern.abstarct.factory.model.Shape;
import com.study.design.pattern.abstarct.factory.model.Triangle;

/**
 * @author rajan
 * shape factory producer
 *
 */
public class ShapeFactoryProducer extends AbstractFactoryProducer {

	/**
	 *unimplemented function
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *Mehod to get shape class
	 */
	@Override
	public Shape getShape(String shape) {
		if("triangle".equalsIgnoreCase(shape)) {
			return new Triangle();
		}else if("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		}
		return null;
	}

}
