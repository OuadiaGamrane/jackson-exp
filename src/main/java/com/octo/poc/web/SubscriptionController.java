package com.octo.poc.web;


import com.octo.poc.dto.BeneficiaireSubscription;
import com.octo.poc.dto.CarteSubscription;
import com.octo.poc.dto.Subscription;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "subscription")
public class SubscriptionController {

    @GetMapping("/subscription")
    public String subscriptions() {
        return "List of subscriptions";
    }

    @PostMapping("/subscription")
    public String subscripe(@RequestBody Subscription subscription) {

        if (subscription.getGenericSubsciptionData() instanceof BeneficiaireSubscription) {
            return "Benif";
        }

        if (subscription.getGenericSubsciptionData() instanceof CarteSubscription) {
            return "Carte";
        }

        return "default";
    }
}
