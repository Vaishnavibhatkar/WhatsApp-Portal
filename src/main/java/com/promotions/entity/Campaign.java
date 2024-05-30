package com.promotions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

	@Entity
	@Data // Lombok annotation for generating getters, setters, toString, etc.
	public class Campaign 
	{
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long campaign_Id;
		    private String name;
		    private String shedule;
		    private String status;
		    private String whatsApp_Mob;
		    private String template;
			public Long getCampaign_Id() {
				return campaign_Id;
			}
			public void setCampaign_Id(Long campaign_Id) {
				this.campaign_Id = campaign_Id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getShedule() {
				return shedule;
			}
			public void setShedule(String shedule) {
				this.shedule = shedule;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String getWhatsApp_Mob() {
				return whatsApp_Mob;
			}
			public void setWhatsApp_Mob(String whatsApp_Mob) {
				whatsApp_Mob = whatsApp_Mob;
			}
			public String getTemplate() {
				return template;
			}
			public void setTemplate(String template) {
				template = template;
			}
			@Override
			public String toString() {
				return "Campaign [campaign_Id=" + campaign_Id + ", name=" + name + ", shedule=" + shedule + ", status="
						+ status + ", WhatsApp_Mob=" + whatsApp_Mob + ", Template=" + template + "]";
			}
			public Campaign(Long campaign_Id, String name, String shedule, String status, String whatsApp_Mob,
					String template) {
				super();
				this.campaign_Id = campaign_Id;
				this.name = name;
				this.shedule = shedule;
				this.status = status;
				whatsApp_Mob = whatsApp_Mob;
				template = template;
			}
			public Campaign() {
				super();
				// TODO Auto-generated constructor stub
			}
		
		    
		}