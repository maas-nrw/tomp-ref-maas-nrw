package org.tomp.api.planning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.tomp.api.configuration.ExternalConfiguration;
import org.tomp.api.repository.DummyRepository;
import org.tomp.api.utils.ObjectFromFileProvider;

import io.swagger.model.Fare;
import io.swagger.model.TypeOfAsset;

@ConditionalOnProperty(value = "tomp.providers.planning", havingValue = "generic", matchIfMissing = true)
public class GenericPlanningProvider extends BasePlanningProvider {

	public GenericPlanningProvider(DummyRepository repository, ExternalConfiguration configuration) {
		super(repository, configuration);
	}

	@Override
	protected Fare getFare() {
		ObjectFromFileProvider<Fare> conditionFileProvider = new ObjectFromFileProvider<>();
		return conditionFileProvider.getObject("", Fare.class, configuration.getFareFile());
	}

	@Override
	protected TypeOfAsset getAssetType() {
		ObjectFromFileProvider<TypeOfAsset[]> provider = new ObjectFromFileProvider<>();
		ArrayList<TypeOfAsset> list = new ArrayList<>();
		String assetFile = configuration.getAssetFile();
		TypeOfAsset[] assets = provider.getObject("", TypeOfAsset[].class, assetFile);
		Collections.addAll(list, assets);
		int randomItem = new Random().nextInt(list.size());
		return list.get(randomItem);
	}

}
