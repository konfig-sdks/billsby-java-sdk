package com.konfigthis.client;

import com.konfigthis.client.api.AddonApi;
import com.konfigthis.client.api.AllowanceApi;
import com.konfigthis.client.api.CreditnoteApi;
import com.konfigthis.client.api.CustomFieldApi;
import com.konfigthis.client.api.CustomerApi;
import com.konfigthis.client.api.InvoiceApi;
import com.konfigthis.client.api.ProductApi;
import com.konfigthis.client.api.SubscriptionApi;

public class Billsby {
    private ApiClient apiClient;
    public final AddonApi addon;
    public final AllowanceApi allowance;
    public final CreditnoteApi creditnote;
    public final CustomFieldApi customField;
    public final CustomerApi customer;
    public final InvoiceApi invoice;
    public final ProductApi product;
    public final SubscriptionApi subscription;

    public Billsby() {
        this(null);
    }

    public Billsby(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.addon = new AddonApi(this.apiClient);
        this.allowance = new AllowanceApi(this.apiClient);
        this.creditnote = new CreditnoteApi(this.apiClient);
        this.customField = new CustomFieldApi(this.apiClient);
        this.customer = new CustomerApi(this.apiClient);
        this.invoice = new InvoiceApi(this.apiClient);
        this.product = new ProductApi(this.apiClient);
        this.subscription = new SubscriptionApi(this.apiClient);
    }

}
