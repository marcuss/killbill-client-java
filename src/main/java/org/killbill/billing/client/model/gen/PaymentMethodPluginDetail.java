/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.client.model.gen.PluginProperty;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class PaymentMethodPluginDetail {

    private String externalPaymentMethodId = null;

    private Boolean isDefaultPaymentMethod = false;

    private List<PluginProperty> properties = null;


    public PaymentMethodPluginDetail() {
    }

    public PaymentMethodPluginDetail(final String externalPaymentMethodId,
                     final Boolean isDefaultPaymentMethod,
                     final List<PluginProperty> properties) {
        this.externalPaymentMethodId = externalPaymentMethodId;
        this.isDefaultPaymentMethod = isDefaultPaymentMethod;
        this.properties = properties;

    }


    public PaymentMethodPluginDetail setExternalPaymentMethodId(final String externalPaymentMethodId) {
        this.externalPaymentMethodId = externalPaymentMethodId;
        return this;
    }

    public String getExternalPaymentMethodId() {
        return externalPaymentMethodId;
    }

    public PaymentMethodPluginDetail setIsDefaultPaymentMethod(final Boolean isDefaultPaymentMethod) {
        this.isDefaultPaymentMethod = isDefaultPaymentMethod;
        return this;
    }

    public Boolean isDefaultPaymentMethod() {
        return isDefaultPaymentMethod;
    }

    public PaymentMethodPluginDetail setProperties(final List<PluginProperty> properties) {
        this.properties = properties;
        return this;
    }

    public PaymentMethodPluginDetail addPropertiesItem(final PluginProperty propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<PluginProperty>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public List<PluginProperty> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentMethodPluginDetail paymentMethodPluginDetail = (PaymentMethodPluginDetail) o;
        return Objects.equals(this.externalPaymentMethodId, paymentMethodPluginDetail.externalPaymentMethodId) &&
        Objects.equals(this.isDefaultPaymentMethod, paymentMethodPluginDetail.isDefaultPaymentMethod) &&
        Objects.equals(this.properties, paymentMethodPluginDetail.properties);

    }

    @Override
    public int hashCode() {
        return Objects.hash(externalPaymentMethodId,
                            isDefaultPaymentMethod,
                            properties);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentMethodPluginDetail {\n");
        
        sb.append("    externalPaymentMethodId: ").append(toIndentedString(externalPaymentMethodId)).append("\n");
        sb.append("    isDefaultPaymentMethod: ").append(toIndentedString(isDefaultPaymentMethod)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

