package com.study.design.pattern.abstarct.factory.abstractFactoryProducer;

import com.study.design.pattern.abstarct.factory.model.Color;
import com.study.design.pattern.abstarct.factory.model.Shape;

/**
 * @author rajan
 * Abstract factory producer
 * @since 30Jun2021
 */
public abstract class AbstractFactoryProducer {

	/**
	 * factory method for get color class
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);
	/**
	 * factory method for get shape class
	 * @param shape
	 * @return
	 */
	public abstract Shape getShape(String shape);
}
