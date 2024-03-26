/*
 * Billsby API
 * Billsby is a feature-rich \"Saas\" recurring payment platform, ranked as the leading subscription billing software by G2.  Billsby is designed to ensure customers can go live quickly, often within 1-2 hours.  To help facilitate this process we have a team of friendly knowledgeable advisors ready to help your business go live.      Billsby specializes in providing great customer service at an affordable price point - our technology is rated No 1 on G2 by our customers.  If you are a developer creating a solution for your customer, Billsby has a friendly well-documented API.  The Billsby team are here to provide support to developers in order to ensure a smooth migration or new system build.   Why not book a call, talk through your Billing requirements and we can let you know how we can help you transform your business..
 *
 * The version of the OpenAPI document: 1.3.5
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner;
import java.time.LocalDate;
import com.konfigthis.client.model.SubscriptionAddFeatureTagsRequest;
import com.konfigthis.client.model.SubscriptionChangePlanRequest;
import com.konfigthis.client.model.SubscriptionFeatureTagsSplitResponse;
import com.konfigthis.client.model.SubscriptionGetCountersValueResponse;
import com.konfigthis.client.model.SubscriptionGetEventLogsResponse;
import com.konfigthis.client.model.SubscriptionGetShippingAddressResponse;
import com.konfigthis.client.model.SubscriptionListSubscriptionsResponse;
import com.konfigthis.client.model.SubscriptionUpdateCounterRequest;
import com.konfigthis.client.model.SubscriptionUpdateRenewalDateRequest;
import com.konfigthis.client.model.SubscriptionUpdateShippingAddressRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionApi
 */
@Disabled
public class SubscriptionApiTest {

    private static SubscriptionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SubscriptionApi(apiClient);
    }

    /**
     * Add feature tags
     *
     * You can add feature tags to existing subscriptions using the unique subscription IDs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addFeatureTagsTest() throws ApiException {
        String companyDomain = null;
        List<String> subscriptionUniqueIds = null;
        List<String> tagNames = null;
        String response = api.addFeatureTags(companyDomain)
                .subscriptionUniqueIds(subscriptionUniqueIds)
                .tagNames(tagNames)
                .execute();
        // TODO: test validations
    }

    /**
     * Cancel a subscription
     *
     * Cancel an individual subscription using the unique identifier of the subscription in the Billsby platform
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelSubscriptionTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        String customerUniqueId = null;
        String response = api.cancelSubscription(companyDomain, subscriptionUniqueId, customerUniqueId)
                .execute();
        // TODO: test validations
    }

    /**
     * Change plan
     *
     * Change the plan that a subscription sits on
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changePlanTest() throws ApiException {
        Integer planId = null;
        Integer cycleId = null;
        String customerUniqueId = null;
        String companyDomain = null;
        String subscriptionUniqueId = null;
        Integer planChangeType = null;
        Integer units = null;
        List<CustomerAddSubscriptionToExistingCustomerRequestAddOnsInner> addOns = null;
        List<Integer> allowances = null;
        Boolean issueRefund = null;
        String response = api.changePlan(planId, cycleId, customerUniqueId, companyDomain, subscriptionUniqueId)
                .planChangeType(planChangeType)
                .units(units)
                .addOns(addOns)
                .allowances(allowances)
                .issueRefund(issueRefund)
                .execute();
        // TODO: test validations
    }

    /**
     * Feature tags by plan and custom tags
     *
     * Returns a list of feature tags in a subscription split by plan tags and custom tags
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void featureTagsSplitTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        SubscriptionFeatureTagsSplitResponse response = api.featureTagsSplit(companyDomain, subscriptionUniqueId)
                .execute();
        // TODO: test validations
    }

    /**
     * Counter value
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCountersValueTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        String counterId = null;
        LocalDate from = null;
        LocalDate to = null;
        SubscriptionGetCountersValueResponse response = api.getCountersValue(companyDomain, subscriptionUniqueId, counterId)
                .from(from)
                .to(to)
                .execute();
        // TODO: test validations
    }

    /**
     * Subscription details
     *
     * This query gets individual subscription details using the unique identifier provided in the Billsby platform
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        String response = api.getDetails(companyDomain, subscriptionUniqueId)
                .execute();
        // TODO: test validations
    }

    /**
     * Event logs
     *
     * This query returns the event logs of a subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEventLogsTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        Integer page = null;
        Integer pageSize = null;
        SubscriptionGetEventLogsResponse response = api.getEventLogs(companyDomain, subscriptionUniqueId, page, pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Shipping address
     *
     * This query gets individual subscription details using the unique identifier provided in the Billsby platform
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getShippingAddressTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        SubscriptionGetShippingAddressResponse response = api.getShippingAddress(companyDomain, subscriptionUniqueId)
                .execute();
        // TODO: test validations
    }

    /**
     * List subscriptions
     *
     * This query gets a list of all of the subscriptions in your account with their subscription IDs so that you can later lookup individual subscriptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSubscriptionsTest() throws ApiException {
        String companyDomain = null;
        Integer page = null;
        Integer pageSize = null;
        String orderBy = null;
        String orderByDescending = null;
        Boolean isActive = null;
        Boolean isInFreeTrial = null;
        String productName = null;
        String planName = null;
        SubscriptionListSubscriptionsResponse response = api.listSubscriptions(companyDomain, page, pageSize)
                .orderBy(orderBy)
                .orderByDescending(orderByDescending)
                .isActive(isActive)
                .isInFreeTrial(isInFreeTrial)
                .productName(productName)
                .planName(planName)
                .execute();
        // TODO: test validations
    }

    /**
     * Feature tags by Subscription
     *
     * This query returns a list of feature tags in a subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTagsBySubscriptionTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        List<String> response = api.listTagsBySubscription(companyDomain, subscriptionUniqueId)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete feature tag
     *
     * Delete a custom feature tag from a list of subscriptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFeatureTagTest() throws ApiException {
        String companyDomain = null;
        String tagname = null;
        String subsId = null;
        String response = api.removeFeatureTag(companyDomain, tagname)
                .subsId(subsId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update counter
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCounterTest() throws ApiException {
        String operationType = null;
        Integer value = null;
        String companyDomain = null;
        String subscriptionUniqueId = null;
        String counterId = null;
        String response = api.updateCounter(operationType, value, companyDomain, subscriptionUniqueId, counterId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update next renewal date
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRenewalDateTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        Boolean pauseSubscription = null;
        LocalDate newRenewalDate = null;
        Object response = api.updateRenewalDate(companyDomain, subscriptionUniqueId)
                .pauseSubscription(pauseSubscription)
                .newRenewalDate(newRenewalDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Update subscription shipping address
     *
     * Update the shipping address for a subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateShippingAddressTest() throws ApiException {
        String companyDomain = null;
        String subscriptionUniqueId = null;
        String addressLine1 = null;
        String addressLine2 = null;
        String state = null;
        String city = null;
        String country = null;
        String postCode = null;
        String response = api.updateShippingAddress(companyDomain, subscriptionUniqueId)
                .addressLine1(addressLine1)
                .addressLine2(addressLine2)
                .state(state)
                .city(city)
                .country(country)
                .postCode(postCode)
                .execute();
        // TODO: test validations
    }

}
