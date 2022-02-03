package io.curity.identityserver.plugin.flipkart;

import se.curity.identityserver.sdk.oauth.consent.signing.SigningConsentor;
import se.curity.identityserver.sdk.plugin.descriptor.SigningConsentorPluginDescriptor;

public final class flipkartSigningConsentorDescriptor implements SigningConsentorPluginDescriptor<flipkartConsentorConfig>
{
    @Override
    public Class<? extends SigningConsentor> getConsentorType()
    {
        return flipkartSigningConsentor.class;
    }

    @Override
    public String getPluginImplementationType()
    {
        return "flipkart";
    }

    @Override
    public Class<? extends flipkartConsentorConfig> getConfigurationType()
    {
        return flipkartConsentorConfig.class;
    }
}
