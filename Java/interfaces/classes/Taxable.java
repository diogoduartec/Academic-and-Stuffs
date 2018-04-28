package interfaces.classes;

/**
 * --Created by Diogo Duarte on 28/12/2017
 * --Practicing Interfaces
 * OBS:
 * -It's a collection of abstract methods
 * -May also contain constants, default methods, static methods, and nested types.
 */
public interface Taxable {
    /**public static final*/ double TAXA= 0.16;
    /**public abstract*/ void calculateTaxa();
}
