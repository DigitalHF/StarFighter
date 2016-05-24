

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this(x,y,10);
	}

	public Ship(int x, int y, int s)
	{
	   super(x, y);
	   speed = s;
	}
	
	public Ship(int x, int y, int w, int h)
	{
		super(x, y, w, h);
		speed=10;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/shipmy.png");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Can't find your ship image, dude!");
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void move(String direction)
	{
		if(direction.equals("LEFT")){
			setX(getX()-getSpeed());
		}
		else if(direction.equals("RIGHT")){
			setX(getX()+getSpeed());
		}
		else if(direction.equals("UP")){
			setY(getY()+getSpeed());
		}
		else if(direction.equals("DOWN")){
			setY(getY()-getSpeed());
		}
	}
	
	//@Override
	//public void keyPressed(KeyEvent e)
	//{
   	//	if (e.getKeyCode() == KeyEvent.VK_LEFT)
    //    	move("LEFT");
    //	else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
    //   	 	move("RIGHT");
    //	else if (e.getKeyCode() == KeyEvent.VK_UP)
    //   	 	move("UP");
    //	else if (e.getKeyCode() == KeyEvent.VK_DOWN)
    //    	move("DOWN");
	//}

	public void draw( Graphics window )
	{
   		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
