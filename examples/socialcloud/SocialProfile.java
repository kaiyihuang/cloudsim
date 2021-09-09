package socialcloud;

import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Host;

public class SocialProfile {
	public String username;
	public int social_score;
	public Host my_device;
	public List<SocialProfile> friends;
	public List<Cloudlet> my_tasks;
	
	public SocialProfile(String un, int ss)
	{
		username = un;
		social_score = ss;
	}

}
