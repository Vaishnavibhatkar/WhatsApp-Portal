package com.promotions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promotions.entity.Campaign;


public interface CampaignDao extends JpaRepository<Campaign, Long> {
    // You can add custom query methods here if needed
}
