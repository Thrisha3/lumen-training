package com.exercise;

import java.time.LocalDate;

//Create a Abstract Class Product with the following structure:
   public abstract class Product implements Comparable<Product> {
			private int itemCode;
			private String itemName;
			private double quantity;
			private double unitPrice;
			public double getQuantity() {
				return quantity;
			}
			public void setQuantity(double quantity) {
				this.quantity = quantity;
			}
   }
		
		//Create a Class Apparel Which extends Product with the following structure
		public class Apparel extends Product { 
			private int size;
			private String material;
			private double quantity;
			public Apparel(double quantity,int size,String material){
				this.size=size;
				this.material=material;
				this.quantity=quantity;				
			
				}
			public int getSize() {
				return size;
			}
			public void setSize(int size) {
				this.size = size;
			}
			public String getMaterial() {
				return material;
			}
			public void setMaterial(String material) {
				this.material = material;
			}
			@Override
			public int compareTo(Product o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		}

		
//			//Create another class Electronics which extends Product and the following structure
//		public class Electronics extends Product {
//			private int warrantyMonths;
//
//			}
//			
//		}
//		//Create a class FoodItem which extends Proudct and the following structure
//
//		public class FoodItem extends Product  {
//
//			private LocalDate mfgDate;
//			private LocalDate expirtyDate;
//			private boolean isVegetarian;
//			
//
//		}
//		
//
//		//Store the Elements of the Product in a List based collections
//
//		//Create a Java application to Print the Top Three Items sold in each category By Quantity.
//
//
//}
