package GUI;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Farmer {
	private Image image;
	private ImageView imageView;
	private	double x;
	private double y;
	private double w;
	private double height;
	public Farmer(Image image,double x,double y) {
		this.image=image;
		this.x=x;
		this.y=y;
		w=image.getWidth();
		height=image.getHeight();
		
				
	}
public void setImage(Image image) {
	this.image = image;
}public void setX(double x) {
	this.x = x;
}public void setHeight(double height) {
	this.height = height;
}public void setW(double w) {
	this.w = w;
}
public void setY(double y) {
	this.y = y;
}
public void remove(ImageView imagev) {
	imagev.setImage(null);
}
public void render(GraphicsContext g,ImageView imagev) {
	imagev.setImage(image);
	g.drawImage(image, x, y);
	//g.drawImage(image, 200, y);
//	g.drawImage(image,300, y);
}
public Image getImage() {
	return image;
}
}
