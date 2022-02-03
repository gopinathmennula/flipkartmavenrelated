package io.curity.identityserver.plugin.flipkart;

import se.curity.identityserver.sdk.config.Configuration;
import se.curity.identityserver.sdk.config.annotation.Description;

public interface flipkartConsentorConfig extends Configuration
{
    @Description("A parameter used for demo purposes")
    Integer getDemoParameter();
}
