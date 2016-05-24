

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Image image;

	public Ammo()
	{
		this(0,0,0);
		try{
			image = ImageIO.read(new File("bullet.bmp"));
		}
		catch(Exception e)
		{
			
		}
	}

	public Ammo(int x, int y)
	{
		this(x, y, 0);
		try{
			image = ImageIO.read(new File("bullet.bmp"));
		}
		catch(Exception e)
		{
			
		}
	}

	public Ammo(int x, int y, int s)
	{
		setPos(x, y);
		setSpeed(s);
		try{
			image = ImageIO.read(new File("bullet.bmp"));
		}
		catch(Exception e)
		{
			
		}
	}

	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void move(String direction)
	{
		if(direction.equals("SPACE"))
		{
			//while(getY() < 500)
				setY(getY()+getSpeed());
		}
	}

	public void draw( Graphics window )
	{
		//window.setColor(Color.RED);
		//window.fillRect(getX(), getY(), 7, 7);
		
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString()
	{
		return "Ammo " + getSpeed();
	}
}
