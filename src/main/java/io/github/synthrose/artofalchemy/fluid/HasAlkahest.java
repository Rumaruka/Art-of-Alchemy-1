package io.github.synthrose.artofalchemy.fluid;

public interface HasAlkahest {
	
	int getAlkahest();
	
	boolean setAlkahest(int amount);
	
	default boolean hasAlkahest() {
		return getAlkahest() > 0;
	}
	
	default boolean addAlkahest(int amount) {
		return setAlkahest(getAlkahest() + amount);
	}

}
