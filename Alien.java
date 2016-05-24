

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.lang.Math;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(10,10,30,30,10);
	}

	public Alien(int x, int y)
	{
		this(x,y,10);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
	   	speed = s;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		URL[] url;
		speed=s;
		url = new URL[5];
		try
		{
			url[0] = getClass().getResource("/alien.jpg");
			url[1] = getClass().getResource("/alien1.jpg");
			url[2] = getClass().getResource("/alien2.jpg");
			url[3] = getClass().getResource("/alien3.jpg");
			url[4] = getClass().getResource("/alien4.jpg");
			image = ImageIO.read(url[(int)Math.round(Math.random()*4)]);
		}
		catch(Exception e)
		{
			System.out.println("Can't find your alien image, dude!");
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
		
	}

	public void draw( Graphics window )
	{
   		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
