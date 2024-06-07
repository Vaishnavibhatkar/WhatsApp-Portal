package com.promotions.servicelmpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.exception.ResourceNotFoundException;
import com.promotions.dao.CampaignDao;
import com.promotions.model.CampaigneEntity;
import com.promotions.service.CampaignService;

@Service
public class CampaignServiceImpl implements CampaignService{

	@Autowired
    private CampaignDao campaignDao;

	@Override
	public List<CampaigneEntity> getAllCampaigns()
	{
		return campaignDao.findAll();
	}

	@Override
	public CampaigneEntity getCampainById(Long id)
	{
	     Optional<CampaigneEntity> optionalCampaign = campaignDao.findById(id);
	      return optionalCampaign.orElseThrow();
	  }
	
	@Override
	public CampaigneEntity createCampaign(CampaigneEntity campaign) {
		return campaignDao.save(campaign);
	}

	@Override
	public CampaigneEntity updateCampaign(Long id, CampaigneEntity updatedCampaign) {
	    // Check if the campaign exists
	    if (!campaignDao.existsById(id)) {
	        throw new ResourceNotFoundException("Campaign not found with id: " + id, null, id);
	    }
	    // Set the ID of the updated campaign to ensure it replaces the existing one
	    updatedCampaign.setCampaignId(id);
	    // Save the updated campaign
	    return campaignDao.save(updatedCampaign);
	}


	@Override
	public void deleteCampaign(Long id) {
	    campaignDao.deleteById(id);
	}

}
