package com.study.design.pattern.abstarct.factory;

import com.study.design.pattern.abstarct.factory.abstractFactoryProducer.AbstractFactoryProducer;
import com.study.design.pattern.abstarct.factory.model.Blue;
import com.study.design.pattern.abstarct.factory.model.Circle;
import com.study.design.pattern.abstarct.factory.model.Red;
import com.study.design.pattern.abstarct.factory.model.Triangle;

/**
 * @author rajan
 * Demo for Abstract factory design pattern
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// main factory produces color factory.
		AbstractFactoryProducer colorFactory=MainFactory.getFactoryByType("color");
		//color factory produces blue class.
		Blue blue=(Blue) colorFactory.getColor("Blue");
		blue.fill();
		//color factory produces red class.
		Red red =(Red)colorFactory.getColor("red");
		red.fill();
		
		//Main factory produces shape factory.
		AbstractFactoryProducer shapeFactory=MainFactory.getFactoryByType("shape");
		//shape factory produces circle class.
		Circle circle=(Circle)shapeFactory.getShape("circle");
		circle.draw();
		//shape factory produces triangle class.
		Triangle triangle= (Triangle)shapeFactory.getShape("triangle");
		triangle.draw();
		
	}
}
