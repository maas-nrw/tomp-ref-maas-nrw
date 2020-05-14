package org.tomp.api.configuration;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.tomp.api.model.TransportOperator;

@Component
@ConfigurationProperties(prefix = "tomp")
@Validated
public class ExternalConfiguration {

	private static final Logger log = LoggerFactory.getLogger(ExternalConfiguration.class);

	public ExternalConfiguration() {
		log.info("Configuration file");
	}

	private String lookupService;
	@NotBlank
	private String maasId;
	@NotBlank
	private String acceptLanguage;
	@NotBlank
	private String apiVersion;
	private String assetFile;
	private String systemInformationFile;
	private String conditionFile;

	private List<TransportOperator> transportOperators;
	private String fareFile;
	private String legFile;
	private String typeOfAssetFile;
	private String regionsFile;
	private String stationsFile;
	private String areaFile;
	private String bookingMailBox;
	private int expirationDays;

	private String externalUrl;
	private String currencyCode;
	private long vatRate;

	public String getLookupService() {
		return lookupService;
	}

	public void setLookupService(String lookupService) {
		this.lookupService = lookupService;
	}

	public String getMaasId() {
		return maasId;
	}

	public void setMaasId(String maasId) {
		this.maasId = maasId;
	}

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public List<TransportOperator> getTransportOperators() {
		return transportOperators;
	}

	public void setTransportOperators(List<TransportOperator> transportOperators) {
		this.transportOperators = transportOperators;
	}

	public String getAssetFile() {
		return assetFile;
	}

	public void setAssetFile(String assetFile) {
		this.assetFile = assetFile;
	}

	public void setSystemInformationFile(String file) {
		this.systemInformationFile = file;
	}

	public String getSystemInformationFile() {
		return systemInformationFile;
	}

	public String getConditionFile() {
		return conditionFile;
	}

	public void setConditionFile(String conditionFile) {
		this.conditionFile = conditionFile;
	}

	public String getFareFile() {
		return fareFile;
	}

	public void setFareFile(String fareFile) {
		this.fareFile = fareFile;
	}

	public String getOptionsLegFile() {
		return getLegFile();
	}

	public String getTypeOfAssetFile() {
		return typeOfAssetFile;
	}

	public String getLegFile() {
		return legFile;
	}

	public void setLegFile(String legFile) {
		this.legFile = legFile;
	}

	public void setTypeOfAssetFile(String typeOfAssetFile) {
		this.typeOfAssetFile = typeOfAssetFile;
	}

	public String getRegionsFile() {
		return regionsFile;
	}

	public String getStationsFile() {
		return stationsFile;
	}

	public void setRegionsFile(String regionsFile) {
		this.regionsFile = regionsFile;
	}

	public void setStationsFile(String stationsFile) {
		this.stationsFile = stationsFile;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	public String getAreaFile() {
		return areaFile;
	}

	public void setAreaFile(String areaFile) {
		this.areaFile = areaFile;
	}

	public String getBookingMailBox() {
		return bookingMailBox;
	}

	public void setBookingMailBox(String bookingMailBox) {
		this.bookingMailBox = bookingMailBox;
	}

	public int getExpirationDays() {
		return expirationDays;
	}

	public void setExpirationDays(int expirationDays) {
		this.expirationDays = expirationDays;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public long getVatRate() {
		return vatRate;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public void setVatRate(long vatRate) {
		this.vatRate = vatRate;
	}
}
