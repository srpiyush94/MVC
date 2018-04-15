package com.constructor;



public class Address {

		private int id;
		private String street;     
	    private String city;     
	    private String state;    
	    private String zipcode;
		public Address(int id,String street, String city, String state, String zipcode) {
			super();
			this.id=id;
			this.street = street;
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
		}
		public String toString() {
			return "\n Address [street=" + street + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "id:"+id+ "]";
		}
		public Address() {
		
		}
	 
}
