package org.tomp.api.operatorinformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.tomp.api.configuration.ExternalConfiguration;
import org.tomp.api.utils.ObjectFromFileProvider;

import io.swagger.model.StationInformation;
import io.swagger.model.SystemCalendar;
import io.swagger.model.SystemHours;
import io.swagger.model.SystemInformation;
import io.swagger.model.SystemPricingPlan;
import io.swagger.model.SystemRegion;
import io.swagger.model.TypeOfAsset;

@Component
@ConditionalOnProperty(value = "tomp.providers.operatorinformation", havingValue = "bike", matchIfMissing = false)
public class SimpleBikeOperatorInformationProvider implements OperatorInformationProvider {

	ExternalConfiguration configuration;

	@Autowired
	public SimpleBikeOperatorInformationProvider(ExternalConfiguration configuration) {
		this.configuration = configuration;
	}

	@Override
	public List<TypeOfAsset> getAvailableAssetTypes(String acceptLanguage) {
		ObjectFromFileProvider<TypeOfAsset[]> provider = new ObjectFromFileProvider<>();
		ArrayList<TypeOfAsset> list = new ArrayList<>();
		Collections.addAll(list, provider.getObject(acceptLanguage, TypeOfAsset[].class, configuration.getAssetFile()));
		return list;
	}

	@Override
	public SystemInformation getOperatorInformation(String acceptLanguage) {
		SystemInformation info = new SystemInformation();
		info.setSystemId("maas-3234434");
		info.setEmail("email@bike-operator.org");
		info.setLanguage(Arrays.asList(acceptLanguage));
		info.setName("Bike Operator");
		return info;
	}

	@Override
	public List<StationInformation> getStations(String acceptLanguage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SystemRegion> getRegions(String acceptLanguage) {
		ObjectFromFileProvider<SystemRegion[]> provider = new ObjectFromFileProvider<>();
		SystemRegion[] regionArray = provider.getObject(acceptLanguage, SystemRegion[].class,
				configuration.getRegionsFile());
		List<SystemRegion> regions = new ArrayList<>();
		for (int i = 0; i < regionArray.length; i++) {
			regions.add(regionArray[i]);
			System.out.println(regionArray[i].toString());
		}
		return regions;
	}

	@Override
	public List<SystemPricingPlan> getPricingPlans(String acceptLanguage) {
		return new ArrayList<>();
	}

	@Override
	public List<SystemHours> getHours(String acceptLanguage) {
		return new ArrayList<>();
	}

	@Override
	public List<SystemCalendar> getCalendar(String acceptLanguage) {
		return new ArrayList<>();
	}
}
