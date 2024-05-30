package com.promotions.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotions.dao.CampaignDao;
import com.promotions.entity.Campaign;
import com.promotions.service.CampaignService;

@Service
public class CampaignImpl implements CampaignService{

	@Autowired
    private CampaignDao campaignDao;

	@Override
	public Campaign createCampaign(Campaign campaign) {
		return campaignDao.save(campaign);
	}
}
