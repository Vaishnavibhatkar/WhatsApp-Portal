package com.promotions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter @Setter
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campaignId;

    @NotBlank(message = "Name is required")
    private String name;

    private String status;

    // New fields for campaign scheduling
    private String startDate;
    private String endDate;
    private String startTime;

    // New fields for targeting options
    private String ageRange;
    private String location;
    private String interests;

    // Existing field for WhatsApp mobile number
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid mobile number")
    private String whatsAppMob;

    @NotBlank(message = "Template is required")
    private String template;

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getWhatsAppMob() {
		return whatsAppMob;
	}

	public void setWhatsAppMob(String whatsAppMob) {
		this.whatsAppMob = whatsAppMob;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "Campaign [campaignId=" + campaignId + ", name=" + name + ", status=" + status + ", startDate="
				+ startDate + ", endDate=" + endDate + ", startTime=" + startTime + ", ageRange=" + ageRange
				+ ", location=" + location + ", interests=" + interests + ", whatsAppMob=" + whatsAppMob + ", template="
				+ template + "]";
	}

    // Constructors, getters, setters, and toString method remain unchanged
    
    
}
