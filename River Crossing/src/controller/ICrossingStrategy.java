package controller;


public interface ICrossingStrategy {
	public boolean isValid(java.util.List<ICrosser> right, java.util.List<ICrosser> left, java.util.List<ICrosser> boatRiders);
	public java.util.List<ICrosser> getInitialCrossers();
	public String[] getInstructions();

}
