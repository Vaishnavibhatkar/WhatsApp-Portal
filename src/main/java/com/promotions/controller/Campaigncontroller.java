package com.promotions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promotions.model.CampaigneEntity;
import com.promotions.service.CampaignService;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @GetMapping("/getAll")
    public List<CampaigneEntity> getAllCampaigns() {
        return campaignService.getAllCampaigns();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CampaigneEntity> getCampaignById(@PathVariable Long id) {
        CampaigneEntity campaign = campaignService.getCampainById(id);
        return ResponseEntity.ok(campaign);
    }

    @PostMapping("/create")
    public ResponseEntity<CampaigneEntity> createCampaign(@RequestBody CampaigneEntity campaign) {
        CampaigneEntity newCampaign = campaignService.createCampaign(campaign);
        return ResponseEntity.ok(newCampaign);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CampaigneEntity> updateCampaign(
            @PathVariable Long id, 
            @RequestBody CampaigneEntity campaign) {
        CampaigneEntity updatedCampaign = campaignService.updateCampaign(id, campaign);
        return ResponseEntity.ok(updatedCampaign);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCampaign(@PathVariable Long id) {
        campaignService.deleteCampaign(id);
        return ResponseEntity.noContent().build();
    }
}
