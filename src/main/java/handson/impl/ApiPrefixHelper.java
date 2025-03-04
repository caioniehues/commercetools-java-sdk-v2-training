package handson.impl;

public enum ApiPrefixHelper {
    API_DEV_CLIENT_PREFIX("cn-dev-admin."),
    API_TEST_CLIENT_PREFIX("TEST_PREFIX"),
    API_DEV_IMPORT_PREFIX("cn-dev-admin."),
    API_STORE_CLIENT_PREFIX("DEV_STORE_PREFIX"),
    API_ME_CLIENT_PREFIX("DEV_ME_PREFIX"),
    API_STORE_ME_CLIENT_PREFIX("DEV_STORE_ME_PREFIX");

    private final String prefix;

    ApiPrefixHelper(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return this.prefix;
    }
}