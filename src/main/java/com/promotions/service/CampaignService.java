package com.promotions.service;

import java.util.List;

import com.promotions.model.CampaigneEntity;

public interface CampaignService {
	
	  List<CampaigneEntity> getAllCampaigns();
	 
	  CampaigneEntity getCampainById(Long id);
	 
	  CampaigneEntity createCampaign(CampaigneEntity campaign);
	 
	  CampaigneEntity updateCampaign(Long id, CampaigneEntity campaign);
	 
	  void deleteCampaign(Long id);
	 
	 
	 
}
