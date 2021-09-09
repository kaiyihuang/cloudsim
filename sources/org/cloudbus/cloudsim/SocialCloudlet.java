package org.cloudbus.cloudsim;

import java.util.List;
//Written by Kaiyi :)
public class SocialCloudlet extends Cloudlet {
	
	
	public int socialId;
	public User owner;
	public int securityLevel;
	
	public SocialCloudlet(final int cloudletId,
	final long cloudletLength,
	final int pesNumber,
	final long cloudletFileSize,
	final long cloudletOutputSize,
	final UtilizationModel utilizationModelCpu,
	final UtilizationModel utilizationModelRam,
	final UtilizationModel utilizationModelBw,
	final int social_id,
	final int security_level,
	User owned,
	final boolean record) {
		super(
				cloudletId,
				cloudletLength,
				pesNumber,
				cloudletFileSize,
				cloudletOutputSize,
				utilizationModelCpu,
				utilizationModelRam,
				utilizationModelBw,
				false
				);
		this.securityLevel = security_level;
		this.socialId = social_id;
		this.owner = owned;
	}

}
