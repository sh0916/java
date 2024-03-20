package review;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {

	public static void main(String[] args) {
		
		String url = "https://cdn.discordapp.com/attachments/1186454147558551552/1203947811654074430/b525b7fb529992f7.jpg?ex=65e567c6&is=65d2f2c6&hm=49683db63a6a873175422d76d078070c8e5fc7bad61bc1a85b5bdfc9077a0b6f&";
		
		try {
			
			URL img = new URL(url);
			System.out.println(img);
//			String exe = img.substring( img.lastIndexOf(".") + 1 );
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
