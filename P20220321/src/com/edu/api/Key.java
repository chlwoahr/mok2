package com.edu.api;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key nu = (Key) obj;
		
		if(this.number == nu.number) {
			return true;
		}
	}return false;
	}

}
