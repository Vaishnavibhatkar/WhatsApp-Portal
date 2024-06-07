package com.promotions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promotions.model.CampaigneEntity;


public interface CampaignDao extends JpaRepository<CampaigneEntity, Long> {
    // You can add custom query methods here if needed
}
