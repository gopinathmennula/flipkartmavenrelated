package io.curity.identityserver.plugin.flipkart;

import se.curity.identityserver.sdk.oauth.consent.SigningConsentorResult;
import se.curity.identityserver.sdk.oauth.consent.signing.SigningConsentor;

public final class flipkartSigningConsentor implements SigningConsentor
{
    private final flipkartConsentorConfig _configuration;

    public flipkartSigningConsentor(flipkartConsentorConfig configuration)
    {
        _configuration = configuration;

        // See examples of consentors on GitHub: https://github.com/search?q=topic%3Aconsentor+org%3Acurityio
    }

    @Override
    public SigningConsentorResult start(String textToDisplay, String objectToSign)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public SigningConsentorResult poll()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cancel()
    {
        throw new UnsupportedOperationException();
    }
}
